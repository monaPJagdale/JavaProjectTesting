package logicalPrograms;

import java.util.Scanner;

public class ReverseStringUserInput {
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter String to reversed");
        String givenString = scanner.next();
        String reversedString="";

        //to traverse in string to  reversed given string
        //forloop

        for(int i=givenString.length()-1;i>=0;i--)
        {
            char temp = givenString.charAt(i);
            reversedString=reversedString+temp;

        }System.out.println("Reversed String ="+reversedString);

    }
}
