class Emp{
	private int id;
	private String name,mobile,address,post;
	private int sal;
	Emp(int id,String name,String mobile,String address,String post)
	{
		this.id=id;
		this.name=name;
		this.mobile=mobile;
		this.address=address;
		this.post=post;
	}
	public int getId()
	{
		return id;
	}
	public int getSal()
	{
		return sal;
	}
	public void setSal(int sal)
	{
		this.sal=sal;
	}
	public String toString()
	{
		return "Id: "+id+", Name: "+name+", Mobile: "+mobile+", Add: "+address+", post: "+post;
	}
}

class Company
{
	Emp emps[];
	int count;
	int seat,totalEmp;
	Company()
	{
		count=0;
		seat=5;
		emps=new Emp[seat];
		totalEmp=-1;
	}

	public void newEmp(String name,String mobile,String address,String post)
	{
		if(totalEmp==seat-1)
		{
			System.out.println("sorry...");
			return;
		}
		int id=100+count++;
		Emp e=new Emp(id,name,mobile,address,post);
		emps[++totalEmp]=e;
	}

	public void showAllEmp()
	{
		for(int i=0;i<=totalEmp;i++)
		{
			System.out.println(emps[i]);
		}
	}
}

class Test
{
	public static void main(String[] args)
	{
		Company comp=new Company();
		for(int i=0;i<5;i++)
		{
			comp.newEmp("name"+i,"998877665"+i,"address"+i,"post"+i);
		}
		comp.showAllEmp();
	}
}