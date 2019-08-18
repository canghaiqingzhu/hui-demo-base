package com.xiehui93.agency.api.impl;

import com.xiehui93.agency.api.Api;

/**
 * @Title: RealObject.java 
 * @Package com.xiehui93.agency.api.impl 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author xiehui 
 * @email xiehui93@qq.com
 * @date 2019年8月18日 上午11:44:14 
 * @version V1.0    
 */
public class RealObject implements Api{

	@Override
	public void say() {
		System.out.println("Say Good By!");
	}

	@Override
	public void doStr(String str) {
		System.out.println("I want to say!" + str + " ^_^!");
	}



}
