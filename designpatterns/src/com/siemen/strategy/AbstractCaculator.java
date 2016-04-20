/**   
* @Title: AbstractCaculator.java
* @Package com.siemen.strategy
* @Description: TODO
* @author MR.Z
* @date 2016年4月20日 上午11:34:56
* @version V1.0   
*/

package com.siemen.strategy;

/**
* 类功能说明
* 类修改者	修改日期
* 修改说明
* <p>Title: AbstractCaculator.java</p>
* <p>Description:demos</p>
* <p>Copyright: Copyright (c) 2006</p>
* <p>Company:Mr.Z</p>
* @author siemen
* @date 2016年4月20日 上午11:34:56
* @version V1.0
*/

public class AbstractCaculator {

	public int[] split(String exp, String opt) {
		String array[] = exp.split(opt);
		int result[] = new int[2];
		result[0] = Integer.parseInt(array[0]);
		result[1] = Integer.parseInt(array[1]);
		return result;
	}

}
