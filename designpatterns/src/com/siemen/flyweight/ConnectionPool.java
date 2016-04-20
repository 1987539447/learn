package com.siemen.flyweight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

public class ConnectionPool {

	private String url = "";
	private String user = "";
	private String pass = "";
	private String driver = "";

	private Vector<Connection> pool;

	private int poolsize = 10;
	private ConnectionPool instance = null;
	Connection connect = null;

	private ConnectionPool() {
		pool = new Vector<Connection>(poolsize);
		for (int i = 0; i < poolsize; i++) {
			try {
				Class.forName(driver);
				connect = DriverManager.getConnection(url, user, pass);
				pool.add(connect);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public synchronized void release() {
		pool.add(connect);
	}

	public synchronized Connection getConnection() {
		if (pool.size() > 0) {
			Connection conn = pool.get(0);
			pool.remove(0);
			return conn;
		} else {
			return null;
		}
	}
}
