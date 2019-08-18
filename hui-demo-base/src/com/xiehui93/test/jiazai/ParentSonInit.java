package com.xiehui93.test.jiazai;
/**
 * @Title: ParentSonInit.java 
 * @Package com.xiehui93.test 
 * @Description: TODO(父子初始化顺序) 
 * @author xiehui 
 * @email xiehui93@qq.com
 * @date 2019年8月18日 下午3:23:41 
 * @version V1.0    
 */
public class ParentSonInit {
	public static void main(String[] args) {
		new Son();
/*
Parent静态方法块！
Son静态方法块！
Parent方法块！
Parent构造方法
Son方法块！
Son构造方法

 */
	}

}
