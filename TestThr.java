class TestThr
{
	/*public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();//run()->used to do an action for a Thread
		for(int i=1;i<=5;i++)
		{
		   System.out.println("MainThread:"+i);
		}
	}
}

class MyThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("MyThread:"+i);
		}
	}
}*/

/*--------------------------------------------------------------------------------------------------------------*/

/*public static void main(String[] args) {
	MyThread t = new MyThread();
		t.start();//use to start the excecution of the thread
		t.setName("kimi");//it changes the name of the Thread
		Thread.currentThread().setName("xyz");//It returns a reference to the currently executing thread object.
		for(int i=1;i<=5;i++)
		{
		   System.out.println(Thread.currentThread().getName()+":"+i);//getName->It returns the name of the thread
		}
	}
}

class MyThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}

	public void start()
	{
		super.start();
	}
}*/

/*-----------------------------------------------------------------------------------------------------------------*/

/*public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();//run()->used to do an action for a Thread
		//Thread.currentThread().setPriority(10);//It changes the priority of the thread
		System.out.println(Thread.NORM_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
		for(int i=1;i<=5;i++)
		{
		   System.out.println("MainThread:"+i);
		}
	}
}

class MyThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("MyThread:"+i);
		}
	}
}*/

/*-----------------------------------------------------------------------------------------------------------------*/


/*public static void main(String[] args)throws Exception {
	MyThread t = new MyThread();
	t.start();                                                   //join()->deadlock situation
	MyThread.t = Thread.currentThread();
	t.join();
	for(int i=0;i<=5;i++)
	{
		System.out.println(Thread.currentThread().getName()+" :"+i);
	}
}
}

class MyThread extends Thread
{
	static Thread t;
	public void run()
	{
		try 
		{
			t.join();
		}
		catch(Exception e){}
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" :"+i);
		}
	}
}*/

/*-----------------------------------------------------------------------------------------------------------------*/

/*public static void main(String[] args)throws Exception {
	Thread.currentThread().join();
	//t.join();
	for(int i=0;i<=5;i++)
	{
		System.out.println(Thread.currentThread().getName()+" :"+i);
	}
}
}*/

/*-----------------------------------------------------------------------------------------------------------------*/


/*public static void main(String[] args)throws Exception {
	MyThread t = new MyThread();
	t.start();                                                   
	//MyThread.t = Thread.currentThread();
	//t.join();
	t.start();
	for(int i=0;i<=5;i++)
	{
		System.out.println(Thread.currentThread().getName()+" :"+i);
	}
}
}

class MyThread extends Thread
{
	static Thread t;
	public void run()
	{
		try 
		{
			t.join();
		}
		catch(Exception e){}
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" :"+i);
		}
	}
}*/

/*-----------------------------------------------------------------------------------------------------------------*/


/*public static void main(String[] args)throws Exception {
	MyThread t = new MyThread();
	t.start();                                                   
	MyThread.t = Thread.currentThread();
	t.join();
	t.start();
	for(int i=0;i<=5;i++)
	{
		System.out.println(Thread.currentThread().getName()+" :"+i);
	}
}
}

class MyThread extends Thread
{
	static Thread t;
	public void run()
	{
		try 
		{
			t.join();
		}
		catch(Exception e){}
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" :"+i);
		}
	}
}*/

/*-----------------------------------------------------------------------------------------------------------------*/

/*public static void main(String[] args)throws Exception {
	MyThread t = new MyThread();
	t.start();
	MyThread.t = Thread.currentThread();
	try 
	{
		Thread.currentThread().join();
	}
	catch(InterruptedException ie) 
	{
		System.out.println("Got Interrupted");
	}
	for(int i=0;i<=5;i++)
	{
		System.out.println(Thread.currentThread().getName()+" :"+i);
	}
}
}
class MyThread extends Thread
{
	static Thread t;
	public void run()
	{
		try 
		{
			t.interrupt();
		}
		catch(Exception e){}
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" :"+i);
		}
	}
}*/

/*public static void main(String[] args) {
	MyThread t = new MyThread();
	t.start();
	MyThread.t = Thread.currentThread();
	for(int i=0;i<=5;i++)
	{
		try 
		{
			System.out.println("I am sleeping...");
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println("Interrupted!");
		}
	}
	for(int i=0;i<=5;i++)
	{
		System.out.println(Thread.currentThread().getName()+" :"+i);
	}
}
}

class MyThread extends Thread
{
	static Thread t;
	public void run()
	{
		for(int i=1;i<=5;i++)
		{

		  try 
		  {
			t.interrupt();
		  }
		  catch(Exception e){}
			System.out.println(Thread.currentThread().getName()+" :"+i);
		}
	}
}*/

/*-----------------------------------------------------------------------------------------------------------------*/

public static void main(String[] args) {
	Task task = new Task();
	MyThread t1 = new MyThread(task,"ABC");
	t1.start();

	MyThread t2 = new MyThread(task,"XYZ");
	t2.start();
}
}

class MyThread extends Thread
{
	Task task;
	String name;
	MyThread(Task task,String name)
	{ 
		this.task = task;
		this.name = name;
	}
	public void run()
	{
		task.doTask(name);
	}
}
class Task
{
    synchronized static public void doTask(String name)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(name+" :"+i);
		}
	}
}