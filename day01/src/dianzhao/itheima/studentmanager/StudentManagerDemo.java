package dianzhao.itheima.studentmanager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


/*
 * ѧ������ϵͳ��������
		--------��ӭ����ѧ������ϵͳ--------
		1 �鿴����ѧ��
		2 ���ѧ��
		3 ɾ��ѧ��
		4 �޸�ѧ��
		5 �˳�
		���������ѡ��
 */

public class StudentManagerDemo {
	public static void main(String[] args) throws IOException {
		//ArrayList<Student> array = new ArrayList<Student>();
		while(true){
			System.out.println("--------��ӭ����ѧ������ϵͳ--------");
			System.out.println("1 �鿴����ѧ��");
			System.out.println("2 ���ѧ��");
			System.out.println("3 ɾ��ѧ��");
			System.out.println("4 �޸�ѧ��");
			System.out.println("5 �˳�");
			System.out.println("���������ѡ��");
			
			String fileName = "dianzhaostudentmanager.txt";
			Scanner sc = new Scanner(System.in);
			String choiceWork = sc.nextLine();
			switch (choiceWork) {
			case "1":
				findAllStudent(fileName);
				break;
			case "2":
				addStudent(fileName);
				break;
			case "3":
				delStudent (fileName);
				break;
			case "4":
				setStudent(fileName);
				break;
			case "5":
				System.out.println("лл���ʹ��");
				System.exit(0);
				return;
			default:
				System.out.println("�������ѡ������");
				break;
			}
		}
	}
	
	public static void readerFile(ArrayList<Student> array,String fileName) throws IOException{
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
	
	public static void writerFile(ArrayList<Student> array,String fileName) throws IOException{
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
	
	//�鿴����ѧ��
	public static void findAllStudent (String fileName) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("dianzhaostudentmanager.txt"));
		ArrayList<Student>array = new ArrayList<Student>();
		//readerFile(array,fileName);
		
		String line ;
		while ((line=br.readLine()) != null){
			String[] str  = line.split(",");
			Student s = new Student();
			s.setId(str[0]);
			s.setName(str[1]);
			s.setAge(str[2]);
			s.setAddress(str[3]);
			array.add(s);
		}
		br.close();
		
		if(array.size() == 0){
			System.out.println("Ŀǰû��ѧ��,������ѡ��");
			return;
		}
		
		System.out.println("ѧ��\t����\t����\tסַ");
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getAddress());
		}
	}
	
	//���ѧ��
	public static void addStudent (String fileName) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("dianzhaostudentmanager.txt"));
		ArrayList<Student> array = new ArrayList<Student>();
		//readerFile(array,fileName);
		Scanner sc = new Scanner (System.in);
		
		String line ;
		while ((line=br.readLine()) != null){
				String[] str  = line.split(",");
				Student s = new Student();
				s.setId(str[0]);
				s.setName(str[1]);
				s.setAge(str[2]);
				s.setAddress(str[3]);
				array.add(s);
		}
		br.close();
		
		String id;
		while(true){
			boolean flag =false;
			System.out.println("��������Ҫ���ѧ����ѧ��");
			id = sc.nextLine();
			for (int i = 0; i < array.size(); i++) {
				Student s = array.get(i);
				if(s.getId().equals(id)){
					System.out.println("�������ѧ���Ѵ���,����������");
					flag = true;
					break;
				}
			}
			if(!flag){
				break;
			}
		}
		System.out.println("������ѧ��������");
		String name =sc.nextLine();
		System.out.println("������ѧ��������");
		String age =sc.nextLine();
		System.out.println("������ѧ����סַ");
		String address =sc.nextLine();
		Student s = new Student ();
		s.setId(id);
		s.setName(name);
		s.setAge(age);
		s.setAddress(address);
		array.add(s);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("dianzhaostudentmanager.txt"));
		
		for (int i = 0; i < array.size(); i++) {
			Student sss = array.get(i);
			bw.write(sss.getId()+","+sss.getName()+","+sss.getAge()+","+sss.getAddress());
			bw.newLine();
			bw.flush();
		}
		bw.close();
		
		//writerFile(array,fileName);
		System.out.println("���ѧ���ɹ�");
		}
	
	// ɾ��ѧ��
	public static void delStudent (String fileName) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("dianzhaostudentmanager.txt"));
		ArrayList<Student> array = new ArrayList<Student>();
		//readerFile(array,fileName);
		Scanner sc = new Scanner (System.in);
		
		String line ;
		while ((line=br.readLine()) != null){
			String[] str  = line.split(",");
			Student s = new Student();
			s.setId(str[0]);
			s.setName(str[1]);
			s.setAge(str[2]);
			s.setAddress(str[3]);
			array.add(s);
		}
		br.close();
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("dianzhaostudentmanager.txt"));
		String id;
		boolean flag =false;
		int index =-1; 
	
			System.out.println("��������Ҫɾ��ѧ����ѧ��");
			 id = sc.nextLine();
			for (int i = 0; i < array.size(); i++) {
				Student s = array.get(i);
				if(s.getId().equals(id)){
					index = i;
					flag = true;
					System.out.println("i:"+i);
				}
			}
			if(flag){
				array.remove(index);
				//writerFile(array, fileName);
				System.out.println("ɾ���ɹ�");
				
			}else{
				System.out.println("�������ѧ��ѧ�Ų�����");
				
			}
		
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			bw.write(s.getId()+","+s.getName()+","+s.getAge()+","+s.getAddress());
			bw.newLine();
			bw.flush();
		}
		bw.close();
		
//		System.out.println("ɾ���ɹ�");
		
	}
	
	//�޸�ѧ��
	public static void setStudent(String fileName) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("dianzhaostudentmanager.txt"));
		ArrayList<Student> array = new ArrayList<Student>();
		//readerFile(array,fileName);
		Scanner sc = new Scanner (System.in);
		
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
		
		String id;
		boolean flag =false;
		int index =-1; 
	
			System.out.println("��������Ҫ�޸�ѧ����ѧ��");
			 id = sc.nextLine();
			for (int i = 0; i < array.size(); i++) {
				Student s = array.get(i);
				if(s.getId().equals(id)){
					index = i;
					flag = true;
				}
			}
			if(flag){
				System.out.println("�������µ�ѧ��������");
				String name =sc.nextLine();
				System.out.println("�������µ�ѧ��������");
				String age =sc.nextLine();
				System.out.println("�������µ�ѧ����סַ");
				String address =sc.nextLine();
				Student s = new Student ();
				s.setId(id);
				s.setName(name);
				s.setAge(age);
				s.setAddress(address);
				array.set(index, s);
				
				BufferedWriter bw = new BufferedWriter(new FileWriter("dianzhaostudentmanager.txt"));
				for (int i = 0; i < array.size(); i++) {
					Student s1 = array.get(i);
					StringBuilder sb = new StringBuilder();
					sb.append(s1.getId()).append(",").append(s1.getName()).append(",").append(s1.getAge()).append(",").append(s1.getAddress());
					bw.write(sb.toString());
					bw.newLine();
					bw.flush();
				}
				bw.close();
				
				//writerFile(array, fileName);
				System.out.println("�޸ĳɹ�");
			}else{
				System.out.println("�������ѧ��ѧ�Ų�����");
				
			}
		
	}
}
