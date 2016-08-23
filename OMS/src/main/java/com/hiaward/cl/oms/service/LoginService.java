/**   
* @Title: LoginService.java 
* @Package com.hiaward.cl.oms.service 
*
* @author cl   
* @date 2016年7月14日 下午3:46:28 
* @version  [版本号, 2016年7月14日]
* @see  [相关类/方法]
* @since  [产品/模块版本]
*
* @Description: TODO(用一句话描述该文件做什么) 
*
* @company Copyright (c) Hiaward Coperation.
*/

package com.hiaward.cl.oms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hiaward.cl.oms.client.UserInfoMapper;
import com.hiaward.cl.oms.entity.UserInfo;
import com.hiaward.cl.oms.entity.UserInfoExample;

@Service
public class LoginService {

	@Autowired
	private UserInfoMapper userInfoMapper;
	
	public List<UserInfo> Login(UserInfo userInfo) {

		//获取用户名密码
		String userId = userInfo.getUserId();
		String password = userInfo.getPassword();
		
		//构建查询条件
		UserInfoExample uie = new UserInfoExample();
		uie.createCriteria()
		.andUserIdEqualTo(userId)
		.andPasswordEqualTo(password)
		.andStateEqualTo("1");
		;
		
		//开始查询
		List<UserInfo> list = userInfoMapper.selectByExample(uie);
		//判断查询结果
		return list;
	}
	
}
