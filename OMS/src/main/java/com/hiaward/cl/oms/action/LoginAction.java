/**
* @Title: LoginAction.java
* @Package com.hiaward.cl.oms.action
*
* @author cl
* @date 2016年7月14日 下午3:43:53
* @version  [1.0, 2016年7月14日]
* @see  [相关类/方法]
* @since  [产品/模块版本]
*
* @Description: 登录请求页面
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
import com.hiaward.cl.oms.service.LoginService;

@Controller
public class LoginAction {

	@Autowired
	private LoginService loginService;

	@ResponseBody
	@RequestMapping(value="login")
	public String Login(UserInfo userInfo,HttpSession session){

		//System.out.println("in here");
		//查询用户
		List<UserInfo> list = loginService.Login(userInfo);

		//设置反馈结果
		Map<String,String> rst = new HashMap<String,String>();
		if(list.size() == 0){
			rst.put("login", "false");
		}else{
			UserInfo u = list.get(0);
			rst.put("login", "true");

			session.setAttribute("username",list.get(0).getUserName());
			session.setAttribute("userid",list.get(0).getUserId());
			session.setAttribute("userrole",list.get(0).getRole());

		}

		//反馈到前端
		return JSON.toJSONString(rst);
	}

	@RequestMapping(value="toMain")
	public String  MainPage(HttpSession session){

		String userid = (String)session.getAttribute("userid");

		if(null == userid || "".equals(userid)){
			return "redirect:/page2/pages/login.html";
		}else{
			return "redirect:/page2/pages/main.html";
		}

	}

	@ResponseBody
	@RequestMapping(value="getLoginInfo",produces = "text/html;charset=UTF-8")
	public String  getLoginInfo(HttpSession session){

		String username = (String) session.getAttribute("username");
		String userrole = (String)session.getAttribute("userrole");
		Map<String,String> m = new HashMap<String,String>();
		m.put("username", username);
		m.put("userrole", userrole);

		return JSON.toJSONString(m);
	}

}
