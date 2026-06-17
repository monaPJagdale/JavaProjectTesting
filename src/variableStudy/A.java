package variableStudy;

public class A {
    int a = 10; //global variable with value
    static int b = 20; //static global variable with value

    static void main() {
        A a = new A();
        a.display();
        A.show();

    }

    public void display() {
        int a = 30;  //local variable by default non static variable
        //static int c=100;  //static variable not allowed here -error
        int sum = a + 100;      //take nearest value of a and sum(local variable)
        System.out.println(sum);

        int sum1 = this.a + 100; //global variable using this keyword
        System.out.println(sum1);

        int sum2 = A.b + a;      //static global variables can be use in non static method using class name
        System.out.println(sum2);

    }

    public static void show() {
        int a = 50; //local variable of static method
        int b = 40; //local variable
        int sub = a - b;
        System.out.println(sub);

        // int sub1=this.a-b; // static method can't use this keyword to use global variable

        int sub1 = b - A.b;    //static method using class name refer the value of static variable
        System.out.println(sub1);

    }
}

