package com.xiehui93.arithmetic;
/**
 * @Title: BinaryConversion.java 
 * @Package com.xiehui93.arithmetic 
 * @Description: TODO(��һ�仰�������ļ���ʲô) 
 * @author xiehui 
 * @email xiehui93@qq.com
 * @date 2019��8��14�� ����9:31:10 
 * @version V1.0    
 */
public class BinaryConversion {

	public static void main(String[] args) {
		String str="13abf";
		int len=str.length();
  
		int sum2=Integer.parseInt(str,16);
		System.out.println("����1��"+sum2);
  
//		int sum1 = 0;
//		for(int i=0;i<len;i++){
//			char c = str.charAt(len-1-i);
//			int n = Character.digit(c,16);
//		}

		// ��10���ƣ�ת������������
        // ת���ɶ�����
        System.out.println(Integer.toBinaryString(12));
        // ת����8����
        System.out.println(Integer.toOctalString(12));
        // ת����16����
        System.out.println(Integer.toHexString(12));
        
     // ����������ת��Ϊ10���� ��Ĭ��ֻ��ת2~36 ���ơ�
        // ������ת��
        System.out.println(Integer.parseInt("101", 2));
        // �������Ϊ ������ֻ����01
        //System.out.println(Integer.parseInt("21", 2));
        // 8����ת��
        System.out.println(Integer.parseInt("021", 8));
        // 16����תΪ
        System.out.println(Integer.parseInt("021", 17));
        // 5����ת��
        System.out.println(Integer.parseInt("021", 5));
        // �������Ϊ 5���ƣ�������6
        //System.out.println(Integer.parseInt("061", 5));
        // ��������ת����Χ
        //System.out.println(Integer.parseInt("021", 37));
 
        // ������������ƣ�ֻ�Ƿ�����Integer,���淵�ص���int,��Դ���֪����
        System.out.println(Integer.valueOf("010", 8));
	}

}
