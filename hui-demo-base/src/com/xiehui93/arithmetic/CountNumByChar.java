package com.xiehui93.arithmetic;

import java.util.Scanner;

/**
 * @Title: CountNumByChar.java 
 * @Package com.xiehui93.arithmetic 
 * @Description: TODO(����һ���ַ����ֱ�ͳ�Ƴ�����Ӣ����ĸ���ո����ֺ������ַ��ĸ�����) 
 * @author xiehui 
 * @email xiehui93@qq.com
 * @date 2019��8��13�� ����3:56:09 
 * @version V1.0    
 */
public class CountNumByChar {

	public static void main(String[] args) {
		int countNum = 0;
		int countWord = 0;
		int countBlank = 0;
		int countOther = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("�������ַ�����");
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
		System.out.println("�ַ��������ֵĸ���\t��" + countNum + "\n"
				+ "�ַ�������ĸ�ĸ���\t��" + countWord + "\n"
				+ "�ַ����пո�ĸ���\t��" + countBlank + "\n"
				+ "�ַ����������ַ��ĸ���\t��" + countOther );
	}
/**
 * ASCII ��
 * ����ASCII��Ĵ�С����0~9<A~Z<a~z��
1�����ֱ���ĸҪС���� ��7��<��F����
2������0������9ҪС������0��9˳��������� ��3��<��8�� ��
3����ĸA����ĸZҪС������A��Z˳��������硰A��<��Z�� ��
4��ͬ����ĸ�Ĵ�д��ĸ��Сд��ĸҪС32���硰A��<��a�� ��
����������ĸ��ASCII���С�� ��A��Ϊ65����a��Ϊ97����0��Ϊ 48
 */
}
