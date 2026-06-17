package constructorStudy;

public class C {
    int x = 100;      //value assign to the global variable
    int y = 200;      //value assign to the global variable
    int z;          //default value 0

    static void main(String[] args) {
        C c = new C();
        c.display();
        c.show();
    }

    public void display() {
        int x = 10;   //local variable
        y=400;      //global variable ..change its value
        int sum = x + y;  //use nearest local variable +use nearest change value of global variable
        System.out.println("sum is " + sum);//410
        int sum1 = this.x + y;//call global value of x using this keyword in the presence of local variable
        System.out.println("Sum1 is " + sum1);//500
        int a = 20;       //local variable
        System.out.println("value of a is " + a);//20
        System.out.println("value of z is " + z); //global value by default 0 value print
        z = 300; //change the value of global variable z
        System.out.println("value of z is " + z); //assign value to global value and print


    }

    public void show() {
        int a = 50;  //local variable
        // local variables in method are not exclusively use in another method
        int sub = a + this.x + y; //but global variables are use using this keyword
        System.out.println("Sub is " + sub);//550
    }


}
