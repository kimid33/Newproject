public class AreaOfCircle{
	private int r;
	private int a;
	private int circle;
public int areaofCircle(int a){
	circle=22/7*a*a;
	return circle;
}
public int circumferenceofCircle(int r){
	circle=2*22/7*a;
	return circle;
}
public int diameterofCircle(int a){
	circle=2*a;
	return circle;
}
public int radiusofCircle(int r){
	circle=r*r;
	return circle;
}
public static void main(String [] args ){
	AreaOfCircle crc=new AreaOfCircle();
	System.out.println(crc.areaofCircle(4));
	System.out.println(crc.circumferenceofCircle(3));
	System.out.println(crc.diameterofCircle(4));
	System.out.println(crc.radiusofCircle(6));
}
}