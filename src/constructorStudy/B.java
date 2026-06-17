package constructorStudy;

public class B {
    int x;   //global variables
    int y;  //global variables
    //  global variables have not define vlaue
    //called as non static variables
    //default value 0


    static void main(String[] args) {
        B b = new B();
        b.sum();
        B b1=new B(40,50);   //values assign at the call time
        b1.sum();

    }

    public B()     //constructor without parameter
    {
        x = 10;
        y = 20;
    }
    public B(int a,int b){   //constructor with parameter
        x=a;                 //here assign the value of a to x
        y=b;                  //here assign the value of b to y
    }

    public void sum() {    //method for execution
        int sum = x + y;
        System.out.println(" sum is " + sum);
    }


}