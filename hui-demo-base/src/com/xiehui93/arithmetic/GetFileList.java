package com.xiehui93.arithmetic;

import java.io.File;

/**
 * @Title: GetFileList.java 
 * @Package com.xiehui93.arithmetic 
 * @Description: TODO(目录下所有的文件) 
 * @author xiehui 
 * @email xiehui93@qq.com
 * @date 2019年8月14日 上午10:14:15 
 * @version V1.0    
 */
public class GetFileList {

	public static void main(String[] args) {
		File f = new File("/Users/Hao/Downloads");
        for(File temp : f.listFiles()) {
            if(temp.isFile()) {
                System.out.println(temp.getName());
            }
        }


	}

}
