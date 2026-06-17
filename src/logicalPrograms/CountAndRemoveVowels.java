package logicalPrograms;

import java.util.Scanner;

public class CountAndRemoveVowels {
    static void main(String[] args) {
        //vowels= a i e o u
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a String");
        String s1 = scanner.next(); //expected String
        String output = "";
        int count=0;

        //traversing
        for(int i=0;i<=s1.length()-1;i++)
        {
            char temp = s1.charAt(i); //stored character

            if(temp=='a'||temp=='i'||temp=='e'||temp=='o'||temp=='u') //for char comparison ==
            {

               count++;
               System.out.println(temp);
               continue;
            }
            output = output + temp;


        }
        System.out.println("String without vowels is " + output);
        System.out.println("Number of vowels in String are " + count);

    }
}
