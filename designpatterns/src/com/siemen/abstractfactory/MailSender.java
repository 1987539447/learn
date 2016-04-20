/**   
* @Title: MailSender.java
* @Package com.siemen.factorymethod.normal
* @Description: TODO
* @author MR.Z
* @date 2016年3月31日 上午11:06:16
* @version V1.0   
*/

package com.siemen.abstractfactory;

/**
* 类功能说明
* 类修改者	修改日期
* 修改说明
* <p>Title: MailSender.java</p>
* <p>Description:demos</p>
* <p>Copyright: Copyright (c) 2006</p>
* <p>Company:Mr.Z</p>
* @author siemen
* @date 2016年3月31日 上午11:06:16
* @version V1.0
*/

public class MailSender implements Sender {

	/* (non-Javadoc)
	 * @see com.siemen.factorymethod.normal.Sender#send()
	 */
	@Override
	public void send() {
		System.out.println("this is Mail sender");

	}

}
