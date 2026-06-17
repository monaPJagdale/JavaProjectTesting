package thisAndSuperKeyword;

public class B extends A{
    int a=10;

    static void main(String[] args) {
        B b=new B();
        b.add();

    }
    public void add()
    {

        int add=a+super.a;
        System.out.println(add);

        int sum=a+super.a;
        System.out.println(sum);


    }

}
