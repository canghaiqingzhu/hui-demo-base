package com.xiehui93.arithmetic;
/**
 * @Title: FactorialByNum.java 
 * @Package com.xiehui93.arithmetic 
 * @Description: TODO(编程计算N!分别使用递归和循环) 
 * @author xiehui 
 * @email xiehui93@qq.com
 * @date 2019年8月13日 下午4:26:51 
 * @version V1.0    
 */
public class FactorialByNum {

	public static void main(String[] args) {
		//递归
		long sum = recursion(10);
		//循环
		long sum2 = circulation(10);
	}
	/**
	 * 递归
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
	 * 循环
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
