package ExceptionHandling;

public class ExceptionWithMultipleCatchBlock {
    static void main(String[] args) {
        String a=null;
    //    System.out.println(a.length());  risky code -->NullPointerException

        try
        {
            System.out.println(a.length());
        }
        catch(ArithmeticException e)
        {
            System.out.println("/ by o not possible");
        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("check Index");

        }
        catch (NullPointerException e)
        {
            System.out.println("check value can't be null");
        }
        catch (Exception e)
        {
            System.out.println("something went wrong");
        }
    }
}
