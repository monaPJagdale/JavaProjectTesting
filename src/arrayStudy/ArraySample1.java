package arrayStudy;

import java.util.Arrays;

public class ArraySample1 {
    static void main(String[] args) {
        //stored batters name
        String batters[]=new String[5];  //single dimensional array declaration with fix size 5
        batters[0]="Ishan";
        batters[1]="Rohit";
        batters[2]="Virat";
        batters[3]="Shubhaman";
        batters[4]="Jadeja";
//simple way to print array
        System.out.println(batters[0]);
        System.out.println(batters[1]);
        System.out.println(batters[2]);
        System.out.println(batters[3]);
        System.out.println(batters[4]);

        System.out.println(batters.length); //to find the length of array

        System.out.println("============Normal order==============");
        //for loop-initialization =int i=0;condition i<=batters.length-1.updation -i++

        for (int i=0;i<=batters.length-1;i++)
        {
            System.out.println(batters[i]);
        }
        System.out.println("============Ascending order==============");
        //1.sort()
        Arrays.sort(batters);
        for (int i=0;i<=batters.length-1;i++)
        {
            System.out.println(batters[i]);
        }
        System.out.println("============descending order==============");
        for(int i=batters.length-1;i>=0;i--)

        {
            System.out.println(batters[i]);
        }



    }
}
