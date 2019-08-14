package com.xiehui93.arithmetic;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Title: ReflectPrivate.java 
 * @Package com.xiehui93.arithmetic 
 * @Description: TODO(反射得到一个类的私有方法) 
 * @author xiehui 
 * @email xiehui93@qq.com
 * @date 2019年8月14日 上午10:17:57 
 * @version V1.0    
 */
public class ReflectPrivate {

	public static void main(String[] args) {
		try {
			//得到test.TestClass类
			Class c=Class.forName("test.TestClass");
			//得到testMethod的方法
			Method m=c.getDeclaredMethod("testMethod", new Class[]{String.class});
			//打印完整的方法表示字符串
			System.out.println(m.toGenericString());
			//调用这个方法
			Object obj=m.invoke(c.newInstance(), new Object[]{"method"});
			//打印返回结果
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

