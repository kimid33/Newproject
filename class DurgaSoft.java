class DurgaSoft{
	
	public static void m1(){
		System.out.println("var-arg methods");
	}
	public static void main(String[] args) {
		m1();
		m1(10);
		m1(10,20,30);
		m1(12,32,43,88,99);
	}
}