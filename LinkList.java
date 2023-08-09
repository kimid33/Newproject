class Node
{
	private Object data;
	private Node next;

Node(Object data)
{
	this.data = data;
}
public void setData(Object val)
{
	this.data = data;
}
public Object getData()
{
	return data;
}
public void setNext(Node next)
{
	this.next = next;
}
public Node getNext()
{
	return next;
}
}

class LinkList
{
	Node start,last;
	int size;

  LinkList()
  {
  	start = last = null;
  	size = 0;
  }
public void addFirst(Object val)
{
	Node n = new Node(val);
	if(start==null)
	{
		start = last = n;
	}
	else 
	{
		n.setNext(start);
		start = n;
	}
	size++;
}
public String toString()
{
	String s = "";
	Node t = start;
	while(t!=null)
	{
		s = s+","+t.getData();
		t = t.getNext();
	}
	s = "["+s.substring(1)+"]";
	return s;
}
public void addLast(Object val)
{
	Node n = new Node(val);
	if(start==null)
	{
		start = last = n;
	}
	else 
	{
		last.setNext(n);
		last = n;
	}
	size++;
}
public int indexOf(Object val)
 {
 	Node t = start;
 	int c=1;
 	while(t.getNext()!=null)
 	{
 		if(t.getData()==val)
 		{
 			break;
 		}
 		c++;
 		t=t.getNext();
 	}
 	return c;
 }
 public Object valueOf(int index)
 {
 	Node t = start;
 	int c=1;

 	while(t.getNext()!=null)
 	{
 		if(c==index)
 		{
 			break;
 		}
 		c++;
 		t=t.getNext();
 	}
 	return t.getData();
 }
public Object getFirst()
{

	return start.getData();
}
public Object getLast()
{

	return last.getNext();
}
 public Object remove(int val)
 {
 	//start = start.getNext();
 	return start=start.getNext();
 }

 public void removeLast()
 {
 	Node t = start;
 	while(t.getNext().getNext()!=null)
 	{
 		t = t.getNext();
 	}
 	t.setNext(null);
 }
}
class Test
{
	public static void main(String[] args) {
		LinkList l = new LinkList();
		l.addLast(10);
		l.addLast(20);
		l.addLast(30);
		l.addLast(20);
		System.out.println(l);
		System.out.println(l.indexOf(30));
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		System.out.println(l.valueOf(3));
		l.remove(2);
		System.out.println(l);
		l.removeLast();
		System.out.println(l);
	}
}
