package com.zhuxi.common.week2.controller;

import org.springframework.web.bind.annotation.PostMapping;

import com.bobo.common.utils.StringUtil;
/**
 * 
 * @ClassName: HeController 
 * @Description: TODO
 * @author:zx
 * @date: 2019年9月9日 上午9:07:21
 */
public class HeController {

	
    public String hello() {
		
		return "hello";
		
	}
	 @PostMapping("hello")
		public String hello(String content) {
	    	//调用工具类
	    	String html = StringUtil.toHtml(content);
	    	
	    	System.out.println(html);
			
			return "hello";
			
		}
}
