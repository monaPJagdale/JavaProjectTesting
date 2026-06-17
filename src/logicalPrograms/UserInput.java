package logicalPrograms;

import java.util.Scanner;

public class UserInput {
    static void main(String[] args) {
        //System.out.println(); one of the class
       // Scanner  -->one of the class of java util package

        Scanner scanner=new Scanner(System.in);//object of scanner class pass paramete for user input pass parameter
        System.out.println("Enter Your Name"); //message
        String name = scanner.next();          //next()-->return String
        System.out.println("Enterd Name is "+name);
        System.out.println("+++++++++++++++++++++++++++++++++++");

        System.out.println("Enter Your RollNumber");
        int rollNum = scanner.nextInt();
        System.out.println("Enterd RollNumber "+rollNum);
        System.out.println("+++++++++++++++++++++++++++++++++++");

        System.out.println("Enter Yours Marks");
        float marks = scanner.nextFloat();
        System.out.println("Enterd marks "+ marks);






    }
}
