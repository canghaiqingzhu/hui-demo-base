package com.xiehui93.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 * @Title: ReadAndWriterByFile.java 
 * @Package com.xiehui93.io 
 * @Description: TODO(【java 文件读写操作】 生成随机数，写入txt，然后从txt中读出) 
 * @author xiehui 
 * @email xiehui93@qq.com
 * @date 2019年8月17日 下午5:28:05 
 * @version V1.0    
 * 贴出全部代码 
　　1.生成10000整形的随机数存入文本file.txt中
　　2.从file.txt中读取数据并且放入Arraylist中
　　3.排序 选择排序方法进行排序
　　4.写入到files.txt文件中
 */
public class ReadAndWriterByFile {

	public static void main(String[] args) {
		writerFile();
		readerFile();

	}

	//1.把生成的随机数写入到文件中
	public static void writerFile(){
		//获得路径
		String filepath = System.getProperty("user.dir"); //当前工程路径
		filepath += "\\file.txt";
		File file = new File(filepath);
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(file));
			Random random = new Random();
			for(int i=0;i<10000;i++){
				int nums = Math.round(random.nextFloat()*1000.0f);
				//将int 转化为 String类型
				bw.write(Integer.toString(nums));
				bw.newLine();//新建一行 换行
			}   
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(bw!=null)
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
	}
	//2.读取文本数据
	public static void readerFile(){
		String filepath = System.getProperty("user.dir");//当前工程路径
		filepath += "\\file.txt";
		File file = new File(filepath);
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
			String tmp;
			while((tmp = br.readLine()) != null){
				System.out.println(tmp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(br!=null)
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
