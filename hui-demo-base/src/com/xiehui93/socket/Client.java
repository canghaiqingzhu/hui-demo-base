package com.xiehui93.socket;
/**
 * @Title: Client.java 
 * @Package com.xiehui93.socket 
 * @Description: TODO(Client端程序) 
 * @author xiehui 
 * @email xiehui93@qq.com
 * @date 2019年8月13日 下午5:01:32 
 * @version V1.0    
 * 
 * Java 的通信编程，编程题(或问答)，用JAVA SOCKET编程，读服务器几个字符，再写入本地显示？
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

