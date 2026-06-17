package loopStudy;

public class A {
    static void main(String[] args) {
        int a=10;
        int b=80;
        System.out.println(a); //10
        System.out.println(b); //80
  //post inctrement= 1st assign then increment
        int x=a++;
        System.out.println("x-->"+x);
        System.out.println("a--->"+a); //
      //

        int y=b++;
        System.out.println("y-->"+y);;

        System.out.println("b-->"+b);
 //post decrement=1st assign then decrement
        int c=20;
        int d=21;
         int p=c--;
        System.out.println("p-->"+p);
         System.out.println("c-->"+c);
      int q=d--;
      System.out.println("q--->"+q);
      System.out.println("d-->"+d);



    }

}
