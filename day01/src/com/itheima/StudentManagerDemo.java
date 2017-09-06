package com.itheima;

import java.util.ArrayList;
import java.util.Scanner;



public class StudentManagerDemo {
	public static void main(String[] args) {
		ArrayList<Student> array = new ArrayList<Student>();

		while (true) {
			System.out.println("----------欢迎来到学生管理系统----------");
			System.out.println("1 查看所有学生");
			System.out.println("2 添加学生");
			System.out.println("3 删除学生");
			System.out.println("4 修改学生");
			System.out.println("5 退出");
			System.out.println("请输入你的选择");

			Scanner sc = new Scanner(System.in);

			String s = sc.nextLine();

			switch (s) {
			case "1":
				findAllStudent(array);
				break;
			case "2":
				addStudent(array);
				break;
			case "3":
				deleteStudent(array);
				break;
			case "4":
				updateStudet(array);
				break;
			case "5":
				System.out.println("谢谢您的使用");
				System.exit(1);
				break;
			default:
				System.out.println("你的选择有误,请重新输入");
				break;
			}
		}
	}

	public static void addStudent(ArrayList<Student> array) {
		// ArrayList<Student> array = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		String id;
		while (true) {
			System.out.println("请输入学生学号:");
			id = sc.nextLine();
			boolean flag = false;
			for (int i = 0; i < array.size(); i++) {
				Student s = array.get(i);
				if (s.getId().equals(id)) {
					System.out.println("你输入的学号已被使用,请重新输入");
					flag = true;
					break;
				}
			}
			if (!flag) {
				break;
			}
		}
		System.out.println("请输入学生姓名:");
		String name = sc.nextLine();
		System.out.println("请输入学生年龄:");
		String age = sc.nextLine();
		System.out.println("请输入学生住址:");
		String address = sc.nextLine();
		Student ss = new Student();
		ss.setId(id);
		ss.setName(name);
		ss.setAge(age);
		ss.setAddress(address);
		array.add(ss);
		System.out.println("添加成功");
	}

	public static void findAllStudent(ArrayList<Student> array) {

		if (array.size() != 0) {
			System.out.println("学号" + "\t\t" + "姓名" + "\t" + "年龄" + "\t" + "住址");
			for (int i = 0; i < array.size(); i++) {
				Student s = array.get(i);
				System.out.println(s.getId() + "\t\t" + s.getName() + "\t"
						+ s.getAge() + "\t" + s.getAddress());
			}			
		}else{
			System.out.println("目前没有学生,请先添加学生");
		}
	}

	public static void deleteStudent(ArrayList<Student> array){
		Scanner sc = new Scanner(System.in);
	
    	int index =-1;
		System.out.println("请输入要删除的学生的学号:");
		String id = sc.nextLine();
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			if(s.getId().equals(id)){
				index = i;
				break;
			}
		}
		if(index == -1){
			System.out.println("你输入的学号不存在,请回去重新选择你的需求");				
		}else{
			array.remove(index);
			System.out.println("删除学生成功");				
		}		
	}
	
	public static void updateStudet(ArrayList<Student> array){
		Scanner sc = new Scanner(System.in);
		
    	int index =-1;
		System.out.println("请输入要修改的学生的学号:");
		String id = sc.nextLine();
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			if(s.getId().equals(id)){
				index = i;
				break;
			}
		}
		if(index == -1){
			System.out.println("你输入的学号不存在,请回去重新选择你的需求");				
		}else{
			System.out.println("请输入新的学生姓名:");
			String name = sc.nextLine();
			System.out.println("请输入新的学生年龄:");
			String age = sc.nextLine();
			System.out.println("请输入新的学生住址:");
			String address = sc.nextLine();	
			Student ss = new Student();
			ss.setId(id);
			ss.setName(name);
			ss.setAge(age);
			ss.setAddress(address);
			array.set(index, ss);
			System.out.println("修改成功");
		}	
	}
}
