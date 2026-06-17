package method;

public class Static_NonStaticMethods {
    static void main(String[] args) {
        demo();
        Static_NonStaticMethods staticNonStaticMethods = new Static_NonStaticMethods();
        staticNonStaticMethods.demo2();
        Demo demo = new Demo();
        demo.method2();
        Demo.method();
    }
    public static void demo() {
        System.out.println("study of static methods");
    }

    public void demo2() {
        System.out.println("study of non  static methods");
    }
}
