package com.xiehui93.arithmetic;

import java.io.UnsupportedEncodingException;

/**
 * @Title: CutOutStr.java 
 * @Package com.xiehui93.arithmetic 
 * @Description: TODO(编写一个截取字符串的函数，输入为一个字符串和字节数，输出为按字节截取的字符串。 但是要保证汉字不被截半个，如“我ABC”4，应该截为“我AB”，输入“我ABC汉DEF”，6，应该输出为“我ABC”而不是“我ABC+汉的半个”) 
 * @author xiehui 
 * @email xiehui93@qq.com
 * @date 2019年8月13日 下午5:05:51 
 * @version V1.0    
 */
public class CutOutStr {

	public static void main(String[] args) {
        String srcStr1 = "我ABC";
        String srcStr2 = "我ABC汉DEF";
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
        byte bt[] = src.getBytes(); // 将String转换成byte字节数组

        if (len > byteNum) {
            len = byteNum;
        }

        System.out.println( new String(bt, 0, 1).toString());
        // 判断是否出现了截半，截半的话字节对于的ASC码是小于0的值
        if (bt[len] < 0) {
            String subStrx = new String(bt, 0, --len);
            System.out.println("subStrx==" + subStrx);
        } else {
            String subStrx = new String(bt, 0, len);
            System.out.println("subStrx==" + subStrx);
        }
    }


}
