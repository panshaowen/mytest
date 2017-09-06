package dianzhao.itheima.studentmanager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


/*
 * 学生管理系统的主界面
		--------欢迎来到学生管理系统--------
		1 查看所有学生
		2 添加学生
		3 删除学生
		4 修改学生
		5 退出
		请输入你的选择：
 */

public class StudentManagerDemo {
	public static void main(String[] args) throws IOException {
		//ArrayList<Student> array = new ArrayList<Student>();
		while(true){
			System.out.println("--------欢迎来到学生管理系统--------");
			System.out.println("1 查看所有学生");
			System.out.println("2 添加学生");
			System.out.println("3 删除学生");
			System.out.println("4 修改学生");
			System.out.println("5 退出");
			System.out.println("请输入你的选择：");
			
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
				System.out.println("谢谢你的使用");
				System.exit(0);
				return;
			default:
				System.out.println("你输入的选择有误");
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
	
	//查看所有学生
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
			System.out.println("目前没有学生,请重新选择");
			return;
		}
		
		System.out.println("学号\t姓名\t年龄\t住址");
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getAddress());
		}
	}
	
	//添加学生
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
			System.out.println("请输入你要添加学生的学号");
			id = sc.nextLine();
			for (int i = 0; i < array.size(); i++) {
				Student s = array.get(i);
				if(s.getId().equals(id)){
					System.out.println("你输入的学号已存在,请重新输入");
					flag = true;
					break;
				}
			}
			if(!flag){
				break;
			}
		}
		System.out.println("请输入学生的姓名");
		String name =sc.nextLine();
		System.out.println("请输入学生的年龄");
		String age =sc.nextLine();
		System.out.println("请输入学生的住址");
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
		System.out.println("添加学生成功");
		}
	
	// 删除学生
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
	
			System.out.println("请输入你要删除学生的学号");
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
				System.out.println("删除成功");
				
			}else{
				System.out.println("你输入的学生学号不存在");
				
			}
		
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			bw.write(s.getId()+","+s.getName()+","+s.getAge()+","+s.getAddress());
			bw.newLine();
			bw.flush();
		}
		bw.close();
		
//		System.out.println("删除成功");
		
	}
	
	//修改学生
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
	
			System.out.println("请输入你要修改学生的学号");
			 id = sc.nextLine();
			for (int i = 0; i < array.size(); i++) {
				Student s = array.get(i);
				if(s.getId().equals(id)){
					index = i;
					flag = true;
				}
			}
			if(flag){
				System.out.println("请输入新的学生的姓名");
				String name =sc.nextLine();
				System.out.println("请输入新的学生的年龄");
				String age =sc.nextLine();
				System.out.println("请输入新的学生的住址");
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
				System.out.println("修改成功");
			}else{
				System.out.println("你输入的学生学号不存在");
				
			}
		
	}
}
