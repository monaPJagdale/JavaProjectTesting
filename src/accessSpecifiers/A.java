package accessSpecifiers;

public class A {
    //private
    //default
    //protected
    //public

    //thumb rule=Variables are defined in the class but outside  the methods
     private int a=10;   //access with in class only
     int b=30;           //access with in pacakage only
     protected  int c=40; //access with package and sub class of other package using inhertance concept
     public int d=50;     //through out the project

    static void main(String[] args) {
        A a=new A();
        int sum=1+a.a+a.b+a.c+a.d;     //all variable are accessible
       System.out.println(sum);

       a.test1(); a.test2(); a.Test3();a.Test4();
        //all methods are accessible
    }


    private void test1()
    {
        System.out.println("Private method of class A only");
    }
    void test2()
    {
        System.out.println("Default method of class A with same package only access");
    }
    protected void Test3(){
        System.out.println("Protected method same package and another package using Inheritance ");
    }
    public void Test4()
    {
        System.out.println("Public method use all over the project");
    }

    }



