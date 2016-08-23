/**   
* @Title: SysDictAction.java 
* @Package com.hiaward.cl.oms.action 
*
* @author cl   
* @date 2016年7月27日 上午9:15:30 
* @version  [1.0, 2016年7月27日]
* @see  [相关类/方法]
* @since  [产品/模块版本]
*
* @Description: 字典表辅助类提供后台字典表数据获取
*
* @company Copyright (c) Hiaward Coperation.
*/

package com.hiaward.cl.oms.action;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.hiaward.cl.oms.service.SysDictService;

/**   
* @Title: SysDictAction.java 
* @Package com.hiaward.cl.oms.action 
*
* @author cl   
* @date 2016年7月27日 上午9:15:30 
* @version  [1.0, 2016年7月27日]
* @see  [相关类/方法]
* @since  [产品/模块版本]
*
* @Description: 字典表辅助类提供后台字典表数据获取
*
* @company Copyright (c) Hiaward Coperation.
*/
@Controller
public class SysDictAction {

	@Autowired
	private SysDictService sysDictService;
	
	
	@ResponseBody
	@RequestMapping(value="getSysDict",produces = "text/html;charset=UTF-8")
	public String getSysDict(HttpServletRequest requset){
		
		String dtType = requset.getParameter("dtType");
		//requset.get
		//System.out.println(dtType);
		String result = JSON.toJSONString(sysDictService.getSysDict(dtType));
		//System.out.println(result);
		return result;
	}
}
