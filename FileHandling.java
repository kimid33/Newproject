import java.io.*;
class FileHandling
{
	

public static void main(String[] args) throws Exception{
	File f = new File("C://");
	//System.out.println(f.exists()); 
	if(f.exists())
	{
		if(f.isDirectory())
		{
			String files[] = f.list();
			for(String s:files)
			{
				System.out.println(s);
			}
		}
		else
			System.out.println("File is exist");
	}
	else 
	{
		f.mkdir();
		System.out.println("new folder is created");
		/*f.createNewFile();
		//System.out.println("File not exist");
		System.out.println("new file is created");*/
	}
}

}
