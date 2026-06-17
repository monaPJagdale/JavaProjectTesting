package inheritance;

public class StudInformation extends StudInfo {
    String Surname="Jagdale";
     public void info(){
         System.out.println("Surname is Jagdale");

     }
      public static void data(){
          System.out.println("Name  is Mona");

      }

    static void main(String[] args) {
        StudInformation studInformation=new StudInformation();
        studInformation.info();   //non static method of child class
        data();   // static method of child class
        System.out.println(studInformation.Surname); //global variable of child class

        System.out.println("********************************");
        studInformation.grade(); //non static method of base class/suuper class
        StudInformation.marks();//static method of base class/suuper class
        System.out.println(studInformation.rollno); //global variable of base class/suuper class





    }
}
