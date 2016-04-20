/**   
* @Title: SmsFactory.java
* @Package com.siemen.factorymethod.abstrac
* @Description: TODO
* @author MR.Z
* @date 2016年3月31日 上午11:21:32
* @version V1.0   
*/

package com.siemen.abstractfactory;

/**
* 类功能说明
* 类修改者	修改日期
* 修改说明
* <p>Title: SmsFactory.java</p>
* <p>Description:demos</p>
* <p>Copyright: Copyright (c) 2006</p>
* <p>Company:Mr.Z</p>
* @author siemen
* @date 2016年3月31日 上午11:21:32
* @version V1.0
*/

public class SmsFactory implements Provider {

	/* (non-Javadoc)
	 * @see com.siemen.factorymethod.abstrac.Provider#produce()
	 */
	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new SmsSender();
	}

}
