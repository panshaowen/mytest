package arraylisttofiletest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileToArrayList {
	public static void main(String[] args) throws IOException {
		// 查询学生,并输出
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
		System.out.println("学号\t姓名\t年龄\t住址");
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			System.out.println(s.getId() + "\t" + s.getName() + "\t"
					+ s.getAge() + "\t" + s.getAddress());
		}

		br.close();
	}

	// 添加学生
	public static void addStudent(ArrayList<Student> array) {
		// 创建键盘录入对象
		Scanner sc = new Scanner(System.in);

		// 为了让id能够被访问到，我们就把id定义在了循环的外面
		String id;

		// 为了让代码能够回到这里，用循环
		while (true) {
			System.out.println("请输入学生学号：");
			// String id = sc.nextLine();
			id = sc.nextLine();

			// 判断学号有没有被人占用
			// 定义标记
			boolean flag = false;
			// 遍历集合，得到每一个学生
			for (int x = 0; x < array.size(); x++) {
				Student s = array.get(x);
				// 获取该学生的学号，和键盘录入的学号进行比较
				if (s.getId().equals(id)) {
					flag = true; // 说明学号被占用了
					break;
				}
			}

			if (flag) {
				System.out.println("你输入的学号已经被占用,请重新输入");
			} else {
				break; // 结束循环
			}
		}

		System.out.println("请输入学生姓名：");
		String name = sc.nextLine();
		System.out.println("请输入学生年龄：");
		String age = sc.nextLine();
		System.out.println("请输入学生居住地：");
		String address = sc.nextLine();

		// 创建学生对象
		Student s = new Student();
		s.setId(id);
		s.setName(name);
		s.setAge(age);
		s.setAddress(address);

		// 把学生对象作为元素添加到集合
		array.add(s);

		// 给出提示
		System.out.println("添加学生成功");
	}

}
