package variableStudy;

public class G {
    int a=10;   //global variable with value access all over the class it is by default non static
    static int b=30; //static global variable with value access all over the class

    static void main(String[] args) {
        G g=new G();
        g.Display();
        show();
    }
    public void Display(){  //non static method
        int c=20;
        int d=c+this.a;     //here we use non static global variable
        System.out.println(d); //30

        System.out.println("*****************");
        int a=1;  //here change the value of global variable called as local veriable and scope of this variable int this block only
        int sum=a+b; //use neares value of a and sum using static global variable
        System.out.println(sum); //31
    }
    public static void show()
    {
        int a=20;
        int sum=G.b+a;
        System.out.println(sum);
    }
}
