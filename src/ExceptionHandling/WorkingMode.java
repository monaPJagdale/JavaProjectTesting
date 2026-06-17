package ExceptionHandling;

public class WorkingMode {
    static void main(String[] args) {
        int age =70;

        if (age>=65)
        {
            throw  new  SeniorCitizenException("not allow to work");
        }
        else
        {
            System.out.println("allw for work");
        }
    }
}
