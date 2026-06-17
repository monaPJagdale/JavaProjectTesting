package abstractClass;

public class C extends ConcreteClass{
    static void main(String[] args) {
        C c=new C();
      //methods of supper class
        c.Demo();
        c.Demo1();
     //incomplete method of supper class which is complete in abstract class (concrete class)
        c.demo3();

     //static methods of super class
        C.demo4();
        C.demo6();
      //methods of abstract class Concrete class
        c.show();
        c.show1();
        //incomplete method of concrete class which is complete in abstract class ()
        c.show2();
     //complete method of class C
        c.show3();



    }
    @Override
    public void show2() {
        System.out.println("complete the method of concrete class in class C");
    }

    public void show3()
    {
        System.out.println("complete method of  class in class C");
    }
}
