package arraylisttofiletest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileToArrayList {
	public static void main(String[] args) throws IOException {
		// ��ѯѧ��,�����
		BufferedReader br = new BufferedReader(new FileReader("array.txt"));
		ArrayList<Student> array = new ArrayList<Student>();

		String line;
		while ((line = br.readLine()) != null) {
			String[] str = line.split(",");
			Student s = new Student();
			s.setId(str[0]);
			s.setName(str[1]);
			s.setAge(str[2]);
			s.setAddress(str[3]);
			array.add(s);
		}
		System.out.println("ѧ��\t����\t����\tסַ");
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			System.out.println(s.getId() + "\t" + s.getName() + "\t"
					+ s.getAge() + "\t" + s.getAddress());
		}

		br.close();
	}

	// ���ѧ��
	public static void addStudent(ArrayList<Student> array) {
		// ��������¼�����
		Scanner sc = new Scanner(System.in);

		// Ϊ����id�ܹ������ʵ������ǾͰ�id��������ѭ��������
		String id;

		// Ϊ���ô����ܹ��ص������ѭ��
		while (true) {
			System.out.println("������ѧ��ѧ�ţ�");
			// String id = sc.nextLine();
			id = sc.nextLine();

			// �ж�ѧ����û�б���ռ��
			// ������
			boolean flag = false;
			// �������ϣ��õ�ÿһ��ѧ��
			for (int x = 0; x < array.size(); x++) {
				Student s = array.get(x);
				// ��ȡ��ѧ����ѧ�ţ��ͼ���¼���ѧ�Ž��бȽ�
				if (s.getId().equals(id)) {
					flag = true; // ˵��ѧ�ű�ռ����
					break;
				}
			}

			if (flag) {
				System.out.println("�������ѧ���Ѿ���ռ��,����������");
			} else {
				break; // ����ѭ��
			}
		}

		System.out.println("������ѧ��������");
		String name = sc.nextLine();
		System.out.println("������ѧ�����䣺");
		String age = sc.nextLine();
		System.out.println("������ѧ����ס�أ�");
		String address = sc.nextLine();

		// ����ѧ������
		Student s = new Student();
		s.setId(id);
		s.setName(name);
		s.setAge(age);
		s.setAddress(address);

		// ��ѧ��������ΪԪ����ӵ�����
		array.add(s);

		// ������ʾ
		System.out.println("���ѧ���ɹ�");
	}

}
