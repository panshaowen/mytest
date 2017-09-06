package com.heima.StudentManager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class StudentManagerDemo {
	public static void main(String[] args) throws IOException {
		//ArrayList<Student> array = new ArrayList<Student>();
		String fileName = "student.txt";
		

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
				findAllStudent(fileName);
				break;
			case "2":
				addStudent(fileName);
				break;
			case "3":
				deleteStudent(fileName);
				break;
			case "4":
				updateStudet(fileName);
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
	
	public static void writerFile(String fileName,ArrayList<Student> array) throws IOException{
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
		
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			StringBuilder sb = new StringBuilder();
			sb.append(s.getId()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getAddress());
			bw.write(sb.toString());
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}
	
	public static void readFile(String fileName,ArrayList<Student> array) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		
		String line;
		while ((line=br.readLine()) != null){
			String[]str = line.split(",");
			Student s = new Student();
			s.setId(str[0]);
			s.setName(str[1]);
			s.setAge(str[2]);
			s.setAddress(str[3]);
			array.add(s);
		}
		br.close();
	}
	
	public static void addStudent(String fileName) throws IOException {
		ArrayList<Student> array = new ArrayList<Student>();
		readFile(fileName,array);
		
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
		
		writerFile(fileName,array);
		System.out.println("��ӳɹ�");
	}

	public static void findAllStudent(String fileName) throws IOException {
		ArrayList<Student> array = new ArrayList<Student>();
		readFile(fileName,array);
		if (array.size() != 0) {
			System.out.println("ѧ��" + "\t\t" + "����" + "\t" + "����" + "\t" + "סַ");
			for (int i = 0; i < array.size(); i++) {
				Student s = array.get(i);
				System.out.println(s.getId() + "\t\t" + s.getName() + "\t"+ s.getAge() + "\t" + s.getAddress());
			}			
		}else{
			System.out.println("Ŀǰû��ѧ��,�������ѧ��");
		}
	}

	public static void deleteStudent(String fileName) throws IOException{
		ArrayList<Student> array = new ArrayList<Student>();
		readFile(fileName,array);
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
			writerFile(fileName, array);
			System.out.println("ɾ��ѧ���ɹ�");				
		}		
	}
	
	public static void updateStudet(String fileName) throws IOException{
		ArrayList<Student> array = new ArrayList<Student>();
		readFile(fileName,array);
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
			writerFile(fileName, array);
			System.out.println("�޸ĳɹ�");
			
		}	
	}
}
