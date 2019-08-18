package com.xiehui93.agency;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.xiehui93.agency.api.impl.RealObject;

/**
 * @Title: DynamicProxyHandler.java 
 * @Package com.xiehui93.agency 
 * @Description: TODO(动态代理) 
 * @author xiehui 
 * @email xiehui93@qq.com
 * @date 2019年8月18日 上午11:42:00 
 * @version V1.0  
 * 代理模式是为了提供额外或不同的操作，而插入的用来替代”实际”对象的对象，这些操作涉及到与”实际”对象的通信，因此代理通常充当中间人角色。Java的动态代理比代理的思想更前进了一步，它可以动态地创建并代理并动态地处理对所代理方法的调用。在动态代理上所做的所有调用都会被重定向到单一的调用处理器上，它的工作是揭示调用的类型并确定相应的策略。  
 */
public class DynamicProxyHandler implements InvocationHandler{
	private Object proxyed;
    private DealWith dw = null;
    public DynamicProxyHandler(Object proxyed) {
        this.proxyed = proxyed;
    }
    public DynamicProxyHandler(Object proxyed,DealWith dealWith) {
        this.proxyed = proxyed;
        this.dw = dealWith;
    }
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("代理工作了.");
		if(dw != null) {
			dw.before();
		}
		try {
			return method.invoke(proxyed, args);
		}finally{
			if(dw != null) {
				dw.after();
			}
		}
	}
}