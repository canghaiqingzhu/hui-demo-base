package com.xiehui93.arithmetic;
/**
 * @Title: FactorialByNum.java 
 * @Package com.xiehui93.arithmetic 
 * @Description: TODO(��̼���N!�ֱ�ʹ�õݹ��ѭ��) 
 * @author xiehui 
 * @email xiehui93@qq.com
 * @date 2019��8��13�� ����4:26:51 
 * @version V1.0    
 */
public class FactorialByNum {

	public static void main(String[] args) {
		//�ݹ�
		long sum = recursion(10);
		//ѭ��
		long sum2 = circulation(10);
	}
	/**
	 * �ݹ�
	 * @param num
	 * @return
	 */
	private static long recursion(int num) {
		if(num > 1)
			return 1;
		else
			return num * recursion(num - 1);
	}
	/**
	 * ѭ��
	 * @param num
	 * @return
	 */
	private static long circulation(int num) {
		long sum = 1;
		for(int i = 2 ; i <= num ; i ++ ) {
			sum *= i;
		}
		return sum;
	}
}
