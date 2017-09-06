package konglei;

public class StudentDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.setName("¡÷«‡œº");
		s.setAge(28);
		System.out.println(s.getName()+"--------"+s.getAge());
		
		Student s2 = new Student("¡÷«Ìœº",28);
		System.out.println(s2.getName()+"---"+s2.getAge());
	}

}
