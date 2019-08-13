package com.xiehui93.socket;
/**
 * @Title: Server.java 
 * @Package com.xiehui93.socket 
 * @Description: TODO(Server�˳���) 
 * @author xiehui 
 * @email xiehui93@qq.com
 * @date 2019��8��13�� ����4:58:44 
 * @version V1.0    
 * 
 * Java ��ͨ�ű�̣������(���ʴ�)����JAVA SOCKET��̣��������������ַ�����д�뱾����ʾ��
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
