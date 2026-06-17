package inheritance;

public class StudData {
    static void main(String[] args) {
        StudInfo studInfo=new StudInfo();
        studInfo.grade();                  //supper class non static method acces in base class

        StudInfo.marks();                  //supper class  static method acces in base class

        System.out.println("***************");
        StudInformation studInformation=new StudInformation();
        studInformation.info();
        StudInformation.data();                               //
        System.out.println(studInformation.Surname);

        studInformation.grade();                              //base class metho
        StudInformation.marks();

        System.out.println(studInformation.rollno);





    }
}
