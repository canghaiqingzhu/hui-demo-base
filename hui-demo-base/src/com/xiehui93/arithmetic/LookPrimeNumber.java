package com.xiehui93.arithmetic;
/**
 * @Title: LookPrimeNumber.java 
 * @Package com.xiehui93.arithmetic 
 * @Description: TODO(判断101-200之间有多少个素数，并输出所有素数。) 
 * @author xiehui 
 * @email xiehui93@qq.com
 * @date 2019年8月14日 上午9:36:36 
 * @version V1.0    
 * 程序分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，如果能被整除， 则表明此数不是素数，反之是素数
 */
public class LookPrimeNumber {

	public static void main(String[] args) {
		primeNum(101,200);

	}
	private static void primeNum(int x,int y) {
		int count = 0;
		for(int i=101; i<200; i+=2) {
			boolean b = false;
			for(int j=2; j<=Math.sqrt(i); j++){
				if(i % j == 0) { 
					b = false; 
					break; 
				}else{
					b = true;
				}
			}
			if(b == true) {
				count ++;
				System.out.println(i );
			}                                  
		}
		System.out.println( "素数个数是: " + count);
	}
}
