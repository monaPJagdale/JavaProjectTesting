package pattern;

public class LeftSpacePyramid {
//    *
//   **
//  ***
// ****
//*****
static void main(String[] args) {
    int row=5;
    int column=5;
    int space=4;
    int star=1;
    //nested for loop
    //outer for loop-row
    for(int i=1;i<=row;i++)
    {
        //inner for loop - space
        for(int j=1;j<=space;j++)
        {
            System.out.print(" ");
        }
        //2nd inner for loop -star
        for(int k=1;k<=star;k++)
        {
            System.out.print("*");
        }
        System.out.println();
        star++;
        space--;

    }
}
}
