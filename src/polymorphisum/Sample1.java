package polymorphisum;

public class Sample1 extends Sample {
    static void main(String[] args) {
       Sample sample=new Sample();
       sample.main();
        sample.main(20);


        Sample1 sample1=new Sample1();
        sample1.main();
        sample1.main();  //super class methods
        sample1.a();
        //Sample1.main("mona");//cant override static method
        sample1.b(30);
        b();              //base class methods
        sample1.c();
        Sample1.c(1);  //private method


    }
    public void a()   //non static method can be override
    {
        System.out.println("override");
    }
//    public void a(String name)     //cant override the static method //ststic method always remains with class
//    {
//        System.out.println(name);
//    }

    public static void b()   //regular method
    {
        System.out.println(" Static method of own class");

    }
    public  void b(int b)   //non static regular method
    {
        System.out.println(b);

    }

    private  void c()
    {
        System.out.println("not possible to overiide possible to overload");

    }
    private static void c(int a)
    {
        System.out.println(a+ " not possible to overiide possible to overload");

    }
}
