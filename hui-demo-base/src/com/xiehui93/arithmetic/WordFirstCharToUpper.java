package com.xiehui93.arithmetic;
/**
 * @Title: WordFirstCharToUpper.java 
 * @Package com.xiehui93.arithmetic 
 * @Description: TODO(һ��Ӣ�ģ�ÿ����������ĸ��д) 
 * @author xiehui 
 * @email xiehui93@qq.com
 * @date 2019��8��13�� ����4:16:32 
 * @version V1.0    
 */
public class WordFirstCharToUpper {

	public static void main(String[] args) {
		String str = new String("this is a test");
		char [] c =  new char[str.length()];
		str.getChars(0, str.length(), c, 0);
		if(c[0] >= 'a' && c[0] <= 'z') {
			c[0] = (char)(c[0] - 32);
		}
		for(int i = 1; i < str.length() ; i ++ ) {
			if(c[i] == ' ' && c[i+1] != ' ') {
				c[i + 1] = (char)(c[i + 1] - 32);
			}
		}
		str = new String(c);
		System.out.println("Str:"+str);
	}

}
