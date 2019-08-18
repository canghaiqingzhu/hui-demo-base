package com.xiehui93.agency;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.xiehui93.agency.api.impl.RealObject;

/**
 * @Title: DynamicProxyHandler.java 
 * @Package com.xiehui93.agency 
 * @Description: TODO(��̬����) 
 * @author xiehui 
 * @email xiehui93@qq.com
 * @date 2019��8��18�� ����11:42:00 
 * @version V1.0  
 * ����ģʽ��Ϊ���ṩ�����ͬ�Ĳ���������������������ʵ�ʡ�����Ķ�����Щ�����漰���롱ʵ�ʡ������ͨ�ţ���˴���ͨ���䵱�м��˽�ɫ��Java�Ķ�̬����ȴ����˼���ǰ����һ���������Զ�̬�ش�����������̬�ش�������������ĵ��á��ڶ�̬���������������е��ö��ᱻ�ض��򵽵�һ�ĵ��ô������ϣ����Ĺ����ǽ�ʾ���õ����Ͳ�ȷ����Ӧ�Ĳ��ԡ�  
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
		System.out.println("��������.");
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