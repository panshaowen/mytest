package com.itheima;

import java.util.ArrayList;
import java.util.Scanner;



public class StudentManagerDemo {
	public static void main(String[] args) {
		ArrayList<Student> array = new ArrayList<Student>();

		while (true) {
			System.out.println("----------��ӭ����ѧ������ϵͳ----------");
			System.out.println("1 �鿴����ѧ��");
			System.out.println("2 ���ѧ��");
			System.out.println("3 ɾ��ѧ��");
			System.out.println("4 �޸�ѧ��");
			System.out.println("5 �˳�");
			System.out.println("���������ѡ��");

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
				System.out.println("лл����ʹ��");
				System.exit(1);
				break;
			default:
				System.out.println("���ѡ������,����������");
				break;
			}
		}
	}

	public static void addStudent(ArrayList<Student> array) {
		// ArrayList<Student> array = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		String id;
		while (true) {
			System.out.println("������ѧ��ѧ��:");
			id = sc.nextLine();
			boolean flag = false;
			for (int i = 0; i < array.size(); i++) {
				Student s = array.get(i);
				if (s.getId().equals(id)) {
					System.out.println("�������ѧ���ѱ�ʹ��,����������");
					flag = true;
					break;
				}
			}
			if (!flag) {
				break;
			}
		}
		System.out.println("������ѧ������:");
		String name = sc.nextLine();
		System.out.println("������ѧ������:");
		String age = sc.nextLine();
		System.out.println("������ѧ��סַ:");
		String address = sc.nextLine();
		Student ss = new Student();
		ss.setId(id);
		ss.setName(name);
		ss.setAge(age);
		ss.setAddress(address);
		array.add(ss);
		System.out.println("��ӳɹ�");
	}

	public static void findAllStudent(ArrayList<Student> array) {

		if (array.size() != 0) {
			System.out.println("ѧ��" + "\t\t" + "����" + "\t" + "����" + "\t" + "סַ");
			for (int i = 0; i < array.size(); i++) {
				Student s = array.get(i);
				System.out.println(s.getId() + "\t\t" + s.getName() + "\t"
						+ s.getAge() + "\t" + s.getAddress());
			}			
		}else{
			System.out.println("Ŀǰû��ѧ��,�������ѧ��");
		}
	}

	public static void deleteStudent(ArrayList<Student> array){
		Scanner sc = new Scanner(System.in);
	
    	int index =-1;
		System.out.println("������Ҫɾ����ѧ����ѧ��:");
		String id = sc.nextLine();
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			if(s.getId().equals(id)){
				index = i;
				break;
			}
		}
		if(index == -1){
			System.out.println("�������ѧ�Ų�����,���ȥ����ѡ���������");				
		}else{
			array.remove(index);
			System.out.println("ɾ��ѧ���ɹ�");				
		}		
	}
	
	public static void updateStudet(ArrayList<Student> array){
		Scanner sc = new Scanner(System.in);
		
    	int index =-1;
		System.out.println("������Ҫ�޸ĵ�ѧ����ѧ��:");
		String id = sc.nextLine();
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			if(s.getId().equals(id)){
				index = i;
				break;
			}
		}
		if(index == -1){
			System.out.println("�������ѧ�Ų�����,���ȥ����ѡ���������");				
		}else{
			System.out.println("�������µ�ѧ������:");
			String name = sc.nextLine();
			System.out.println("�������µ�ѧ������:");
			String age = sc.nextLine();
			System.out.println("�������µ�ѧ��סַ:");
			String address = sc.nextLine();	
			Student ss = new Student();
			ss.setId(id);
			ss.setName(name);
			ss.setAge(age);
			ss.setAddress(address);
			array.set(index, ss);
			System.out.println("�޸ĳɹ�");
		}	
	}
}
