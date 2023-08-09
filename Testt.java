import java.io.*;
import java.util.*; 

class Testt
{
	public static void main(String [] args)throws Exception
	{
		School scl = new School();
		Students s = new Students(101,"abc","A","9999999999"+"\n");
		s = new Students(102,"def","B","8888888888");
		scl.addData(s);
		System.out.println(scl.readData());
		//scl.update(s);
		//System.out.println(scl.readData());
	}
}
class Students implements Serializable
{
	int rollNo;
	String name;
	String className;
	String mobileNo;
/*public boolean equals(Object obj)
{
	Students s = (Students)obj;
	return rollNo = s.rollNo;
}*/
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

public void update()throws Exception
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter rollNo");
	int rollNo = sc.nextInt();
	Students s = search(rollNo);
	if(s==null)
	{
		System.out.println("Student not found");
	}
	else 
	{
		//System.out.println(s);
		String mob = "6263646566";
		s.setMobileNo(mob);
		ArrayList al = readData();
		int index = al.indexOf(s);
		al.set(index,s);
		addData(al);
	}
}
public Students search(int rollNo)
{
	ArrayList al = readData();
	for(int i=0;al!=null&&i<al.size();i++)
	{
		Students s1 = (Students)al.get(i);
		if(s1.getRollNo()==rollNo)
		{
			return s1;
		}
	}
	return null;
}

public void addData(Students s)throws Exception 
{
	ArrayList al = readData();
	if(al==null)
	{
		al = new ArrayList();
	}
	if(search(s.getRollNo())==null)
	{
	   al.add(s);
	   FileOutputStream fos = new FileOutputStream("std.obj");
	   ObjectOutputStream os = new ObjectOutputStream(fos);
	   os.writeObject(al);
	   os.close();
	}
	else 
	{
		System.out.println("Duplicate Rollno not allowed!");
	}
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
