package accessSpecifiers;

public class B {
    static void main(String[] args) {
        A a=new A();
        int sum=2+a.b+a.c+a.d;  //only private variable can not access because scope of this variable with in class only
        System.out.println(sum);

        //a.test1     //private method accessible only with in class
        a.test2();   //accessible in same class and within in package only
        a.Test3();   //with in package and another package using inheritance
        a.Test4();   //all over the project
    }
}
