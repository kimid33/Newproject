class JavaRevision
{
	public void m1()
	{
		System.out.println("m1 is calling");
	}
	public void m2()
	{
		System.out.println("m2 is calling");
	}
	public static void main(String[] args) {
		JavaRevision jr = new JavaRevision();
		jr.m1();
	}
}