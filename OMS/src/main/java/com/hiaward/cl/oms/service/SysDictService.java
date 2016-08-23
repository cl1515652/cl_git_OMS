/**   
* @Title: SysDictService.java 
* @Package com.hiaward.cl.oms.service 
*
* @author cl   
* @date 2016年7月27日 上午9:18:10 
* @version  [1.0, 2016年7月27日]
* @see  [相关类/方法]
* @since  [产品/模块版本]
*
* @Description: 字典表辅助类
*
* @company Copyright (c) Hiaward Coperation.
*/

package com.hiaward.cl.oms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hiaward.cl.oms.dao.SysDictMapper;
import com.hiaward.cl.oms.entity.SysDict;

/**   
* @Title: SysDictService.java 
* @Package com.hiaward.cl.oms.service 
*
* @author cl   
* @date 2016年7月27日 上午9:18:10 
* @version  [1.0, 2016年7月27日]
* @see  [相关类/方法]
* @since  [产品/模块版本]
*
* @Description: 字典表辅助类
*
* @company Copyright (c) Hiaward Coperation.
*/
@Service
public class SysDictService {

	@Autowired
	private SysDictMapper sysDictMapper;
	
	
	public List<SysDict> getSysDict(String dtType){
		
		return sysDictMapper.selectByDtType(dtType);
		
	}
	
	
}
