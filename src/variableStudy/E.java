package variableStudy;

public class E {
    int a=10; //global non static variable (declare and intialize)
    static int b=20;//global static variable

    static void main(String[] args) {
       E e=new E();
        int sum=e.a+100;  //using object of a class we refer the value of global non static variable
                          //in main method
        System.out.println(sum);

        int sum1=e.a+b; //main method by default static method so static global variable dirctly accessable
        System.out.println(sum1);



    }
}
