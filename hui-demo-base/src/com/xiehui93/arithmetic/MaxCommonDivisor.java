package com.xiehui93.arithmetic;
/**
 * @Title: MaxCommonDivisor.java 
 * @Package com.xiehui93.arithmetic 
 * @Description: TODO(�����������Լ��) 
 * @author xiehui 
 * @email xiehui93@qq.com
 * @date 2019��8��13�� ����4:34:25 
 * @version V1.0    
 */
public class MaxCommonDivisor {

	public static void main(String[] args) {
		int s = commonDivisor(234,99);
		System.out.println("�����������Լ��Ϊ��"+s);

	}
	private static int commonDivisor(int x, int y) {
		int divisor = 1;
		int min = Math.min(x, y);
		for(int i = 2 ; i <= min ; i ++) {
			if(x % i == 0 && y % i == 0) {
				divisor = i;
			}
		}
		return divisor;
	}
}
