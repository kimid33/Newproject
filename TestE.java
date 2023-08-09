import java.io.*;
class TestE
{
	public static void main(String[] args)throws Exception {

		/*File f = new File("C:\\Users\\dwive\\OneDrive\\Documents\\java\\a.jpg");
		 
		FileInputStream fis = new FileInputStream(f);
		FileOutputStream fos = new FileOutputStream("b.jpg");
		int a = fis.read();
		while(a!=-1)
		{
			fos.write(a);
			a = fis.read();
		}
		fos.close();*/
		File f = new File("a.jpg");
		 
		FileInputStream fis = new FileInputStream(f);
		FileOutputStream fos = new FileOutputStream("b.jpg");
		byte b[] = new byte[(int)f.length()];
		fis.read(b);
		fos.write(b);
	}
}


/*----------------------------------------------------------------------------------------*/

class TestF
{
	public static void main(String[] args)throws Exception {
		FileOutputStream fos = new FileOutputStream("std.obj");   //object read and write of class in binary format
		ObjectOutputStream os = new ObjectOutputStream(fos);      //Serialization
		Std s =new Std();
		os.writeObject(s);
		os.close();

		//Deserialization
		/*FileInputStream fos = new FileInputStream("std.obj");
		ObjectInputStream os = new ObjectInputStream(fos);
		Std s = (Std)os.readObject();
		System.out.println(s);*/
	}
}

class Address implements Serializable
{
	String city,town;
}

class Std implements Serializable
{
	String name;
	int rollNo;
	transient Address add = new Address();
}


/*----------------------------------------------------------------------------------------*/


