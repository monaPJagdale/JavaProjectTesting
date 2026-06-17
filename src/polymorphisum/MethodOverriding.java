package polymorphisum;

public class MethodOverriding extends Methodoverloading{
    static void main(String[] args) {

        MethodOverriding methodOverriding=new MethodOverriding();
        methodOverriding.show1();
        methodOverriding.show1(5);
        methodOverriding.show1("mona");
        MethodOverriding.show1(7.8f);

        Methodoverloading methodoverloading=new Methodoverloading();
        methodoverloading.show1();
        methodoverloading.show1("gatha");
        methodoverloading.show1(9);
        Methodoverloading.show1(7 ,9);




    }
    public void show1() {
        int a = 10;
        int sub = a - 5;
        System.out.println(sub);


    }
    public void show1(int c)
    {
        int sum=c+1;
        System.out.println(sum);


    }
    public void show1(String name)
    {
        System.out.println(name);

    }
    public static void show1(float a){
        System.out.println(a);

    }
}
