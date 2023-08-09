class TaskSir
{
/*{
	

public static void copyFile(File a , File b)throws Exception
{
	FileInputStream fin = new FileInputStream(a);
	FileOutputStream fot = new FileOutputStream(b);
	try{
		int n;
		while((n=in.read()) != -1)
		{
			out.write(n);
		}
	}
	finally{
		if(in != null)
		{
			in.close();
		}
	}
	System.out.println("File copied");
}


	public static void main(String[] args) {
		String a = sc.nextLine();
		File x = newFile(a);
		String b = sc.
	}
}*/

class TestC
{
	public static void main(String[] args) throws Exception{
		PrintStream ps1 = new PrintStream("c.java");
		PrintStream ps2 = new PrintStream("d.java");
		ps1.println("111");
		ps1.println("222");
		ps1.println("333");
		ps1.println("555");
		ps1.println("444");
		ps1.println("888");
		ps2.println("333");
		ps2.println("999");
		ps2.println("666");
		ps2.println("555");
		ps2.println("222");
		ps2.println("777");
		ps1.close();
		ps2.close();
	}
}

class Concat
{
	static void writeFile(String file)throws Exception{
	FileWriter fw = new FileWriter("Output.java",true);
		FileReader fr = new FileReader(file);
		int a =fr.read();
		while(a!=-1)
		{
			//System.out.println(a);
			fw.write(a);
			a = fr.read();
		}
		fw.close();
	}

	public static void main(String [] args)throws Exception
	{
		writeFile("c.java");
		writeFile("d.java");
	}
}
}
	/*static void read()throws Exception 
	{
		FileReader fr = new FileReader("TestC.java");
		int a=0;
		char b[] = new char[100];
		a=fr.read(b);
		while(a!=-1)
		{
			System.out.println(b);
			a = fr.read(b);

	}
}
static void write() throws Exception{
	FileWriter fw = new FileWriter("abc.txt",true);
	fw.write('A');
	fw.write("hello");
	fw.write(100);
	fw.write("\n");
	fw.close();
	System.out.println("success");
	}
}*/