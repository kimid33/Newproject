import java.util.*;
class TestGeneric7
{
	public static void main(String[] args) {
		Task <String>t1=new Task<String>();
		t1.setValue("hi");
		System.out.println(t1.getValue());
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

/*--------------------------------------------------------------------------------------------------*/
