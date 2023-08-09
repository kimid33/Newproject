import java.util.*;
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

class StackLink
{
	Node top;
	int size;

	StackLink()
	{
		top = null;
		size = 0;
	}
	public void push(Object val)
{
	Node n = new Node(val);
	if(top==null)
	{
		top = n;
	}
	else 
	{
		n.setNext(top);
		top = n;
	}
	size++;
}
public String toString()
{
	String s = "";
	Node t = top;
	while(t!=null)
	{
		s = s+","+t.getData();
		t = t.getNext();
	}
	s = "["+s.substring(1)+"]";
	return s;
 }
 public Object pop()
 {
 	if(top==null)
 	{
 		return null;
 	}
 	Object ob = top.getData();
 	top = top.getNext();
 	size--;
 	return ob;
 }

 public Object peek()
 {
 	return top.getData();
 }
}

class Test 
{
	public static void main(String[] args) {
		StackLink sl = new StackLink();
		sl.push(10);
		sl.push(20);
		sl.push(30);
		sl.push(40);
		sl.push(50);
		System.out.println(sl);
		sl.pop();
		sl.pop();
		sl.pop();
		System.out.println(sl);
		// sl.peek();
		// System.out.println(sl.peek());

	}
}
