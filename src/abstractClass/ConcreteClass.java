package abstractClass;

public abstract class ConcreteClass extends A {
    static void main(String[] args) {
        //ConcreteClass concreteClass=new ConcreteClass();
//        concreteClass.Demo();
//        concreteClass.Demo1(); //methods in abstract class
//        concreteClass.demo3();//which is complete in concrete class
//        ConcreteClass.demo4();
//        ConcreteClass.demo6();//static methods of class A
//
//        concreteClass.show();//method od concrete class
//        concreteClass.show1();//method od concrete class



    }

    @Override public void demo3() {    //demo 3method is incomplete method of class A-->complete in concrete class
        int a=10;
        int b=2;
        int sum=a+b+1;
        System.out.println(sum);
    }

    public void show()
    {

        System.out.println("complete method of concrete class");
    }
    public void show1()
    {

        System.out.println("complete method of concrete class");
    }

    public abstract void show2();       //incomplete method of concrete class




}
