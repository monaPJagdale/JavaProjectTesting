package method;

public class MethodStudy {
    //main method declaration
    static void main(String[] args) {
        Test();
        Test1();                         //regular method call
        Test2();

        MethodStudy methodStudy=new MethodStudy();
        methodStudy.Test3();
    }
    public static void Test()
    {
        System.out.println("Hello");
    }                                       //regular method declaration within class
    public static void Test1()
    {
        System.out.println("Welcome To");
    }
    public static void Test2()
    {
        System.out.println("Java");
    }
    public void Test3()
    {
        System.out.println("practice");
    }

}

