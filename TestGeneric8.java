import java.util.*;
class TestGeneric8
{
	public static void main(String[] args) {
		Task <String>t1=new Task<String>();
		//t1.setValue(10);//error
		t1.setValue("hi");
		System.out.println(t1.getValue());
	}
}

class Task1<T extends Number>//Object
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

/*---------------------------------------------------------------------------------------------------*/

class TestGeneric9
{
	public static void main(String[] args) {
		Task <String>t1=new Task<String>();
		//t1.setValue(10);//error
		t1.setValue("hihellohi");
		System.out.println(t1.getValue());
	}
}

class Task2<T extends Runnable>//Object
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