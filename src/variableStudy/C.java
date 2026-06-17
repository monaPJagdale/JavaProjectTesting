package variableStudy;

public class C {
    int a=10; // global non static variable (declare & initialize)
    static  int b=20; //global static variable

    static void main(String[] args) {
       C c=new C();  //create object of a class

       int sum =c.a+5;
       //using object of a class refer global non static variable value of same class in main method
        System.out.println(sum);

       int sum2=b+5;
        //refer global static variable value of same class in main method because main method by default static method
       System.out.println(sum2);

    }

}
