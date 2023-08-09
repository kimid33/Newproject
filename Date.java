import java.util.Scanner;

class StudentDetails{

	private int rollNo,fees;
	private String name,mobile,className; 

    StudentDetails(int rollno,String name,String mobile,String className)
    {
        this.rollNo=rollNo;
        this.name=name;
        this.mobile=mobile;
        this.className=className;
    }
    public void setFees(int fees)
    {
	    this.fees=fees;
    }
    public int getFees()
    {
	    return this.fees;
    }

    public int getRollNo()
    {
    	return this.rollNo;
    }
    public String toString()
    {
	   return "\nRoll No: "+rollNo+", Name: "+name+", MobileNo: "+mobile+", Class: "+className+",Fees: "+fees;
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
		sc.nextLine();

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

    public void update()
    {
    	int r,i;
    	Scanner sc = new Scanner(System.in);
    	System.out.println("please enter student roll");
    	r = sc.nextInt();
    	i = searchByRollNo(r);
    	if(i!=-1)
    	{
    		System.out.println("plz Enter Fees");
    		int fees = sc.nextInt();
    		students[i].setFees(fees);
    	}
    	else 
    	{
    		System.out.println("Roll no not exist.");
    	}
    }

    public StudentDetails delete()
    {
    	int r,i;
    	Scanner sc = new Scanner(System.in);
    	System.out.println("please enter student roll");
    	r = sc.nextInt();
    	i = searchByRollNo(r);
    	if(i!=-1)
    	{
    		StudentDetails s=students[i];
    		for(int j=i;j<totalStd;j++)
    		{
    			students[j] = students[j+1];
    		}
    		students[totalStd--] = null;
    		return s;
    	}
    	else 
    	{
    		System.out.println("Roll no not exist.");
    		return null;
    	}
    }

    public int searchByRollNo(int roll)
    {
    	for(int i=0;i<=totalStd;i++)
    	{
    		if(roll==students[i].getRollNo())
    		{
    			return i;
    		}
    	}
    	return -1;
    }

    public void show()
     {
     	for(int i=0;i<=totalStd;i++)
     	{
     		System.out.println(students[i]);
     	}
	}
}

	class Date
	{
		public static void main(String[] args)
		{
			School s=new School();
			/*Scanner sac = new Scanner(System.in);
			System.out.println("Enter number of students");
			int num = sac.nextInt();
			for(int i=0;i<num;i++)
			{
				school.newStudentDetails();
			}
			school.show();*/
			s.newStudentDetails();
			s.newStudentDetails();
			s.show();
			System.out.println(s.delete());
			s.show();
		}
	}
