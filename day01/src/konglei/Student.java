package konglei;

public class Student {
	private String name ;
	private int age ;
	
	public Student (){
		
	}
	public void study(){
		System.out.println("�ú�ѧϰ");
	}
	public Student (String name, int age ){
		this.name = name;
		this. age = age ;
	}
	public void setName(String name){
		this.name = name;
		
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
}
