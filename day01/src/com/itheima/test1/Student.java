package com.itheima.test1;
/*
 * 
 * 学生包含 姓名，年龄，成绩属性
	有以下学生：
		刘一 18	88
		陈二 19	59
		张三	 20	99
		李四   22	77
		王五	 30	33
		赵六 18	21
		孙七  22  55
		周八  23  37
		吴九  22  90
		郑十  21   89
	
	求这些学生平均年龄
	求这些学生的平均分
	将及格和不及格的学生分别分为2个不同的小组
	求及格的学生的平均分
	求不及格的学生的平均分

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
