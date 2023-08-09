import java.io.*;
class TestC
{
	public static void main(String[] args) throws Exception{
		FileWriter fw = new FileWriter("copy.java");
		FileReader fr = new FileReader("TestC.java");
		int a =fr.read();
		while(a!=-1)
		{
			//System.out.println(a);
			fw.write(a);
			a = fr.read();
		}
		fw.close();
	}
	static void read()throws Exception 
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
}