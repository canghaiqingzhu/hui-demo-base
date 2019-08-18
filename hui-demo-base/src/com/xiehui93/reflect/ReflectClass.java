package com.xiehui93.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import sun.rmi.runtime.Log;

/**
 * @Title: ReflectClass.java 
 * @Package com.xiehui93.reflect 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author xiehui 
 * @email xiehui93@qq.com
 * @date 2019年8月18日 上午10:55:59 
 * @version V1.0    
 */
public class ReflectClass {
	private final static String TAG = "com.xiehui93.reflect.ReflectClass";
	 // 创建对象
    public static void reflectNewInstance() {
        try {
            Class<?> classBook = Class.forName("com.xiehui93.reflect.People");
            Object objectBook = classBook.newInstance();
            People people = (People) objectBook;
            people.setName("嬴渠梁");
            people.setAge(35);
            people.setEnglishName("Quliang Ying");
            people.setAddress("秦国咸阳王宫！");
            people.setSex('男');
            System.out.println(people.toString());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    // 反射私有的构造方法
    public static void reflectPrivateConstructor() {
        try {
            Class<?> classPeople = Class.forName("com.xiehui93.reflect.People");
            Constructor<?> declaredConstructorPeople = classPeople.getDeclaredConstructor(String.class,String.class,
            		int.class,String.class,char.class);//int与Integer有区别
            declaredConstructorPeople.setAccessible(true);
            Object objectPeople = declaredConstructorPeople.newInstance("商鞅","Yang Shang",27,"秦都咸阳 大良造府",'男');
            People people = (People) objectPeople;
            System.out.println(people.toString());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // 反射私有属性
    public static void reflectPrivateField() {
        try {
            Class<?> classPeople = Class.forName("com.xiehui93.reflect.People");
            Object objectPeople = classPeople.newInstance();
            Field fieldTag = classPeople.getDeclaredField("TAG");
            fieldTag.setAccessible(true);
            String tag = (String) fieldTag.get(objectPeople);
            System.out.println("reflectPrivateField tag = " + tag);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    // 反射私有方法
    public static void reflectPrivateMethod() {
        try {
        	//实例化Class类对象
            Class<?> classPeople = Class.forName("com.xiehui93.reflect.People");
            //得到user类的全部属性（修饰符+类型+名字）
            Field[] userFields = classPeople.getDeclaredFields();
            Method methodPeople = classPeople.getDeclaredMethod("sayHello",int.class);
            //取消权限的访问控制
            methodPeople.setAccessible(true);
            //通过反射实例化类的对象
            People people = (People)classPeople.newInstance();
            String fname =  "englishName";
            for (int i = 0; i <userFields.length ; i++) {//遍历keyset
                //如果有属性名和key相同
                if (userFields[i].getName().equals(fname)){
                	//将指定对象变量上(people) 此Field对象表示的字段设置为指定的新值。
                	//userFields[i].set(people,map.get(s));
                    //调用People类中的set方法 注意set方法后面字母大写
                	//参数：方法名  若方法有参数，加上参数类型的class对象
                    Method method = classPeople.getMethod("set" + fname.substring(0, 1).toUpperCase() + fname.substring(1), String.class);
                    //参数：实例化出来的类对象，若方法有参数，加上值value
                    method.invoke(people,"China");
                }
               
            }
            String string = (String) methodPeople.invoke(people,0);

            System.out.println("reflectPrivateMethod string = " + string);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
    	//reflectNewInstance();
    	//reflectPrivateConstructor();
    	//reflectPrivateField();
    	reflectPrivateMethod();
	}
}
