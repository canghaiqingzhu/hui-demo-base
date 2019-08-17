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
 * @Description: TODO(��java �ļ���д������ �����������д��txt��Ȼ���txt�ж���) 
 * @author xiehui 
 * @email xiehui93@qq.com
 * @date 2019��8��17�� ����5:28:05 
 * @version V1.0    
 * ����ȫ������ 
����1.����10000���ε�����������ı�file.txt��
����2.��file.txt�ж�ȡ���ݲ��ҷ���Arraylist��
����3.���� ѡ�����򷽷���������
����4.д�뵽files.txt�ļ���
 */
public class ReadAndWriterByFile {

	public static void main(String[] args) {
		writerFile();
		readerFile();

	}

	//1.�����ɵ������д�뵽�ļ���
	public static void writerFile(){
		//���·��
		String filepath = System.getProperty("user.dir"); //��ǰ����·��
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
				//��int ת��Ϊ String����
				bw.write(Integer.toString(nums));
				bw.newLine();//�½�һ�� ����
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
	//2.��ȡ�ı�����
	public static void readerFile(){
		String filepath = System.getProperty("user.dir");//��ǰ����·��
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
