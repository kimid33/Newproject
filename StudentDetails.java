public class StudentDetails{

	private int rollno,fees;
	private String name,classname,mobile; 

StudentDetails(int rollno,String name,String classname,String mobile)
{
    this.rollno=rollno;
    this.name=name;
    this.classsname=classname;
    this.mobile=mobile;
}
public void setfees(int fees)
{
	this.fees=fees;
}
public void getfees()
{
	return this.fees;
}
public String tostring()
{
	return "\nRoll No: "+rollNo+", Name: "+name+", MobileNo: "+mobile+", Class: "+className;
}

  class Stud{
public static void main(String [] args)
 {
	StudentDetails s = new StudentDetails(201,"kimi","1234567890","Mca");
	System.out.println(s);
 }
	
}