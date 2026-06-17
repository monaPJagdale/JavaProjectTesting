package accessSpecifierRelation;

import accessSpecifiers.A;

public class C extends A{
    static void main(String[] args) {
        A a =new A();
//        a.test1;
//        a.test2;
//        a.test3;      //this method can access within a package only
//        a.test4;

        a.Test4();      //this method is public access all over the project using object and
         int sum=a.d+1;
         System.out.println(sum);
          //other variables access within package only

        C c=new C();
        c.Test3(); //protected method access when extend the class A over here using inheritance
        c.Test4(); //public method access here also it is a public for all project

        int add =1+c.c+c.d;
        System.out.println(add);
        //protected variable access when extend the class A over here using inheritance
        //public variable access here also it is a public for all project



    }
}
