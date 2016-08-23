/**   
* @Title: TestTest.java 
* @Package com.hiaward.cl.oms.test.utils 
*
* @author cl   
* @date 2016年8月2日 上午10:51:50 
* @version  [版本号, 2016年8月2日]
* @see  [相关类/方法]
* @since  [产品/模块版本]
*
* @Description: TODO(用一句话描述该文件做什么) 
*
* @company Copyright (c) Hiaward Coperation.
*/

package com.hiaward.cl.oms.test.utils;
import static org.junit.Assert.*;


import org.junit.Test;

import com.hiaward.cl.oms.utils.Test1;

public class TestTest1 {

	@Test
	public void test() {
		
		int a = 1;
		int b = 2;
		assertEquals(a+b,new Test1().add(a, b));
	}

}
