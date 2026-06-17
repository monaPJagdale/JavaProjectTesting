package ExceptionHandling;

public class ExceptionHandling2 {
    static void main(String[] args) {


        System.out.println("hello all");
        String a = "test"; //"test";
        try {
            System.out.println(a.charAt(12));
        } catch (NullPointerException e) {
            System.out.println("object can not null");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("check index");
        }
        System.out.println("Good night");




    }


}
