

/**   
* @Title: func.js  
*
* @author cl   
* @date 2016年7月19日 
* @version  1.0
* @see  前置需要引入jquery
* @since  
*
* @Description: 该文件是系统通用方法合集
*
* @company Copyright (c) Hiaward Coperation.
*/


/*
 * ajax 请求类
 * 参数 URL data callfunc
 * 作者：cl
 * 时间：2016-07-19
 * version 1.0
 */
var ajaxCall = function(url,data,call){
				$.ajax({
					type:"post",
					url:url,
					data: data,
					scriptCharset: 'utf-8',
                	success: function(rst){
                    	call(rst);
                	},
                	dataType: "json"
	             });
				};

				