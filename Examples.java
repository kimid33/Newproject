class Examples
{
	
public static void main(String [] args)
{
	/*Integer i = 10;
	int a = i.intValue();           wrapor to primitive convirson
	System.out.println(a);*/


    /*Integer i = 10;
    int a = 20;                      primitive to wrapor(auto boxing)
    i = Integer.valueOf(a);//i=a;
    System.out.println(a);*/

    /*Integer i = 20;
    int a = 30;                      //wrapor to string
    String s = i.toString();
    System.out.println(s);*/

    /*String s = "40";
    int a = Integer.parseInt(s);      //string to primitive
    System.out.println(a);*/

    String s = "144";
    int a = Integer.parseInt(s,16);
    System.out.println(a);

 }
}