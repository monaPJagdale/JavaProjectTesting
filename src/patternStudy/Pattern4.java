package patternStudy;

public class Pattern4 {
//    *****
//     ****
//      ***
//       **
//        *
static void main(String[] args) {
    int row=5;
    int colunm=5;
    int star=5;
    int space=0;

    //nested for loop
    //outer for loop row
    for(int i=1;i<=row;i++)
    {
        //inner for loop-space
        for(int j=1;j<=space;j++)
        {
            System.out.print(" ");
        }
        //2nd inner for loop-star
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
