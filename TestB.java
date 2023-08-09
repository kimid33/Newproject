import java.io.*;
class TestB
{
	public static void main(String[] args) throws Exception{
		//write();
		read();
	}
	static void read()throws Exception
	{
		FileReader fr = new FileReader("TestB.java");
		BufferedReader br = new BufferedReader(fr);
		String s = br.readLine();
		while(s!=null)
		{
			System.out.println(s);
			s = br.readLine();
		}
	} 
	static void write()throws Exception 
	{
		PrintWriter ps = new PrintWriter("abc.txt");
		ps.println("hello");
		ps.println('a');
		ps.println(100);
		ps.println(100.9);
		ps.println(true);
		ps.close();
	}
}