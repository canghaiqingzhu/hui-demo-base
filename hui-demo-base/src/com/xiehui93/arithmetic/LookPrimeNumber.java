package com.xiehui93.arithmetic;
/**
 * @Title: LookPrimeNumber.java 
 * @Package com.xiehui93.arithmetic 
 * @Description: TODO(�ж�101-200֮���ж��ٸ����������������������) 
 * @author xiehui 
 * @email xiehui93@qq.com
 * @date 2019��8��14�� ����9:36:36 
 * @version V1.0    
 * ����������ж������ķ�������һ�����ֱ�ȥ��2��sqrt(�����)������ܱ������� ���������������������֮������
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
		System.out.println( "����������: " + count);
	}
}
