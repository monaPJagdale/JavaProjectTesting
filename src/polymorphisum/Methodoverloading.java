package polymorphisum;

import java.security.PublicKey;

public class Methodoverloading {
    static void main(String[] args) {
        Methodoverloading methodoverloading=new Methodoverloading();
        methodoverloading.show1();
        methodoverloading.show1(2);
        methodoverloading.show1("method overloading");
        Methodoverloading.show1(2,2);
    }
    public void show1()
    {
        System.out.println("method");

    }
    public void show1(int a)
    {
        int sum=a+1;
        System.out.println(sum);

    }
    public void show1(String name)
    {
        System.out.println("same name with different arguments non static method");

    }
    public static void show1(int b,int a)
    {
        int sum=a+b;
        System.out.println(sum);


    }

}
