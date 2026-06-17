package pattern;

public class Pattern1 {
    //  *
    //  **
    //  ***
    //  ****
    //  *****

    static void main(String[] args) {
        //1.row 2.column 3.star in first line 4.space
        int row=5;
        int column=5;
        int star=1;

        //nested for loop -2 for loop

        for(int i=1;i<=column;i++)//
        {
            for(int j=1;j<=star;j++)//
            {
                System.out.print("*");

            }
            System.out.println();
            star++;
        }




    }
}
