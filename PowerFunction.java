public class PowerFunction{
	private int n;

public static int powerNumberFunction(int n){
	int i,p=3,s=1;
	for(i=1;i<=p;i++){
		s=s*n;
	}
	return s;
}
public static void main(String [] args){
	PowerFunction power=new PowerFunction();
	System.out.println(power.powerNumberFunction(2));
}
}