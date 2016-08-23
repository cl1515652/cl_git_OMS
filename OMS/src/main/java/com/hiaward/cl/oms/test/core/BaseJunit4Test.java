/**
* @Title: BaseJunit4Test.java
* @Package com.hiaward.cl.oms.core
*
* @author cl
* @date 2016年8月2日 上午9:12:30
* @version  [1.0, 2016年8月2日]
* @see  [相关类/方法]
* @since  [产品/模块版本]
*
* @Description: 测试组件核心类所有的测试类继承该类 该类加载配置文件
*
* @company Copyright (c) Hiaward Coperation.
*/

package com.hiaward.cl.oms.test.core;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
* @Title: BaseJunit4Test.java
* @Package com.hiaward.cl.oms.core
*
* @author cl
* @date 2016年8月2日 上午9:12:30
* @version  [1.0, 2016年8月2日]
* @see  [相关类/方法]
* @since  [产品/模块版本]
*
* @Description: 测试组件核心类所有的测试类继承该类 该类加载配置文件
*
* @company Copyright (c) Hiaward Coperation.
*/

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)  //使用junit4进行测试
@ContextConfiguration({"file:src/main/resources/spring/spring*.xml"}) //加载配置文件
public class BaseJunit4Test {

	// 模拟request,response
	protected MockHttpServletRequest request;
    protected MockHttpServletResponse response;
	protected WebApplicationContext wac;
	protected MockMvc mvc;

    // 执行测试方法之前初始化模拟request,response
    @Before
    public void setUp(){
        request = new MockHttpServletRequest();
        request.setCharacterEncoding("UTF-8");
        response = new MockHttpServletResponse();
        this.mvc=MockMvcBuilders.webAppContextSetup(wac).build();
    }

}
