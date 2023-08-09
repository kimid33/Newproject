import java.util.*;
class TestGenericF
{
	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(22);
		System.out.println(al);
	}
}


class TestG
{
	public static void main(String[] args) {
		ArrayList<String>al= new ArrayList<String>();
		al.add("hello");
		al.add("kimi");
		System.out.println(al);
	}
}

class TestG1
{
	public static void main(String[] args) {
		ArrayList<Character>al = new ArrayList<Character>();
		al.add('a');
		al.add('A');
		System.out.println(al);
	}
}

class TestG2
{
	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<Integer>();
		//al.add("hello");   //string cannot be converted to integer
		al.add(10);
		System.out.println(al);
	}
}

class MyGen<T>
{
	T obj;
	void add(T obj)
	{
		this.obj=obj;
	}
	T get()
	{
		return obj;
	}
}

class TestG3
{
	public static void main(String[] args) {
		MyGen<Integer>m = new MyGen<Integer>();
		m.add(10);
		System.out.println(m.get());
	}
}

class TestG4
{
	public static void main(String[] args) {
		MyGen<String>s = new MyGen<String>();
		s.add("hihello");
		System.out.println(s.get());
	}
}

class TestG5
{
	public static void main(String[] args) {
		MyGen<Character>c = new MyGen<Character>();
		c.add('A');
		System.out.println(c.get());
	}
}
/*-----------------------------------------------------------------------------------------------*/

class TestGFeature
{
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add("hii");
		show(al);
	}
	public static void show(ArrayList al)
	{
		int sum=0;
		for(int i=0;i<=al.size();i++)
		{
			Integer il=(Integer)al.get(i);
			sum=sum+il;
		}
		System.out.println(sum);
	}
}

class TestG6
{
	public static void main(String[] args) {
		Task <String>t=new Task<String>();
		t.setValue("indore");
		System.out.println(t.getValue());
	}
}

class Task<T>
{
	T obj;
	public void setValue(T obj)
	{
		this.obj = obj;
	}
	public T getValue()
	{
		return obj;
	}
}

/*----------------------------------------------------------------------------------------------*/
class TestGFeature1
{
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add("hii");
		show(al);
	}
	public static void show(ArrayList al)
	{
		int sum=0;
		for(int i=0;i<=al.size();i++)
		{
			Integer il=(Integer)al.get(i);
			sum=sum+il;
		}
		System.out.println(sum);
	}
}

/*--------------------------------------------------------------------------------------------*/

