package com.xiehui93.arithmetic;
/**
 * @Title: FlashbackOutputString.java 
 * @Package com.xiehui93.arithmetic 
 * @Description: TODO(倒叙输出一组字符串) 
 * @author xiehui 
 * @email xiehui93@qq.com
 * @date 2019年8月13日 下午4:50:32 
 * @version V1.0    
 */
public class FlashbackOutputString {

	public static void main(String[] args) {
		System.out.println(fkashBack("I like China!"));

	}
	private static String fkashBack(String origin) {
		String result = "";
		for(int i = origin.length() ; i > 0 ; i --) {
			String tmp = origin.substring(i - 1,i);
			result += tmp;
		}
		return result;
	}
}
