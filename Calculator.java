public class Calculator{
	private int result;
	public int sum(int num1,int num2){
		result=num1+num2;
		return result;
	}
	public int sub(int num1,int num2){
		result=num1-num2;
		return result;
	}
	public int multi(int num1,int num2){
		result=num1*num2;
		return result;
	}
	public int div(int num1,int num2){
		result=num1/num2;
		return result;
	}
	public int mod(int num1,int num2){
		result=num1%num2;
		return result;
	}
public static void main(String [] args){
	Calculator calc=new Calculator();
	System.out.println(calc.sum(10,10));
	System.out.println(calc.sub(10,5));
	System.out.println(calc.multi(10,5));
	System.out.println(calc.div(30,5));
	System.out.println(calc.mod(10,2));
    }
}