package pattern;

public class LeftSpaceReversePyramid {
//    ******
//     ****
//      ***
//       **
//        *
    static void main(String[] args) {
        int row=5;
        int column=5;
        int space=0;
        int star=5;

        //nested for loop

        //outer for loop for loop
        for(int i=1;i<=row;i++ )
        {
            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }
            //2nd inner for loop for star
            for(int k=1;k<=star;k++)
            {
                System.out.print("*");
            }
            System.out.println();
            space++;
            star--;
        }
    }
}
