public class EvenNumber{

public boolean isEvenNumber(int n){
	if(n%2==0)
	{
		return true;
	}
	return false;
}
public static void main(String [] args){
	EvenNumber evn=new EvenNumber();
	if(evn.isEvenNumber(4));
	{
	System.out.println("this is even number");
    }
}
} 