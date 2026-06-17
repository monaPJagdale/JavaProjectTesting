package loopStudy;

public class Pre_incrementDecrement {
    static void main(String[] args) {
        System.out.println("Pre Increment=1st increment then assign");
         int a=10;
         int b=20;
         int m=-10;

         int x=++a;
         System.out.println("a-->"+a); //11
        System.out.println("x--->"+x); //11

        int y=++b;
        System.out.println("b-->"+b); //21
        System.out.println("y-->"+y); //21
        System.out.println("===============");
        int n=++m;
        System.out.println("m-->"+m);
        System.out.println("n-->"+n);

        System.out.println("Pre Decrement=1st decrement then assign");

        int c=10;
        int d=20;
        int e=-10;

        int p=--c;
        System.out.println("c--->"+c); //9
        System.out.println("p--->"+p); //9

        int q=--d;
        System.out.println("d--->"+d);//19
        System.out.println("q--->"+q);//19
        System.out.println("===============");
        int r=--e;
        System.out.println("e--->"+e);
        System.out.println("r--->"+r);



    }
}
