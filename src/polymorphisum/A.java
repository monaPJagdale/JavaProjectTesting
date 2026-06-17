package polymorphisum;

public class A {
    //in single class multiple methods with same name with different parameters called as method overloading
    static void main(String[] args) {
        A a=new A();
        a.addition();
        a.addition(10);
        a.addition("mona");

    }
    public void addition()    //non static without parameter method
    {
        int a=10;
        int b=20;
        int sum=a+b+1;
        System.out.println(sum);
    }

    public void addition(int a)  //non static method with different parameter
    {
        int sum=a+1;
        System.out.println(sum);

    }
    public void addition(String name) //non static method with different method
    {
        System.out.println(name);
    }

public static void addition(float a){
        float sum=a+1;
        System.out.println(sum);
}
    }
