package constructorChaining;

public class C {
    static void main(String[] args) {
     C c=new C();

    }
    public C()      //userdefined zero parameter constructor
    {
        this(2,2);
        int a=1;
        int c=1;
        int sum=1+1;
        System.out.println(sum);
    }
    public C(int x,int y)
    {
        this("mona");
        int sum=x+y;
        System.out.println(sum);
    }
    private C(String name)
    {
        //this(90);
        System.out.println(name);
    }

//    private C(int m)
//    {
//        System.out.println(m);
//
//    }

}
//output -
//90
// mona
// 4
//2
