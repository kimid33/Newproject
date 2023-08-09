class NewOuter
{
	/*class Inner
	{
		public void m1()
		{
			System.out.println("outer m1");
		}
	}
public static void main(String[] args) {
		NewOuter o = new NewOuter();
		Inner i = o.new Inner();
		i.m1();
	}*/	

/*----------------------------------------------------------------------------------------------
***To access the inner class, create an object of the outer class, and then create an object of the inner class:*/


/*class Inner
	{
		public void m1()
		{
			System.out.println("outer m1");
		}
	}
public static void main(String[] args) {
		new NewOuter().new Inner().m1();
	}*/



/*class Inner                   //One advantage of inner classes, is that they can access attributes and methods of the outer class:
	{
		public void m1()
		{
			System.out.println("outer m1");
		}
	}
public static void main(String[] args) {
		NewOuter o = new NewOuter();
		o.fun();
	}	

    public void fun()
    {
    	Inner i = new Inner();
    	i.m1();
    }*/	


/*----------------------------------------------------------------------------------------------*/

class Inner
{
public void m1()
		{
			System.out.println("outer m1");
		}
	}
}
class Test
{
    public static void main(String[] args) {
		NewOuter o = new NewOuter();
		NewOuter.Inner i = o.new Inner();
		o.m1();
	}	

}


