package com.itheima.test1;

import java.util.ArrayList;

/*
 * 
 * 学生包含 姓名，年龄，成绩属性
			 有以下学生：
			 刘一  18	88
			 陈二  19	59
			 张三  20	99
			 李四  22	77
			 王五  30	33
			 赵六  18	21
			 孙七  22 55
			 周八  23 37
			 吴九  22 90
			 郑十  21 89
		
		 求这些学生平均年龄
		 求这些学生的平均分
		 将及格和不及格的学生分别分为2个不同的小组
		 求及格的学生的平均分
		 求不及格的学生的平均分
 */

public class StudentDemo {

	public static void main(String[] args) {
		ArrayList<Student> array = new ArrayList<Student>();
		
		Student s1 = new Student("刘一",18,88);
		Student s2 = new Student("陈二",19,59);
		Student s3 = new Student("张三",20,99);
		Student s4 = new Student("李四",22,77);
		Student s5 = new Student("王五",30,33);
		Student s6 = new Student("赵六",18,21);
		Student s7 = new Student("孙七",22,55);
		Student s8 = new Student("周八",23,37);
		Student s9 = new Student("吴九",22,90);
		Student s10 = new Student("郑十",21,89);
		
		Student[] s = {s1,s2,s3,s4,s5,s6,s7,s8,s9,s10};
		
		for (int i = 0; i < s.length; i++) {
			array.add(s[i]);
		}
		aveagerAge(array);
		aveagerScore(array);
		System.out.println("------------华丽丽的分割线-------------");
		ArrayList<Student> failArray = failArray(array);
		System.out.println("------------华丽丽的分割线-------------");
		ArrayList<Student> passArray =passArray(array);
		System.out.println("------------华丽丽的分割线-------------");
		
		System.out.print("及格");
		aveagerScore(passArray);
		System.out.println("------------华丽丽的分割线-------------");
		System.out.print("不及格");
		aveagerScore(failArray);
	}
	
	public static void aveagerAge(ArrayList<Student> array ){
		int totalAge = 0;
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			totalAge += s.getAge();
		}
		System.out.println("学生平均年龄为:"+totalAge/array.size());
	}
	
	public static void aveagerScore(ArrayList<Student> array ){
		double totalScore = 0;
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			totalScore += s.getScorre();
		}
		System.out.println("学生的平均分为:"+totalScore/array.size());
	}

	public static ArrayList<Student> failArray(ArrayList<Student> array ){
		ArrayList<Student> failArray = new ArrayList<Student>();
		System.out.println("不及格的学生:");
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			if(s.getScorre()<60){
				failArray.add(s);
				System.out.println(s.getName()+", "+s.getScorre()+"分");
			}
		}
		return failArray;
	}
	
	public static ArrayList<Student> passArray(ArrayList<Student> array ){
		ArrayList<Student> passArray = new ArrayList<Student>();
		System.out.println("及格的学生:");
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			if(s.getScorre()>=60){
				passArray.add(s);
				System.out.println(s.getName()+", "+s.getScorre()+"分");
			}
		}
		return passArray;
	}
	
	
}
