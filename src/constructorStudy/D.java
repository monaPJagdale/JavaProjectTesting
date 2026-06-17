package constructorStudy;

public class D {
    int x = 100;   //global variables with value
    int y = 200;
    int z;  //global variable with default value 0

    static void main(String[] args) {
        D d = new D();
        d.display();
        d.show();
    }

    public void display() {
        int x = 10; //local variable with value
        y = 300;     //global variable with change value
        int sum = x + y; //at the run time compiler use nearest value of x
        System.out.println("Sum is " + sum);//310
        int sum1 = this.x + y;//call global variable using this keyword
        System.out.println("Sum1 is " + sum1); //400
        int a = 20;   //local variable and print
        int sum2 = this.x + a;
        System.out.println("print sum2 " + sum2);//120
        System.out.println("value of a is " + a);//20
        System.out.println(" value of global value z " + z);  //by default 0

        y = 800;
        System.out.println(" value of global value y " + y);
        int addition = this.x + y;
        System.out.println("Addition is " + addition);//900


    }

    public void show() {
        int a = 40; //local variable use in single method scope
        int sub = this.x - a; //global variables use exclusively in program using this keyword
        System.out.println("sub is " + sub);//60
        int substraction = this.y-x; //substraction of global variables
        System.out.println("substraction is " + substraction);//700

    }


}
