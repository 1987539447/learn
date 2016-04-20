package com.siemen.singleton;

public class Singleton {

	private static Singleton instance = null;

	private Singleton() {
	};

	/*
	 * 
	 * 
	1.静态私有，防止被引用，赋值为Null实现延迟加载
	2.静态方法创建和返回唯一实例
	3.多线程下存在问题

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	*/

	/*	
	 * 对获取创建实例方法加synchronized关键字，避免多线程问题
	 * 效率低
	 * 
	 * public static synchronized Singleton getInstance() {
			if (instance == null) {
				instance = new Singleton();
			}
			return instance;
		}
		*/

	/*
	 * 仅对创建对象操作互斥
	 * 由于JVM优化机制，会出现已经给instance分配空间但还未初始化的情况
	 * 导致多线程下获取到的实例有问题
	 * 	public static Singleton getInstance() {
			if (instance == null) {
				synchronized (instance) {
					if (instance == null) {
						instance = new Singleton();
					}
				}

			}
			return instance;
		}*/
	/*
		//通过内部静态类的方式保证实例的唯一和多线程下的互斥
		private static class SingletonFactory {
			private static Singleton instance = new Singleton();
		}

		public static Singleton getInstance() {
			return SingletonFactory.instance;
		}*/

	// 分离创建操作，提高效率和保证互斥
	private static synchronized void init() {
		instance = new Singleton();
	}

	public static Singleton getInstance() {
		if (instance == null) {
			init();

		}
		return instance;
	}

	// 保证对象序列化前后一致
	public Object readResolve() {
		return instance;
	}
}
