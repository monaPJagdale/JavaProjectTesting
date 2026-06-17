package polymorphisum;

public class Sample {
    //main method is by default static method
    //identity by main keyword
    //it is heart of program-execution starts from main method
    static void main(String[] args) {
      Sample sample=new Sample();
      sample.main();       //there is possible to write multiple methods name as main in same class
                           //called as method overloading
      sample.main(10);


      sample.a();          //regular methods static non static can be overloaded
      a("gatha");

      sample.c();    //private static non static methods overload but cant be override
      c(1);



    }
    //there is possible to write multiple methods name as main in same class
    //called as method overloading

    public void main()  //non static without parameter method same as name main
    {
        System.out.println("ok");
    }
    public void main(int a)  //non static with parameter method same as name main
    {
        System.out.println(a);
    }

    public static void main(String name)  //'main()' is already defined in 'polymorphisum.Sample
    {                           //only non static methods are crete cant suppor static method

    }




    public void a()             //non static without parameter method
    {
        System.out.println("posible");
    }
    public static void a(String name)  // static method with parameter method name same as non-static method
    {
        System.out.println(name);
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
