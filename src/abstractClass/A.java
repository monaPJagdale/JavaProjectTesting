package abstractClass;

public abstract class A {
    static void main(String[] args) {
//A a=new A(); //because of abstract class not allowed to create a object of the class
        //compiler will be confused in execution of abstract method
    }

    public void Demo() {                       //non-static method with body called as complete method
        System.out.println("Hello");

    }

    public void Demo1()                      //non-static method with empty body called as complete method
    {

    }
    //public  void demo3();                 //incomplete method
    public abstract void demo3() ;          //create incomplete method as a abstract method then class also done abstract class


    public static void demo4()                //static complete method
        {
        System.out.println("hii");
    }

   // public static void demo5() ;  //static incomplete method will not allowed
     public static void demo6(){         //aloowed at least body

     }


}
