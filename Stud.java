import java.util.Scanner;

class StudentDetails{

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
}

class School
{
	StudentDetails students[];
	int seat,totalStd;
	School()
	{
		seat=5;
		totalStd= -1;
		students=new StudentDetails[seat];
	}
	public void newStudentDetails()
	{
		if(totalStd==seat-1)
		{
			System.out.println("Better luck try next year");
			return;
		}
		String n,m,c;
		int r;
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter student roll no: ");
		r=sc.nextInt();
		n=sc.nextLine();

		System.out.println("please enter student name: ");
		n=sc.nextLine();

		System.out.println("please enter student class name: ");
		c=sc.nextLine();

		System.out.println("please enter student mobile no: ");
		m=sc.nextLine();

		StudentDetails s=new StudentDetails(r,n,m,c);
		totalStd++;
		students[totalStd] = s;
    }

    public void show()
     {
     	for(int i=0;i<=totalStd;i++)
     	{
     		System.out.println(students[i]);
     	}
	}

	class Date
	{
		public static void main(String[] args)
		{
			School school=new School();
			Scanner sac = new Scanner(System.in);
			System.out.println("Enter number of students");
			int num = sac.nextInt();
			for(int i=0;i<num;i++)
			{
				school.newStudentDetails();
			}
			school.show();
		}
	}