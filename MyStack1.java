import java.io.*;
class MyStack1
{
	public static void main(String[] args) {
		MainStack ms = new MainStack();
		ms.push(10);                         //push(): Insert a new element into the stack i.e just insert a new element at the beginning of the linked list.
		ms.push(20);                         //pop(): Return the top element of the Stack i.e simply delete the first element from the linked list.
		ms.push(30);                         //peek(): Return the top element.        
		ms.push(40);
		ms.push(50);
		ms.push(60);
		System.out.println(ms);
		// ms.pop();
		// System.out.println(ms);
		// ms.peek();
		// System.out.println(ms);
		System.out.println(ms.getTop());

	}
}

class MainStack        
{                                     
	private int capacity;
	private int top;
	private Object values[];
	MainStack()
	{
		capacity = 5;
		top = -1;
		values = new  Object[capacity];
	}
	public void push(Object val)
	{
		if(top==capacity-1)
		{
			inCreaseCapacity();
			// System.out.println("no space");
			// return;
		}
		values[++top] = val;
	}
	 public void inCreaseCapacity()
     {
     	capacity+=5;
     	Object val[] =new Object[capacity];
     	for(int i=0;i<=top;i++)
     	{
     		val[i]=values[i];

     	}
     	values = val;
     }
	public void pop()
    {
        System.out.println(values[top]);
        top--;
    }
    public void peek()
    {
        System.out.println(values[top]);    
    }
    public boolean isEmpty()
     {
     	return top==-1;
     }
     public int getTop()
     {
     	return top+1;
     }
	public String toString()
	{
		String s = "";
		for(int i=0;i<=top;i++)
		{
			s = s+" "+values[i];
		}
		return "("+s.substring(1)+")";
	}
}