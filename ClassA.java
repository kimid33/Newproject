public class ClassA
{
	public static void m1(){
	    System.out.println("m1 is calling");
	    ClassA aob=new ClassA();
	    aob.m2();
        }
    public void m2(){
        System.out.println("m2 is calling");
        ClassA aob=new ClassA();
        aob.m3();
        }
    public void m3(){
    	System.out.println("m3 is calling");
    	ClassA aob=new ClassA();
    	aob.m4();
        }
    public void m4(){
        System.out.println("m4 is calling");
    }
public static void main(String [] args){
	ClassA aob=new ClassA();
	aob.m1();
    }
}