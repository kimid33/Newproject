class ChinesePoint
{
	public void noodles()
	{
		System.out.println("normal taste");
	}
}

class Test
{
	public static void main(String[] args) {
		new ChinesePoint(){
			public void noodles()
			{
				System.out.println("spicy taste");
			}
		}.noodles();
		new ChinesePoint().noodles();
	}
}