package loopStudy;

public class Post_IncrementDecrement {
    static void main(String[] args) {
        System.out.println("Post Increment =1st assign then increment");
        int a = 10;
        int b = 99;

        System.out.println(a);
        System.out.println(b);
        System.out.println("=================");

        int x = a++;
        System.out.println("a-->" + a);
        System.out.println("a--->" + x);

        int y = b++;
        System.out.println("b--->" + b);
        System.out.println("y-->" + y);
        System.out.println("=================");

        System.out.println("Post Decrement= 1st assign then decrement");
        int c = 10;
        int d = 99;

        //c--;
        //System.out.println(c);


        int p = c--;
        System.out.println("c-->" + c);
        System.out.println("p-->" + p);

        int q = d--;
        System.out.println("d-->" + d); //98
        System.out.println("q--->" + q); //99


    }
}
