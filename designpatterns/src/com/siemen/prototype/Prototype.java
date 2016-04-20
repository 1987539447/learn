/**   
* @Title: Prototype.java
* @Package com.siemen.prototype
* @Description: TODO
* @author MR.Z
* @date 2016年3月31日 下午2:24:15
* @version V1.0   
*/

package com.siemen.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
* 类功能说明
* 类修改者	修改日期
* 修改说明
* <p>Title: Prototype.java</p>
* <p>Description:demos</p>
* <p>Copyright: Copyright (c) 2006</p>
* <p>Company:Mr.Z</p>
* @author siemen
* @date 2016年3月31日 下午2:24:15
* @version V1.0
*/

public class Prototype implements Cloneable, Serializable {

	private static final long seriaVersionUID = 1L;
	private String mem;
	private SerializableObject obj;

	// 浅复制，仅复制引用
	public Object clone() throws CloneNotSupportedException {
		Prototype prototype = (Prototype) super.clone();
		return prototype;
	}

	public Object deepClone() throws IOException, ClassNotFoundException {
		// 对象-对象流-字节流
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream obs = new ObjectOutputStream(bos);
		obs.writeObject(this);
		// 字节流-对象流-对象
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return ois.readObject();
	}

	public String getMem() {
		return mem;
	}

	public void setMem(String mem) {
		this.mem = mem;
	}

	public SerializableObject getObj() {
		return obj;
	}

	public void setObj(SerializableObject obj) {
		this.obj = obj;
	}
}

class SerializableObject implements Serializable {
	private static final long seriaVersionUID = 1L;
}
