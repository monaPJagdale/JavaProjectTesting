package thisAndSuperKeyword;

public class A {
    int a=100;

    static void main(String[] args) {
        A a=new A();
        a.add();


    }
    public void add()
    {
        int a=20;
        int add=a+this.a;
        System.out.println(add);
    }


}
