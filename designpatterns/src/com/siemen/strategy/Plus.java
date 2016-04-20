/**   
* @Title: Plus.java
* @Package com.siemen.strategy
* @Description: TODO
* @author MR.Z
* @date 2016年4月20日 上午11:38:41
* @version V1.0   
*/

package com.siemen.strategy;

/**
* 类功能说明
* 类修改者	修改日期
* 修改说明
* <p>Title: Plus.java</p>
* <p>Description:demos</p>
* <p>Copyright: Copyright (c) 2006</p>
* <p>Company:Mr.Z</p>
* @author siemen
* @date 2016年4月20日 上午11:38:41
* @version V1.0
*/

public class Plus extends AbstractCaculator implements ICaculator {

	/* (non-Javadoc)
	 * @see com.siemen.strategy.ICaculator#caculate(java.lang.String)
	 */
	@Override
	public int caculate(String exp) {
		int arrayInt[] = split(exp, "\\+");
		return arrayInt[0] + arrayInt[1];
	}

}
