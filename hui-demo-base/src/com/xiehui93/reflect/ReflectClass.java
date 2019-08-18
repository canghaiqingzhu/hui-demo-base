package com.xiehui93.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import sun.rmi.runtime.Log;

/**
 * @Title: ReflectClass.java 
 * @Package com.xiehui93.reflect 
 * @Description: TODO(��һ�仰�������ļ���ʲô) 
 * @author xiehui 
 * @email xiehui93@qq.com
 * @date 2019��8��18�� ����10:55:59 
 * @version V1.0    
 */
public class ReflectClass {
	private final static String TAG = "com.xiehui93.reflect.ReflectClass";
	 // ��������
    public static void reflectNewInstance() {
        try {
            Class<?> classBook = Class.forName("com.xiehui93.reflect.People");
            Object objectBook = classBook.newInstance();
            People people = (People) objectBook;
            people.setName("������");
            people.setAge(35);
            people.setEnglishName("Quliang Ying");
            people.setAddress("�ع�����������");
            people.setSex('��');
            System.out.println(people.toString());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    // ����˽�еĹ��췽��
    public static void reflectPrivateConstructor() {
        try {
            Class<?> classPeople = Class.forName("com.xiehui93.reflect.People");
            Constructor<?> declaredConstructorPeople = classPeople.getDeclaredConstructor(String.class,String.class,
            		int.class,String.class,char.class);//int��Integer������
            declaredConstructorPeople.setAccessible(true);
            Object objectPeople = declaredConstructorPeople.newInstance("����","Yang Shang",27,"�ض����� �����츮",'��');
            People people = (People) objectPeople;
            System.out.println(people.toString());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // ����˽������
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
    // ����˽�з���
    public static void reflectPrivateMethod() {
        try {
        	//ʵ����Class�����
            Class<?> classPeople = Class.forName("com.xiehui93.reflect.People");
            //�õ�user���ȫ�����ԣ����η�+����+���֣�
            Field[] userFields = classPeople.getDeclaredFields();
            Method methodPeople = classPeople.getDeclaredMethod("sayHello",int.class);
            //ȡ��Ȩ�޵ķ��ʿ���
            methodPeople.setAccessible(true);
            //ͨ������ʵ������Ķ���
            People people = (People)classPeople.newInstance();
            String fname =  "englishName";
            for (int i = 0; i <userFields.length ; i++) {//����keyset
                //�������������key��ͬ
                if (userFields[i].getName().equals(fname)){
                	//��ָ�����������(people) ��Field�����ʾ���ֶ�����Ϊָ������ֵ��
                	//userFields[i].set(people,map.get(s));
                    //����People���е�set���� ע��set����������ĸ��д
                	//������������  �������в��������ϲ������͵�class����
                    Method method = classPeople.getMethod("set" + fname.substring(0, 1).toUpperCase() + fname.substring(1), String.class);
                    //������ʵ����������������������в���������ֵvalue
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
