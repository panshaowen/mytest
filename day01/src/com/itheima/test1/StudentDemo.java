package com.itheima.test1;

import java.util.ArrayList;

/*
 * 
 * ѧ������ ���������䣬�ɼ�����
			 ������ѧ����
			 ��һ  18	88
			 �¶�  19	59
			 ����  20	99
			 ����  22	77
			 ����  30	33
			 ����  18	21
			 ����  22 55
			 �ܰ�  23 37
			 ���  22 90
			 ֣ʮ  21 89
		
		 ����Щѧ��ƽ������
		 ����Щѧ����ƽ����
		 ������Ͳ������ѧ���ֱ��Ϊ2����ͬ��С��
		 �󼰸��ѧ����ƽ����
		 �󲻼����ѧ����ƽ����
 */

public class StudentDemo {

	public static void main(String[] args) {
		ArrayList<Student> array = new ArrayList<Student>();
		
		Student s1 = new Student("��һ",18,88);
		Student s2 = new Student("�¶�",19,59);
		Student s3 = new Student("����",20,99);
		Student s4 = new Student("����",22,77);
		Student s5 = new Student("����",30,33);
		Student s6 = new Student("����",18,21);
		Student s7 = new Student("����",22,55);
		Student s8 = new Student("�ܰ�",23,37);
		Student s9 = new Student("���",22,90);
		Student s10 = new Student("֣ʮ",21,89);
		
		Student[] s = {s1,s2,s3,s4,s5,s6,s7,s8,s9,s10};
		
		for (int i = 0; i < s.length; i++) {
			array.add(s[i]);
		}
		aveagerAge(array);
		aveagerScore(array);
		System.out.println("------------�������ķָ���-------------");
		ArrayList<Student> failArray = failArray(array);
		System.out.println("------------�������ķָ���-------------");
		ArrayList<Student> passArray =passArray(array);
		System.out.println("------------�������ķָ���-------------");
		
		System.out.print("����");
		aveagerScore(passArray);
		System.out.println("------------�������ķָ���-------------");
		System.out.print("������");
		aveagerScore(failArray);
	}
	
	public static void aveagerAge(ArrayList<Student> array ){
		int totalAge = 0;
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			totalAge += s.getAge();
		}
		System.out.println("ѧ��ƽ������Ϊ:"+totalAge/array.size());
	}
	
	public static void aveagerScore(ArrayList<Student> array ){
		double totalScore = 0;
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			totalScore += s.getScorre();
		}
		System.out.println("ѧ����ƽ����Ϊ:"+totalScore/array.size());
	}

	public static ArrayList<Student> failArray(ArrayList<Student> array ){
		ArrayList<Student> failArray = new ArrayList<Student>();
		System.out.println("�������ѧ��:");
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			if(s.getScorre()<60){
				failArray.add(s);
				System.out.println(s.getName()+", "+s.getScorre()+"��");
			}
		}
		return failArray;
	}
	
	public static ArrayList<Student> passArray(ArrayList<Student> array ){
		ArrayList<Student> passArray = new ArrayList<Student>();
		System.out.println("�����ѧ��:");
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			if(s.getScorre()>=60){
				passArray.add(s);
				System.out.println(s.getName()+", "+s.getScorre()+"��");
			}
		}
		return passArray;
	}
	
	
}
