package com.xiehui93.arithmetic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

/**
 * @Title: CopyFile.java 
 * @Package com.xiehui93.arithmetic 
 * @Description: TODO(���ʵ���ļ�����) 
 * @author xiehui 
 * @email xiehui93@qq.com
 * @date 2019��8��14�� ����10:15:27 
 * @version V1.0    
 */
public class CopyFile {

	public static void main(String[] args) {
		try{
            File oldfile = new File( "D:/License.txt");
            if ( oldfile.exists() ){ //�ļ�����ʱ
               InputStream inStream = new FileInputStream( "D:/License.txt" ); //����ԭ�ļ�
                FileOutputStream fs = new FileOutputStream( "E:/gfsgdfgdf.txt" );
               byte[] buffer = new byte[ 1024 ];
                int len;
               while ( ( len = inStream.read( buffer ) ) != -1 ){                                       
                   fs.write( buffer, 0, len );
                }
                inStream.close();
            }
        }
        catch ( Exception e ){
            System.out.println( "���Ƶ����ļ���������" );
            e.printStackTrace();             
        }


	}

}
