package logicalPrograms;

public class FindDuplicateElementsInStringArray {
    static void main(String[] args) {
        //create String array
        String arr[]={"mona","vedant","mona","trupti","vedant","pradnya","pradnya"};//mona,vedant,pradnya
        int count=0;

        for(int i=0;i<=arr.length-1;i++){   //1st for loop check index value
            for(int j=1+i;j<=arr.length-1;j++)//2nd for loop for comparision of arraty
            {
                if(arr[i].equals(arr[j]))
                {
                    System.out.println("Dplicate elements in array "+arr[j]);
                    count++;

                }
            }


        }System.out.println(count+" is a count of duplicate string in array");


    }
}
