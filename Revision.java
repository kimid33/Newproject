import java.util.*;
abstract class Revision
{

/*public void fun()
{
	System.out.println("hello fun");
	new Revision().fun4();
}

public void fun1()
{
	System.out.println("hello fun1");
}

public void fun2()
{
	System.out.println("hello fun2");
	new Revision().fun3();
}

public void fun3()
{
	System.out.println("hello fun3");
}
	

public void fun4()
{
	System.out.println("hello fun4");
}
public static void main(String[] args) {
	Revision r = new Revision();
	r.fun();
	r.fun2();
}*/


/*public static void main(String[] args)  {
	String str = "kimi";                            //string reverse
	char ch[] = str.toCharArray();
	int s=0,e=ch.length-1;
	int f=1;
	char temp;
	while(s<e)
	{
		temp = ch[s];
		ch[s] = ch[e];
		ch[e] = temp;
		s++;
		e--;
	}
	System.out.println(ch);
}*/

/*public static void main(String[] args) {
	String str = "kimi";
	char ch[] = str.toCharArray();              //check string is palindrome or not
	int f=0;
	int s=0,e=ch.length-1;
	while(s<e)
	{
	   if(ch[s]!=ch[e])
	    {
		 f=1;
		 System.out.println("is not palindrome");
		 break;
	    }
		 s++;
		 e--;
	}
	if(f==0)
	{
		System.out.println("is palindrome");
	}
}*/

/*public static void main(String[] args) {
	String str = "hello this is test";
	char ch[] = str.toCharArray();             //word count
	int count = 0;
	for(int i=0;i<=ch.length-1;i++)
	{
		if(ch[i]==' ')
		{
			count++;
		}
	} 
	System.out.println(count+1);
}*/


/*public static void main(String[] args) {
	String str = "hello indore";
	char ch[] = str.toCharArray();                     //replace char from string
	char r='o',f='e';
	for(int i=0;i<=ch.length-1;i++)
	{
		if(r==ch[i])
		{
			ch[i] = f;
		}
	}
	System.out.println(ch);
}*/

 
/*public static void main(String[] args) {
	String s = "hello world";
	char ch[] = s.toCharArray();
	//char c = 'e';
	for(int i=1;i<ch.length-1;i++)
	{
		ch[i] = ch[i+1];
	}
	System.out.println(ch);
}*/

/*public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);             //input from user
	System.out.println("Enter first number");
	int a = sc.nextInt();
	System.out.println("Enter second number");
	int b = sc.nextInt();
	System.out.println("sum is"+"->" +(a+b));
}*/

/*public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first string");
	String s = sc.nextLine();
	System.out.println("Enter second string");
	String s1 = sc.nextLine();
	System.out.println("concat string is"+ "->"+ s+""+s1);
}*/

/*private Revision() //compile time error 
{

}
void msg()
{
	System.out.println("hello java");
}
}
class Sample
{
	public static void main(String[] args) {
		Revision r = new Revision();
		r.msg();
	}*/

	//public static void main(String[] args) {
		// int String = 888; //not recommended because string is a predefine class
		// System.out.println(String);

		//int Runnable = 999;// not recommended its a worst programming because runnable is a interface
		//System.out.println(Runnable);//because its reduces readability 
	//}


	abstract void fun();
}

	class New extends Revision{

		void fun(){
			System.out.println("fun running");
		}

	public static void main(String[] args) {
		Revision r = new New();
		r.fun();
	}
}
