import java.util.ArrayList;
import java.util.*;
class ArrListRev
{
	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);

		list.add(4);//this will add 4 at the end of the list
		System.out.println(list);

	/*	ArrayList<Integer> newlist = new ArrayList();
		newlist.add(100);
		newlist.add(102);
		list.addAll(newlist);//this will add all the element
		System.out.println(list);

		System.out.println(list.get(1));//we can get position of any element*/

		/*list.indexOf(1);
		System.out.println(list);

		list.set(2,1000);
		System.out.println(list);
		System.out.println(list.contains(50));*/

	}
}