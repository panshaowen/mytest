package com.itheima.test1;
/*
 * 
 * ѧ������ ���������䣬�ɼ�����
	������ѧ����
		��һ 18	88
		�¶� 19	59
		����	 20	99
		����   22	77
		����	 30	33
		���� 18	21
		����  22  55
		�ܰ�  23  37
		���  22  90
		֣ʮ  21   89
	
	����Щѧ��ƽ������
	����Щѧ����ƽ����
	������Ͳ������ѧ���ֱ��Ϊ2����ͬ��С��
	�󼰸��ѧ����ƽ����
	�󲻼����ѧ����ƽ����

 */
 

public class Student {
	private String name;
	private int age ;
	private int scorre;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int age, int scorre) {
		super();
		this.name = name;
		this.age = age;
		this.scorre = scorre;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getScorre() {
		return scorre;
	}
	public void setScorre(int scorre) {
		this.scorre = scorre;
	}
	
}
