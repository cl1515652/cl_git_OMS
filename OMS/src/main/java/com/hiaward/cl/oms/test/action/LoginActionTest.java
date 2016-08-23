/**
* @Title: LoginActionTest.java
* @Package com.hiaward.cl.oms.action
*
* @author cl
* @date 2016年8月2日 上午9:21:08
* @version  [版本号, 2016年8月2日]
* @see  [相关类/方法]
* @since  [产品/模块版本]
*
* @Description: TODO(用一句话描述该文件做什么)
*
* @company Copyright (c) Hiaward Coperation.
*/

package com.hiaward.cl.oms.test.action;

import static org.junit.Assert.*;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hiaward.cl.oms.action.LoginAction;
import com.hiaward.cl.oms.core.BaseJunit4Test;
import com.hiaward.cl.oms.entity.UserInfo;

public class LoginActionTest extends BaseJunit4Test {

	@Autowired
	private LoginAction loginAction;

	@Test
	public void testLogin() {
		try{
			UserInfo userInfo = new UserInfo();
			userInfo.setUserId("cl");
			userInfo.setPassword("cl");

			assertEquals("login",loginAction.Login(userInfo,request.getSession()));
		 } catch (Exception e) {
	         e.printStackTrace();
	     }
		//fail("Not yet implemented");
	}

	@Test
	public void testMainPage() {
		//fail("Not yet implemented");
	}

	@Test
	public void testGetLoginInfo() {
		//fail("Not yet implemented");
	}

}
