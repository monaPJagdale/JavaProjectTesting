package loopStudy;

public class ForLoop {
    //display or print multiple time some task or set task untile specified endid condition use loop statements
    //there are 3 types of loop statements:1.for loop 2.while loop 3.do while loop
    //there are main three elements of problem statement are use in for loop syntax
    //for(initialization; condition;  updation)
    //{
        //body
    //}

    static void main(String[] args) {
        // print All the best message 6 times
        for (int a=0;a<=5;a++)
        {
         System.out.println("All the best");
        }
       System.out.println("==========");
        //print table of 3
        for(int b=3;b<=30;b=b+3){
            System.out.println(b);
        }
        System.out.println("==========");

        //print reverse table of 3
        for (int c=30; c>=3;c=c-3)
        {
            System.out.println(c);
        }
        System.out.println("==========");
        //print the table of 5 using for loop.

        for(int a=5;a<=50;a=5+a){
            System.out.println(a);
        }

    }

}
