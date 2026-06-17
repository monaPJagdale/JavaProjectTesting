package loopStudy;

public class WhileLoop {
    static void main(String[] args) {
        //print velocity 3 times
        //initialization:int a=0 ;condition: a<=2 ;updation:a++
        int a = 0;                 //initialization
        while (a <= 2) {             //condition
            System.out.println("Velocity");  //body

            a++;                 //updation

        }

        System.out.println("=================");

        //print table of 8
        //initialization int b=8;condition b<=80;updation b=b+8

        int b = 8;              //initialization
        while (b <= 80)           //condition
        {
            System.out.println(b); //body

            b = b + 8;                //updation
        }

        System.out.println("=================");

        //print reverse table of 8
        //initialization int c=80;condition =c>=8;c=c-8

        int c = 80;             //initialization
        while (c >= 8)           //condition
        {
            System.out.println(c);  //body
            c = c - 8;                      //updation




            //print month
            //string month=1;month <=12;month=month++


        }

    }

}

