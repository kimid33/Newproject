public class Factorial{
	private int n;
	private int i;

public static int isFactorialNumber(int n){
	int i,fact=1;
	for(i=1;i<=n;i++){
		fact=fact*i;
	}
	return fact;
}
public static void main(String [] args){
	Factorial fact=new Factorial();
	System.out.println(fact.isFactorialNumber(6));
}
}