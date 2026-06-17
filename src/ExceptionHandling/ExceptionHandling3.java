package ExceptionHandling;

public class ExceptionHandling3 {
    static void main(String[] args) {
        String  a="pune";
    //    System.out.println(a.charAt(6));  //risky code

        try
        {
            System.out.println(a.charAt(-1));
        }
        catch (IndexOutOfBoundsException e)     //this exception is parent class of StringOutOfBoundException so it should be execute catch block
        {
            System.out.println("Check index");
        }

        System.out.println("hello");
    }
}
