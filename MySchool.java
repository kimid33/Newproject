class MySchool
{
	public void teachers()
	{
		System.out.println("teaching");
	}
    public void students()
    {

    }

}

class Stud
{
	public static void main(String[] args) {
		MySchool s = new MySchool(){
			public void students()
			{
				System.out.println("learning");
			}
		};s.students();
		new MySchool().teachers();
	}
}