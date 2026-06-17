package constructorStudy;
//constructor name is same as class name
//constructor is basically a method
//constructor not exclusively  call
//constructor by default non static
//constructor do not have return type
//in one class we can create multiple constructor but with different parameters and arguments
//two types -default constructor and user define constructor
//use-to intialize variables or arguments

public class A {
    static void main(String[] args) {
        A a = new A();   //by default constructor
      A a1=new A(40,60);

    }

    public A()    //constructor without parameter
    {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("sum is " + sum);

    }

    public A(int c, int d)//constructor with parameter
    {
        int sum = c + d;
        System.out.println("sum is " + sum);
    }

}
