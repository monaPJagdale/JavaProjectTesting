package polymorphisum;

public class B extends A {

    private static B b;

    static void main(String[] args) {
        b = new B();
        b.addition();//71 class b
        b.addition();//31 class A

        b.addition(1);//2 class B
        b.addition(2);//3 class A
//same parameter of non static method so use the Object of own class to call
        b.addition("jagdale"); //jagdale calss B
        A a = new A();
        a.addition("mona");    //u
//same parameter of  static method so use the Object of own class to call
        B.addition(2.2f);//2.2
        A.addition(4.4f);//5.4


    }

    public void addition() {
        int a = 30;
        int b = 40;
        int sum = a + b + 1;
        System.out.println(sum);
    }

    public void addition(int a) {
        int sum = a + 1;
        System.out.println(sum);
    }

    public void addition(String Surname) {
        System.out.println(Surname);
    }

    public static void addition(float b) {

        System.out.println(b);
    }

}
