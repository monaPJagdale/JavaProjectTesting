package method;

public class Mock_Study {
    static void main(String[] args) {

        methodInfo();
        Mock_Study mock_study = new Mock_Study();
        mock_study.methodTest();
        mock_study.method_multi_parameter("Trupti", 5, 'A', 78f);

    }

    public static void methodInfo() {
        int a = 20;
        int b = 30;
        int sum = a + b;
        System.out.println("my sum is " + sum);


    }

    public void methodTest() {
        int a = 50;
        int b = 40;
        int sub = a - b;
        System.out.println("my sub is " + sub);

    }

    public void method_multi_parameter(String name, int rollNo, char div, float marks) {
        System.out.println("Student name is " + name);
        System.out.println("Student rollNo is " + rollNo);
        System.out.println("Student div is " + div);
        System.out.println("Student marks is " + marks);


    }


}
