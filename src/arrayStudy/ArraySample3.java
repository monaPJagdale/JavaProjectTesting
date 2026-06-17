package arrayStudy;
import java.util.Arrays;

public class ArraySample3 {
    static void main(String[] args) {
        //multi dimensional array declaration using old way
        int test[][]=new int [2][2]; //2 row 2 columns

        //array initialization
        test[0][0]=5;       //5  10
        test[0][1]=10;
        test[1][0]=15;      //15  20
        test[1][1]=20;

        //test [1][2]=25;    out of bounds exception because array declare 2*2

        //if we print array int actual row + column format we use nested if else

        //outer for loop--->row
        for(int i=0;i<=test.length-1;i++)
        {
            //inner for loop--->column
            for(int j=0;j<=test.length-1;i++)
            {
                System.out.print (test[i][j]+"");
            }
            System.out.println();

        }






    }
}
