package pattern;

public class Test {
         //******
         //******
         //******
         static void main(String[] args) {
             //1.row  2.column 3.star in 1st line 4.space
             int row =3;
             int column=5;
             //for traversing for loop
             for(int i=1;i<=row;i++) //outer for loop for row
             {
               for(int j=1;j<=column;j++)//inner for loop for column
               {
                   System.out.print("*");
               }  System.out.println();
             }



         }

}
