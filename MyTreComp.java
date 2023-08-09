import java.util.*;
class MyTreComp
{
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyCompare());
		t.add(6);
		t.add(7);
		t.add(8);
		t.add(10);
		t.add(40);
		t.add(5);
		t.add(30);
		System.out.println(t);
	}
}

class MyCompare implements Comparator 
{
	public int compare(Object obj1,Object obj2)
	{
		Integer i1 = (Integer)obj1;
		Integer i2 = (Integer)obj2;
		//return -1;
		return i1.compareTo(i2);
	}
}