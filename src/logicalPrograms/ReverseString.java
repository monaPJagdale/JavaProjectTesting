package logicalPrograms;

public class ReverseString {
    //Reverse string -->Pune-->enuP
    static void main(String[] args) {
        String s = "automation";
        String reverse = "";
        //to reverse any string u have to knowledge about 3things-->length(),charAt(),for loop
        //reverse() method not present

        System.out.println(s.length()); //10  length starts with 1
        System.out.println(s.charAt(9)); //n  indexing starts with 0
        //For loop-->initialization,condition,updation

        for (int i = (s.length() - 1); i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }
        System.out.println(reverse);

    }
}
