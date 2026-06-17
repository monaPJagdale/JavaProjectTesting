package patternStudy;

public class Pattern1 {
//    *
//    **
//    ***
//    ****
//    *****

    static void main(String[] args) {
        int row =5;
        int column=5;
        int star=1;

        //nested for loop

        for(int i=1;i<=row;i++)//1 2 3 4 5 6
        {
            //inner for loop -star
            for(int j=1;j<=star;j++)//1 2 3 4 5
            {
                System.out.print("*");
            }
            System.out.println();
            star++;//2 3 4 5 6
        }
    }
}
