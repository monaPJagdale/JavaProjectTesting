package InterfaceStudy;

public class MyClass implements MyInterface{ //to complete abstract methods in interface create normal class
    //  implements keyword is used to complete methods of interface in normal class (overrides)
    static void main(String[] args) {
        MyClass myClass=new MyClass();
        myClass.test1();
        myClass.test2();   //allow to create the class of implements class for execution of interface
        myClass.test3();
        test4();
    }
    @Override
    public void test1() {
        System.out.println("complete using Implements keywords ");
    }

    @Override
    public void test2() {
        System.out.println("complete using Implements keywords ");

    }
    public void test3()
    {
        System.out.println("own class non static method ");

    }
    public static  void test4()
    {
        System.out.println("own class  static method ");

    }

}
