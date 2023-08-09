import java.io.*;
import.java.util.*; 

class Testt
{
	public static void main(String [] args)
	{
		School scl = new School();
		Students s = new Students("101","abc","A","9999999999");
		scl.addData(s);
		System.out.println(scl.readData());
	}
}
class Students implements Serializable
{
	int rollNo;
	String name;
	String className;
	String mobileNo;

public String toString()
{
	return "("+rollNo+", "+name+", "+className+", "+mobileNo+")";
}

Students(int rollNo,String name,String className,String mobileNo)
{
	this.rollNo = rollNo;
	this.name = name;
	this.className = className;
	this.mobileNo = mobileNo;
}

public void setrollNo(int rollNo)
{
	this.rollNo = rollNo;
}
public void setName(String name)
{
	this.name = name;
}
public void setClassName(String className)
{
	this.className = className;
}
public void setMobileNo(String mobileNo)
{
	this.mobileNo = mobileNo;
}
public int getRollNo()
{
	return rollNo;
}
public String getName()
{
	return name;
}
public String getClassName()
{
	return className;
}
public String getMobileNo()
{
	return mobileNo;
}
}

class School
{

public void addData(Students a)throws Exception 
{
	Arraylist al = readData();
	if(al==null)
	{
		al = new Arraylist();
	}
	al.add(s);
	FileOutputStream fos = new FileOutputStream("std.obj");
	ObjectOutputStram os = new ObjectOutputStram(fos);
	os.writeObject(al);
	os.close();
}
}