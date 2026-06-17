package loopStudy;

public class DoWhileLoop {

    static void main(String[] args) {
        //print best of luck  5 time
        // initialization  int a=0;condition  a<=4; updation a++
          int a=0;     //initialization
          do {
              System.out.println("Best Of Luck"); //body
              a++;                               //updation
          }while (a<=4);               //condition

        System.out.println("=============");

        //print table of 4
        //initialization int b=4;condition b<=40;updation b=b+4
        int b=4;  //initialization

        do {
            System.out.println(b);  //body
            b=b+4;                  //updation
        }while (b<=40);             //condition

        System.out.println("=============");

        //print reverse table of 4
        //initialization int c=40;;condition>=40;updation c=c-4
        int c=40;

        do {
            System.out.println(c);
            c=c-4;

        }while (c>=4);


    }
}
