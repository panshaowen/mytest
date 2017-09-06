package arraylisttofiletest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListToFileTest1 {

	
	public static void main(String[] args) throws IOException {
		ArrayList<Student> array = new ArrayList<Student>();
		addStudent(array);
		addStudent(array);
		addStudent(array);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("array.txt"));
		
		for (int i = 0; i <array.size(); i++) {
			Student s = array.get(i);
			StringBuilder sb = new StringBuilder();
			sb.append(s.getId()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getAddress());
			
			bw.write(sb.toString());
			bw.newLine();
			bw.flush();
			
		}
		bw.close();
		
		
	}
	//���ѧ��
	public static void addStudent(ArrayList<Student> array) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		
		//Ϊ����id�ܹ������ʵ������ǾͰ�id��������ѭ��������
		String id;
		
		//Ϊ���ô����ܹ��ص������ѭ��
		while(true) {
			System.out.println("������ѧ��ѧ�ţ�");
			//String id = sc.nextLine();
			id = sc.nextLine();
			
			//�ж�ѧ����û�б���ռ��
			//������
			boolean flag = false;
			//�������ϣ��õ�ÿһ��ѧ��
			for(int x=0; x<array.size(); x++) {
				Student s = array.get(x);
				//��ȡ��ѧ����ѧ�ţ��ͼ���¼���ѧ�Ž��бȽ�
				if(s.getId().equals(id)) {
					flag = true; //˵��ѧ�ű�ռ����
					break;
				}
			}
			
			if(flag) {
				System.out.println("�������ѧ���Ѿ���ռ��,����������");
			}else {
				break; //����ѭ��
			}
		}
		
		
		System.out.println("������ѧ��������");
		String name = sc.nextLine();
		System.out.println("������ѧ�����䣺");
		String age = sc.nextLine();
		System.out.println("������ѧ����ס�أ�");
		String address = sc.nextLine();
		
		//����ѧ������
		Student s = new Student();
		s.setId(id);
		s.setName(name);
		s.setAge(age);
		s.setAddress(address);
		
		//��ѧ��������ΪԪ����ӵ�����
		array.add(s);
		
		//������ʾ
		System.out.println("���ѧ���ɹ�");
	}

}
