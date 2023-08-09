class Test
{
    /*int a;
    int b;
    void m1()
    {
        System.out.println("m1:"+a);
    }
    void m2()
    {
        System.out.println("m2:"+b);
    }
    public static void main(String []args)
    {
        Test ob1 = new Test();
        Test ob2 = new Test();
        Test ob3 = new Test();
        ob1.a = 100;
        ob2.a = 200;
        ob3.b = 500;
        ob1.m1();
        ob2.m1();
        ob3.m2();
    }*/
    public void m1()
    { 
        C2 obj = new C2();
        obj.m1();
        //System.out.println("m1");

    }
    public void m2()
    {
       System.out.println("hello");
    }
class C2
{

    public void m1()
    {
         System.out.println("Test1 m1 is calling");
    }
    public void m2()
    {

    }
}

public static void main(String [] args)
{
    Test obj1 = new Test();
    obj1.m2(); 
    obj1.m1();
}
}
 