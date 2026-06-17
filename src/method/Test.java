package method;

public class Test {
    static void main(String[] args) {
        info_data();
        Test test = new Test();
        test.info_data1("Mona", 5, true, 'f', 82.99f);
    }

    public static void info_data() {
        int a = 10;
        int b = 20;
        int sum = 100 + a + b;
        System.out.println("Sum is " + sum);
    }

    public void info_data1(String name, int rollno, boolean result, char gender, float marks) {
        System.out.println("My name is " + name);
        System.out.println("My rollno is " + rollno);
        System.out.println("My result is " + result);
        System.out.println("My gender is " + gender);
        System.out.println("My marks is " + marks);

    }



    public void info_dada1() {
    }
    public void info_dada1(int mobno) {
    }
    public static void info_data(int a ,int b)
    {
    }








}
