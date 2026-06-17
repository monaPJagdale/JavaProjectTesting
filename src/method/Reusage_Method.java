package method;

public class Reusage_Method {
    static void main(String[] args) {
        Reusage_Method reusage_method = new Reusage_Method();
        reusage_method.method_zero_parameter();
        reusage_method.method_with_parameter(10, 20);
        reusage_method.method_with_parameter(30, 40);
    }

    public void method_zero_parameter() {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("sum is " + sum);

    }

    public void method_with_parameter(int a, int b) {
        int sum = a + b;
        System.out.println("sum is " + sum);
    }

}
