package arrayStudy;

import java.util.Arrays;

public class ArraySample2 {
    static void main(String[] args) {
        int rollNumber[]={2,6,21,34,8,9}; //int array of rollno
        System.out.println(rollNumber[3]);//34  index

        for(int i=0;i<=rollNumber.length-1;i++)
        {

            System.out.println(i);
        }
        Arrays.sort(rollNumber);
        for(int i=0;i<=rollNumber.length-1;i++)
        {

            System.out.println(i);
        }
    }


}
