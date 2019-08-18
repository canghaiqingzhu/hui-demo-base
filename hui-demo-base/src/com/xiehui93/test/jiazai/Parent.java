package com.xiehui93.test.jiazai;
/**
 * @Title: Parent.java 
 * @Package com.xiehui93.test.jiazai 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author xiehui 
 * @email xiehui93@qq.com
 * @date 2019年8月18日 下午3:27:37 
 * @version V1.0    
 */
public class Parent {
	{
		System.out.println("Parent方法块！");
	};
	static{
		System.out.println("Parent静态方法块！");
	}
	public Parent() {
		System.out.println("Parent构造方法");
	}
}
