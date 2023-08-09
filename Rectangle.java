public class Rectangle{
	private int rectangle;
	private int l;
	private int b;
	public int areaofRectangle(int l,int b){
        rectangle=l*b;
        return rectangle;
	}
	public int perimeterofRectangle(int l,int b){
		rectangle=2*(l+b);
		return rectangle;
	}
public static void main(String [] args){
	Rectangle roc=new Rectangle();
	System.out.println(roc.areaofRectangle(5,3));
	System.out.println(roc.perimeterofRectangle(3,4));

	}
}
