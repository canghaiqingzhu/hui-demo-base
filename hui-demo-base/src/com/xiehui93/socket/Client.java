package com.xiehui93.socket;
/**
 * @Title: Client.java 
 * @Package com.xiehui93.socket 
 * @Description: TODO(Client�˳���) 
 * @author xiehui 
 * @email xiehui93@qq.com
 * @date 2019��8��13�� ����5:01:32 
 * @version V1.0    
 * 
 * Java ��ͨ�ű�̣������(���ʴ�)����JAVA SOCKET��̣��������������ַ�����д�뱾����ʾ��
 */
import java.io.*;
import java.net.*; 
public class Client{
	Socket socket;
	BufferedReader in;
	PrintWriter out;
	public Client(){
		try{
			System.out.println("Try to Connect to 127.0.0.1:10000");
			socket = new Socket("127.0.0.1",10000);
			System.out.println("The Server Connected!");
			System.out.println("Please enter some Character:");
			BufferedReader line = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(socket.getOutputStream(),true);
			out.println(line.readLine());
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			System.out.println(in.readLine());
   
		}catch(IOException e){
			out.println("Wrong");
		}finally {
			out.close();
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args){
		new Client();
	}
}

