package com.xiehui93.arithmetic;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Title: ReflectPrivate.java 
 * @Package com.xiehui93.arithmetic 
 * @Description: TODO(����õ�һ�����˽�з���) 
 * @author xiehui 
 * @email xiehui93@qq.com
 * @date 2019��8��14�� ����10:17:57 
 * @version V1.0    
 */
public class ReflectPrivate {

	public static void main(String[] args) {
		try {
			//�õ�test.TestClass��
			Class c=Class.forName("test.TestClass");
			//�õ�testMethod�ķ���
			Method m=c.getDeclaredMethod("testMethod", new Class[]{String.class});
			//��ӡ�����ķ�����ʾ�ַ���
			System.out.println(m.toGenericString());
			//�����������
			Object obj=m.invoke(c.newInstance(), new Object[]{"method"});
			//��ӡ���ؽ��
			System.out.println(obj);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		}


	}

}
class TestClass {
	private String testMethod(String value){
		return "test:"+value;
	}
}

