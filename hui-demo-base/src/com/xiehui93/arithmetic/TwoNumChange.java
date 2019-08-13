package com.xiehui93.arithmetic;
/**
 * @Title: TwoNumChange.java 
 * @Package com.xiehui93.arithmetic 
 * @Description: TODO  不使用中间变量 把两个变量的值互换
 * @author xiehui 
 * @email xiehui93@qq.com
 * @date 2019年8月13日 下午3:54:21 
 * @version V1.0    
 */
public class TwoNumChange {

	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		a = a*b;
		b = a/b;
		a = a/b;
		System.out.println("a = " + a + "\tb = " + b);

	}

}
