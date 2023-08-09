/*class DurgaSoft{
	
	public static void m1(int... x){
		System.out.println("var-arg methods");
	}
	public static void main(String[] args) {
		m1();
		m1(10);
		m1(10,20,30);
		m1(12,32,43,88,99);
	}
}*/

class Person{

	String name;
	int age;

	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
}

class Student extends Person 
{
	int rollno;
	int marks;

	Student(String name,int age,int rollno,int marks)
	{
		super(name,age);
		this.rollno=rollno;
		this.marks=marks;
	}
public static void main(String[] args) {
	Student s = new Student("kimi",25,101,90);
	System.out.println(s);
}
}