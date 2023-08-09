class StringAdd
{
	
public static void main(String [] args)
{
	/*String s = "50+50";
	int i = s.indexOf("+");                             //operation perform(inside the string)
	int n1 = Integer.parseInt(s.substring(0,i));
	int n2 = Integer.parseInt(s.substring(i+1));
	System.out.println(n1+n2);*/

	/*String s = "  hello hi how are you   ";
	System.out.println("|"+s+"|");
	s = s.substring(2);                                //first and last space remove
	s = s.substring(0,21);
	System.out.println("|"+s+"|");*/

	String s1 = "hello";
	String s2 = new String("hello");
	System.out.println(s1==s2);           //false
    System.out.println(s1.equals(s2));      //true
   
} 
}