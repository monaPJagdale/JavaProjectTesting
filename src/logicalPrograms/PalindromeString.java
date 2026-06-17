package logicalPrograms;

public class PalindromeString {
    //palindrome string means string writes from back its same as original string
    //for palindrome string we have to knowledge of reverse string program
    //MOM,DAD,MADAM,RADAR,NITIN,
    static void main(String[] args) {
        String s = "Nitin";
        String reverse = "";

        //to reverse any string u have to knowledge about 3things-->length(),charAt(),for loop,equals()
        //reverse() method not present

        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + (s.charAt(i));
        }

        if (s.equals(reverse)) {
            System.out.println("given string is palindrom");
        } else {
            System.out.println("given string is not a palindrom");
        }


    }
}
