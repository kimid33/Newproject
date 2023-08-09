class MyRunn
{
	public static void main(String[] args) {
		new Thread(new Runnable(){
			public void run()
			{
				for(int i=0;i<=5;i++)
				{
					System.out.println(Thread.currentThread().getName()+":"+i);
				}
			}
		}).start();
        
        for(int i=1;i<=5;i++)
        {
        	System.out.println(Thread.currentThread().getName()+":"+i);
        }
	}
}