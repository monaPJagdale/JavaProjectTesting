package variableStudy;

public class D {
    int x=100;
    int y=200;
    static int z=300;

    static void main(String[] args) {
        D d=new D();
        d.add();
        //d.sub();
        D d1=new D();
        d1.sub();

        C c=new C(); //create object of class C in Class D

        int sum =c.a+100; //using object of class C refer the value of a in D class
                          //because it is a non static global variable
        System.out.println(sum);

         int sum2= C.b+100; //using class name C refer value of b in D  class
                            //because b is static global variable
         System.out.println(sum2);
    }
    public void  add()
    {
        int x=10;
        int sum=x+this.x;
        System.out.println(sum);
        y=500;
        int sum1=y+x;
        System.out.println(sum1);
    }
    public void sub()
    {
        int sub =y-this.x;
        System.out.println(sub);
    }
}
