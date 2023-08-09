import java.io.*;
import java.util.*;
class CrudOpAssig
{
	public static void main(String[] args) {
		School schl = new School();
		System.out.println(schl.readData());
		schl.update();
		System.out.println(schl.readData());
	}
}

class School
{
	public void update()throws Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rollNo");
		int rollNo = sc.nextInt();
		Student s = search(rollNo);
		if(s==null)
		{
			System.out.println("Std not found!");
		}
		else 
		{
			System.out.println(s);
			String mob = "2345567489";
			s.setMobile(mob);
			ArrayList al = readData();
			int index = al.indexOf(s);
			al.set(index,s);
			addData(a1);
		}
	}
	public Student search(int rollNo)
	{
		ArrayList al = readData();
		for(int i=0;i<=a1.size();i++)
		{
			Student s1 = (Student)al.get(i);
			if(s1.getRollNo()==rollNo)
			{
				return s1;
			}
		}
		return null;
	}
	public void addData(Student s)throws Exception 
	{
		ArrayList al = readData();
		if(al==null)
		{
			al = new ArrayList();
		}
		al.add(s);
		FileOutputStream fos = new FileOutputStream("std.obj");
		ObjectOutputStream os = new ObjectOutputStream(fos);
		os.writeObject(al);
		os.close();
	}
	public void addData(ArrayList al)throws Exception
	{
		FileOutputStream fos = new FileOutputStream("std.obj");
		ObjectOutputStream os = new ObjectOutputStream(fos);
		os.writeObject(al);
		os.close();
	}
	public ArrayList readData()
	{
		try 
		{
			FileInputStream fis = new FileInputStream("std.obj");
			ObjectInputStream is = new ObjectInputStream(fis);
			ArrayList al = (ArrayList)is.readObject();
			return al;
		}
		catch(Exception e)
		{
			return null;
		}
	}
}
class Student implements Serializable
{
	String name;
	int rollNo;
	String className,mobile;

	public boolean equals(Object obj)
	{
		Student s = (Student)obj;
		return rollNo==s.rollNo;
	}
	public String toString()
	{
		return "("+name+", "+rollNo+", "+className+", "+mobile+")";
	}
	Student(String name,int rollNo,String className,String mobile)
	{
		this.name = name;
		this.rollNo = rollNo;
		this.className = className;
		this.mobile = mobile;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setRollNo(int rollNo)
	{
		this.rollNo = rollNo;
	}
	public void setClassName(String className)
	{
		this.className = className;
	}
	public void setMobile(String mobile)
	{
		this.mobile = mobile;
	}
	public String getName()
	{
		return name;
	}
	public String getRollNo()
	{
		return rollNo;
	}
	public String getClassName()
	{
		return className;
	}
	public String getMobile()
	{
		return mobile;
	}
}