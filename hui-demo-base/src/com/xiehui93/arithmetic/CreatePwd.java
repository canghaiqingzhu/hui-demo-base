package com.xiehui93.arithmetic;

import java.util.Random;

/**
 * @Title: CreatePwd.java 
 * @Package com.xiehui93.arithmetic 
 * @Description: TODO(Java������ɳ��Ȳ�����6��ָ�����ȵ����룬������ַ������������Сд��ĸ�����ֺ������ַ������ֵ���������) 
 * @author xiehui 
 * @email xiehui93@qq.com
 * @date 2019��8��17�� ����5:43:23 
 * @version V1.0    
 */
public class CreatePwd {

	public static void main(String[] args) {
		String password = getRandomPassword(8);
		System.out.println(password);

	}
	//��ȡ��֤�����������
	public static String getRandomPassword(int len) {
		String result = null;
		
		/*if(len >= 6) {
			for(result = makeRandomPassword(len);len >= 6;result = makeRandomPassword(len)){				
				if (result.matches(".*[a-z]{1,}.*") && result.matches(".*[A-Z]{1,}.*") && result.matches(".*d{1,}.*") && result.matches(".*[~!@#$%^&*.?]{1,}.*")) {
					return result;
				} 
			}
		}*/
		while(len>=6){
			result = makeRandomPassword(len);
			//if (result.matches(".*[a-z]{1,}.*") && result.matches(".*[A-Z]{1,}.*") && result.matches(".*d{1,}.*") && result.matches(".*[~!@#$%^&*.?]{1,}.*")) {//����4��
			if (result.matches(".*[a-z]{1,}.*") && result.matches(".*[A-Z]{1,}.*") && result.matches(".*d{1,}.*") && result.matches(".*[~!@#$%^&*.?]{1,}.*")) {//����4��
					return result;
			} 
			result = makeRandomPassword(len);
		}
		return "���Ȳ�������6λ!";
	}
	//�����������
	public static String makeRandomPassword(int len){
		char charr[] = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890~!@#$%^&*.?".toCharArray();
		//System.out.println("�ַ����鳤��:" + charr.length);	//���Կ������ô˷������ٴ�
		StringBuilder sb = new StringBuilder();
		Random r = new Random();
		
		for (int x = 0; x < len; ++x) {
			sb.append(charr[r.nextInt(charr.length)]);
		}
		return sb.toString();
	}
}
