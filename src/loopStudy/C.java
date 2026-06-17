package loopStudy;

public class C {
    //print 5 times All the best
    //initialization int a=6;condition a<=10;updation a++
    static void main(String[] args) {
        int a=6;                        //initialization
        do {
            System.out.println("All the best");      //body
            a++;                        //updation
        }while (a<=10);                 //condition



        System.out.println("***********");
         //print roll no 25  t0 35
        //initialization int b=25;condition<=35;updation b++
         int b=105;
         do {
             System.out.println(b);
             b=b+25;
         }while(b<=100);
    }
}
