/**   
* @Title: UserAction.java 
* @Package com.hiaward.cl.oms.action 
*
* @author cl   
* @date 2016年7月20日
* @version  [1.0, 2016年7月20日]
* @see  
* @since  
*
* @Description: 用户管理页面
*
* @company Copyright (c) Hiaward Coperation.
*/

package com.hiaward.cl.oms.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.hiaward.cl.oms.entity.UserInfo;
import com.hiaward.cl.oms.service.UserService;

@Controller
public class UserAction {

	@Autowired
	private UserService userService;
	

	@ResponseBody
	@RequestMapping(value="toUserList",produces = "text/html;charset=UTF-8")
	public String toList(UserInfo userinfo){
		

		
		//查询所有用户
		List<UserInfo> list = userService.toList(userinfo);
		
		//设置反馈结果
		
		//反馈到前端
		return JSON.toJSONString(list);
	}
	
}
