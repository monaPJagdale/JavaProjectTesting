package patternStudy;

public class Patter2 {
//    *****
//    ****
//    ***
//    **
//    *
static void main(String[] args) {
    int row=5;
    int colunm=5;
    int star=5;

    //nested for loop
    //outer for loop-row
    for(int i=1;i<=row;i++)//1
    {
        //inner for loop -star
        for(int j=1;j<=star;j++)//
        {
            System.out.print("*");

        }
        System.out.println();
        star--;
    }

}
}
