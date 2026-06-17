package method;

//public Method_Info()
//{

//}

public class Method_Info {
    static void main(String[] args) {
        Method_Info method_info = new Method_Info();
        method_info.studentInfo("Mona", 5, 'A', 82, true);
    }
    public void studentInfo(String Name, int RolloNo, char Div, float Marks, boolean attendance) {
        System.out.println("Student Name is " + Name);
        System.out.println("Student RolloNo is " + RolloNo);
        System.out.println("Student Div is " + Div);
        System.out.println("Student Marks is " + Marks);
        System.out.println("Student attendance is " + attendance);

    }
}
