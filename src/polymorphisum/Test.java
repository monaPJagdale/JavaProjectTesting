package polymorphisum;

public class Test {
    static void main(String[] args) {
        final int marks = 90;
        //marks =marks+1;
        System.out.println(marks);

    }

    public void test1() {
        System.out.println("normal non-static method");

    }

    final static void Test2()
    {
        System.out.println("final static method");

    }




}
