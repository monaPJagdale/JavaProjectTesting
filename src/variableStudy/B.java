package variableStudy;

public class B {
    int a=10; //global variable with value (non static variable)
    static  int b=20; //static global variable with value (font -italic)

    static void main(String[] args) {
        B b=new B();
        b.display();
        B.show();

    }
    public void display()  // non static method
    {
        int a=30; //local variable by default non static variable
       // static int b=10; //error-not allowed
        int sum =a+100;    //nearest value of a
        System.out.println(sum);

        int sum1 =this.a+a;
        System.out.println(sum1);

        int sum2= B.b+a;    //static variable  using classname.
        System.out.println(sum2);



    }

    public static void show(){
         int a=80; //local variable
         int  b=30;
         int sub=a-b;
         System.out.println(sub);

         //int sub1=this.a-b;

        int sub1= b-B.b; //static variable
        System.out.println(sub1);

        //static int  c=90; //static variable can't declare in static method also
    }
}
