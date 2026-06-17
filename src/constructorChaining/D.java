package constructorChaining;

public class D extends C{
    static void main(String[] args) {
        D d=new D();
    }

    public D()
    {
        this("jagdale");
        int a=10;
        int sub=10-5;
        System.out.println(sub);
    }
    public D(String surname)
    {
        super(3,3);
        System.out.println(surname);
    }
    public D(int a,int b)
    {
        super();
        int sum=a+b;
        System.out.println(sum);


    }



}

//mona
//6
//jagdale
//5