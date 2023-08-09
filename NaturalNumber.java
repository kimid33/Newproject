public class NaturalNumber
{
	private int sum;
	public int sumofNNaturalNumber(int n)
	{
	sum=n*(n+1)/2;
	return sum;
	}
	public int sumofEvenNaturalNumber(int n){
		sum=n*(n+1);
		return sum;
    }
    public int sumofOddNaturalNumber(int n){
    	sum=n*n;
    	return sum;
    }
public static void main(String [] args)
{
	NaturalNumber nob=new NaturalNumber();
	System.out.println(nob.sumofNNaturalNumber(10));
	System.out.println(nob.sumofEvenNaturalNumber(10));
	System.out.println(nob.sumofOddNaturalNumber(10));
	}
}