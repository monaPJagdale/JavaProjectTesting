package accessSpecifiers;

public class D {
    private int a=10;
    int c=1;

    static void main(String[] args) {
        D d=new D();
        d.addition();
        d.addition1();
        d.addition2();
    }
    private void addition()
    {
        int b=1;
        int sum=a+b;
        System.out.println(sum);
    }
    void addition1()
    {
        int add=c+1;
        System.out.println(add);

    }
    protected void addition2()
    {
        int add=c+2;
        System.out.println(add);


    }


}
