package com.xiehui93.reflect;
/**
 * @Title: People.java 
 * @Package com.xiehui93.reflect 
 * @Description: TODO(反射操作bean类) 
 * @author xiehui 
 * @email xiehui93@qq.com
 * @date 2019年8月18日 上午10:49:38 
 * @version V1.0    
 */
public class People {
	private final static String TAG = "PeopleTag";
	private String name;
	private String englishName;
	private Integer age;
	private String address;
	private Character sex;
	public People() {}
	public People(String name) {
		this.name = name;
	}
	public People(String name,String englishName) {
		this.name = name;
		this.englishName = englishName;
	}
	public People(String name,int age) {
		this.name = name;
		this.age = age;
	}
	private People(String name,int age,String address,char sex) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.sex = sex;
	}

	private People(String name,String englishName,int age,String address,char sex) {
		this.name = name;
		this.age = age;
		this.englishName = englishName;
		this.address = address;
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public String getEnglishName() {
		return englishName;
	}
	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Character getSex() {
		return sex;
	}
	public void setSex(Character sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "People [name=" + name + ", englishName=" + englishName + ", age=" + age + ", address=" + address
				+ ", sex=" + sex + "]";
	}
	private String sayHello(int index) {
        String string = null;
        switch (index) {
            case 0:
                string = "Hi,my name is " + this.englishName +"!";
                break;
            case 1:
                string = "Excuse me,I'm " + this.englishName +"!What's your name?";
                break;
            default:
                string = "Is this an awkward conversation ?";
        }
        return string;
    }
}
