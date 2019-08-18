package com.xiehui93.agency;

import java.lang.reflect.Proxy;

import com.xiehui93.agency.api.Api;
import com.xiehui93.agency.api.impl.RealObject;

/**
 * @Title: MainTest.java 
 * @Package com.xiehui93.agency.api 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author xiehui 
 * @email xiehui93@qq.com
 * @date 2019年8月18日 上午11:48:10 
 * @version V1.0    
 */
public class MainTest {

	public static void main(String[] args) {
		RealObject real = new RealObject();
        Api proxy = (Api) Proxy.newProxyInstance(
                Api.class.getClassLoader(), new Class[] {Api.class},
                new DynamicProxyHandler(real));
        
        proxy.say();
        proxy.doStr("Hi");
        
        real = new RealObject();
        Api proxy2 = (Api) Proxy.newProxyInstance(
                Api.class.getClassLoader(), new Class[] {Api.class},
                new DynamicProxyHandler(real,new DealWith() {
					
					@Override
					public void before() {
						System.out.println("dealWith before!");
						
					}
					
					@Override
					public void after() {
						System.out.println("dealWith after!");
						
					}
				}));
        
        proxy2.say();
        proxy2.doStr("Hello");
	}

}
