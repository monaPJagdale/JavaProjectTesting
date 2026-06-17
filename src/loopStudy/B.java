package loopStudy;

public class B {
    //print hello mam 3 times
    //initialization int a=0;condition<=2;updation=a++
    static void main(String[] args) {
        int a = 4;   //initialization
        while (a <= 6)        //condition
        {
            System.out.println("Hello mam");   //body
            a++;              //updation

        }

        System.out.println("**************");

        //print 3 table
        //initiliazation int b=3;condition <=60; updation b=b+3
        int b=3;  //initialization
        while(b<=60)       //condition
        {
            System.out.println(b); //body
            b=b+3;      //updation
        }


    }
}
