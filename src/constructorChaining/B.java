package constructorChaining;
public class B extends A{
    static void main(String[] args) {
        B b=new B();


    }
    public B()                     //user defined zero parameter constructor
    {
         this("mona");
        System.out.println("hello world");
    }
    public B(String a)              //user defined with parameter constructor
    {
        System.out.println(a);
    }
}
