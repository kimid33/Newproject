public class PrimeNumber{

public boolean isprimeNumber(int n){
	int i;
	if(n==1)
		return true;
	for(i=2;i<=n/2;i++){
		if(n%i==0)
			return false;
	}
	return true;
}
public static void main(String[] args) {
	PrimeNumber pon=new PrimeNumber();
     if(pon.isprimeNumber(11))
     	System.out.println("This is a prime number");
     else 
     	System.out.println("Is not prime number");

}
}	
