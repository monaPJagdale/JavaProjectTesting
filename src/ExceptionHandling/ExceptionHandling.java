package ExceptionHandling;

public class ExceptionHandling {
    static void main(String[] args) {
        System.out.println("hi");

        try
        {
            System.out.println(10/0);
        }
        catch (ArithmeticException e)
        {
            System.out.println("can not be divisible by 0");
        }

        System.out.println("test");
    }
}
