package ExceptionHandling;

import variableStudy.E;

public class TryCatchFinallyCombination {
    static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (NullPointerException e) {
            System.out.println("value cant be null");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("check index");
        } catch (ArithmeticException e)
        {
            System.out.println("/ by 0 does not possible");
        }
        catch (Exception e)
        {
            System.out.println("something went wrong");
        }
        finally {
            System.out.println("finally execute");
        }

        System.out.println("good night");
    }
}
