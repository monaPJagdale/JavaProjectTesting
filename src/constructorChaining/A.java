package constructorChaining;

public class A {
    static void main(String[] args) {
        A a=new A();

    }
    public A()
    {
        this(10);
        System.out.println("user defined with zero parameter constructor");

    }
     private A(int a)
    {
        this("mona");
        System.out.println("user defined with parameter constructor");
        System.out.println(a);
    }
    public A(String a)
    {
        System.out.println("user defined with different parameter constructor");
        System.out.println(a);
    }
}
