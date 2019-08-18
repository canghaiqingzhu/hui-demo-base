package com.xiehui93.test.jiazai;
/**
 * @Title: Son.java 
 * @Package com.xiehui93.test.jiazai 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author xiehui 
 * @email xiehui93@qq.com
 * @date 2019年8月18日 下午3:28:43 
 * @version V1.0    
 */
public class Son extends Parent{
	{
		System.out.println("Son方法块！");
	};
	static{
		System.out.println("Son静态方法块！");
	}
	public Son() {
		System.out.println("Son构造方法");
	}
}
