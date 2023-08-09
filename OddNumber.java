public class OddNumber{
	
public boolean isOddNumber(int n){
	if(n%2!=0){
		return true;
	}
	return false;
}
public static void main(String [] args){
	OddNumber nod=new OddNumber();
	if(nod.isOddNumber(3)){
		System.out.println("this is odd number");
	}

}
}