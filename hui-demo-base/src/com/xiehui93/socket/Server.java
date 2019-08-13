package com.xiehui93.socket;
/**
 * @Title: Server.java 
 * @Package com.xiehui93.socket 
 * @Description: TODO(Server端程序) 
 * @author xiehui 
 * @email xiehui93@qq.com
 * @date 2019年8月13日 下午4:58:44 
 * @version V1.0    
 * 
 * Java 的通信编程，编程题(或问答)，用JAVA SOCKET编程，读服务器几个字符，再写入本地显示？
 */
import java.net.*;
import java.io.*; 
public class Server{
	private ServerSocket ss;
	private Socket socket;
	private BufferedReader in;
	private PrintWriter out;
	public Server(){
		try{
			ss=new ServerSocket(10000);
			while(true) {
				socket = ss.accept();
				String RemoteIP = socket.getInetAddress().getHostAddress();
				String RemotePort = ":"+socket.getLocalPort();
				System.out.println("A client come in!IP:"+RemoteIP+RemotePort);
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String line = in.readLine();
				System.out.println("Cleint send is :" + line);
				out = new PrintWriter(socket.getOutputStream(),true);
				out.println("Your Message Received!");
				
			}
		}catch (IOException e){
			out.println("wrong");
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
		new Server();
	}
}
