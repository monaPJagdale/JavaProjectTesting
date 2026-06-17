package ExceptionHandling;

public class TryWithFinallyBlock {
    static void main(String[] args) {
        //String a="test";
        String a=null;
        try {
            System.out.println(a.length());
        }
        finally {
            System.out.println("finally block execute any how");
        }
        System.out.println("hello");
    }

}
