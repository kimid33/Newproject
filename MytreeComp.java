import java.util.*;
class MytreeComp
{
	public static void main(String[] args) {
		TreeSet t = new TreeSet(New MyCompare());
		t.add(10);
		t.add(20);
		System.out.println(t);
	}
}

class MyCompare implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Integer i1 = (Integer)obj1;
		Integer i2 = (Integer)obj2;
		return 0;
	}
}