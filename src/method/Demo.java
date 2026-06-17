package method;

public class Demo {
    public static void method(){
        int a=10;
        int b=20;
        int sum=a+b;

        System.out.println("sum="+sum);
        MethodStudy methodStudy=new MethodStudy();
        methodStudy.Test3();//non static
        MethodStudy.Test();
;
    }
    public  void method2(){
        int c=8;
        int d=2;
        int sub=c-d;
        System.out.println("sub="+sub);
    }

}
