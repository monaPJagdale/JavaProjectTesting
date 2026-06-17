package polymorphisum;

public class FinalKeyword {
    static void main(String[] args) {
        //final keyword assign before class,variable,methods
        //final variable cant reinitialize or override
        //final method cant override
        //final class cant inherit
        int a = 10;
        System.out.println(a); //10
        a = a + 1;  // re initialize
        System.out.println(a); //11

        final int b = 10;
        System.out.println(b); //10
        // b=b+1;  // final variable cant re initialize
        System.out.println(a); //10

        FinalKeyword finalKeyword = new FinalKeyword();
        finalKeyword.show();
        show2();


    }

    public void test(int a) {
        System.out.println(a);
    }

    final void show() {
        System.out.println("final method cant be  overload oroverriden");
    }
//    final void show()
//    {
//        System.out.println("final method cant be overload");
//    }

    final static void show2() {
        System.out.println("final method cant be  overload oroverriden");
    }

}
