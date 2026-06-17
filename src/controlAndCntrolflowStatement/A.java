package controlAndCntrolflowStatement;
//using control statement conditions will be check
//1.less than -- < -- a<b

//.greater then -- >  --a>b


public class A {
    static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a > b);  //greater than  result in the form form boolean false
        System.out.println(a < b); //less than =true
        //System.out.println(a=b); //equals to = value of b asign to a
        System.out.println(a == b);  //here compare the value false
        System.out.println(a != b); //not equal to =true
        System.out.println("======");

        int c = 20;
        int d = 20;
        System.out.println(c > d); //false
        System.out.println(c < d); //false
        System.out.println(c == d);//true
        System.out.println(c != d); //false (true) ...question
        System.out.println("======");
        //eg.greater than equals to
        int e = 1;
        int f = 2;
        System.out.println(e >= f); //false
        System.out.println(e <= f);//true
        System.out.println(e == f);//false
        System.out.println(e != f); //true
        System.out.println("======");

        int g = 2;
        int h = 2;
        System.out.println(g >= h); //true
        System.out.println(g <= h);  //true
        System.out.println(g == h); //true
        System.out.println(g != h); //false


    }
}
