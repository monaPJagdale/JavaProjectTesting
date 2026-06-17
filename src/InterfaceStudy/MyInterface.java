package InterfaceStudy;

public interface MyInterface {
    int a=10;
    //a=a+1;            variables in interface by default static and final cant re-initialize
    static void main(String[] args) {
       // MyInterface myInterface=new MyInterface() ;  we cant create a object in interface by default methods are
        //default and abstract


    }
    void test1();   //in interface methods are by default public and abstract

    void test2();
//    public MyInterface()        //constructor is not allowed in interface
//    {
//
//    }

}
