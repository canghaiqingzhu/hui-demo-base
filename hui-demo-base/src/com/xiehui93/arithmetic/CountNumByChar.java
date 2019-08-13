package com.xiehui93.arithmetic;

import java.util.Scanner;

/**
 * @Title: CountNumByChar.java 
 * @Package com.xiehui93.arithmetic 
 * @Description: TODO(输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。) 
 * @author xiehui 
 * @email xiehui93@qq.com
 * @date 2019年8月13日 下午3:56:09 
 * @version V1.0    
 */
public class CountNumByChar {

	public static void main(String[] args) {
		int countNum = 0;
		int countWord = 0;
		int countBlank = 0;
		int countOther = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("请输入字符串：");
		String str = in.nextLine();
		char[] ch = str.toCharArray();
		for(int i = 0 ; i < str.length() ; i ++ ) {
			if(ch[i] >='0' && ch[i] <= '9') {//if(ch[i] >= 48 && ch[i] <= 57)
				countNum ++;
			}else if((ch[i] >= 'a' && ch[i] <= 'z')||(ch[i] >= 'A' && ch[i] <= 'Z')) {
				//if((ch[i] >= 97 && ch[i] <= 122 )||(ch[i] >= 65'A' && ch[i] <= 90)) 
				countWord ++;
			}else if(ch[i] == ' ') {//if(ch[i] == 32)
				countBlank ++;
			}else {
				countOther ++;
			}
		}
		System.out.println("字符串中数字的个数\t：" + countNum + "\n"
				+ "字符串中字母的个数\t：" + countWord + "\n"
				+ "字符串中空格的个数\t：" + countBlank + "\n"
				+ "字符串中其他字符的个数\t：" + countOther );
	}
/**
 * ASCII 表
 * 常见ASCII码的大小规则：0~9<A~Z<a~z。
1）数字比字母要小。如 “7”<“F”；
2）数字0比数字9要小，并按0到9顺序递增。如 “3”<“8” ；
3）字母A比字母Z要小，并按A到Z顺序递增。如“A”<“Z” ；
4）同个字母的大写字母比小写字母要小32。如“A”<“a” 。
几个常见字母的ASCII码大小： “A”为65；“a”为97；“0”为 48
 */
}
