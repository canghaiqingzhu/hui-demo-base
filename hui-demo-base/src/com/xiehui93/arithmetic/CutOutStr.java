package com.xiehui93.arithmetic;

import java.io.UnsupportedEncodingException;

/**
 * @Title: CutOutStr.java 
 * @Package com.xiehui93.arithmetic 
 * @Description: TODO(��дһ����ȡ�ַ����ĺ���������Ϊһ���ַ������ֽ��������Ϊ���ֽڽ�ȡ���ַ����� ����Ҫ��֤���ֲ����ذ�����硰��ABC��4��Ӧ�ý�Ϊ����AB�������롰��ABC��DEF����6��Ӧ�����Ϊ����ABC�������ǡ���ABC+���İ����) 
 * @author xiehui 
 * @email xiehui93@qq.com
 * @date 2019��8��13�� ����5:05:51 
 * @version V1.0    
 */
public class CutOutStr {

	public static void main(String[] args) {
        String srcStr1 = "��ABC";
        String srcStr2 = "��ABC��DEF";
        splitString(srcStr1, 4);
        splitString(srcStr2, 6);
    }

    public static void splitString(String src, int len) {
        int byteNum = 0;

        if (null == src) {
            System.out.println("The source String is null!");
            return;
        }

        byteNum = src.length();
        byte bt[] = src.getBytes(); // ��Stringת����byte�ֽ�����

        if (len > byteNum) {
            len = byteNum;
        }

        System.out.println( new String(bt, 0, 1).toString());
        // �ж��Ƿ�����˽ذ룬�ذ�Ļ��ֽڶ��ڵ�ASC����С��0��ֵ
        if (bt[len] < 0) {
            String subStrx = new String(bt, 0, --len);
            System.out.println("subStrx==" + subStrx);
        } else {
            String subStrx = new String(bt, 0, len);
            System.out.println("subStrx==" + subStrx);
        }
    }


}
