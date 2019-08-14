package com.xiehui93.arithmetic;
/**
 * @Title: BinaryConversion.java 
 * @Package com.xiehui93.arithmetic 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author xiehui 
 * @email xiehui93@qq.com
 * @date 2019年8月14日 上午9:31:10 
 * @version V1.0    
 */
public class BinaryConversion {

	public static void main(String[] args) {
		String str="13abf";
		int len=str.length();
  
		int sum2=Integer.parseInt(str,16);
		System.out.println("方法1："+sum2);
  
//		int sum1 = 0;
//		for(int i=0;i<len;i++){
//			char c = str.charAt(len-1-i);
//			int n = Character.digit(c,16);
//		}

		// 将10进制，转换成其他进制
        // 转换成二进制
        System.out.println(Integer.toBinaryString(12));
        // 转换成8进制
        System.out.println(Integer.toOctalString(12));
        // 转换成16进制
        System.out.println(Integer.toHexString(12));
        
     // 将其他进制转换为10进制 ，默认只能转2~36 进制。
        // 二进制转换
        System.out.println(Integer.parseInt("101", 2));
        // 会出错，因为 二进制只能有01
        //System.out.println(Integer.parseInt("21", 2));
        // 8进制转换
        System.out.println(Integer.parseInt("021", 8));
        // 16进制转为
        System.out.println(Integer.parseInt("021", 17));
        // 5进制转换
        System.out.println(Integer.parseInt("021", 5));
        // 会出错，因为 5进制，不能有6
        //System.out.println(Integer.parseInt("061", 5));
        // 出错，超出转换范围
        //System.out.println(Integer.parseInt("021", 37));
 
        // 这个和上面类似，只是返回是Integer,上面返回的是int,看源码就知道了
        System.out.println(Integer.valueOf("010", 8));
	}

}
