package logicalPrograms;

public class FindDuplicateElementInArray {
    static void main(String[] args) {
        int arr[]={1,2,3,1,2,4,5,3,6}; //1 2 3
        int count=0; //to stored the cont of duplicate no in array initially 0

        for(int i=0;i<=arr.length-1;i++)  //1st for loop check index value
        {
            for(int j=1+i;j<=arr.length-1;j++) //2nd for loop for comparison with i value to find duplicate or not

            {
                if (arr[i]==arr[j])
                {
                   System.out.println("duplicate element found "+arr[i]);
                   count++ ;//cunt increase for check all array elements checking
                }
            }
        }
        System.out.println(count+" Duplicate elements found");
    }
}
