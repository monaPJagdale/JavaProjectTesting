package inheritance;

public class PeopleData extends StudInformation{
    static void main(String[] args) {
        PeopleData peopleData=new PeopleData();
        peopleData.info();
        peopleData.grade();


    }
    public  void  people(){
        System.out.println("Male");
    }
    public static void  hummans()
    {
        System.out.println("Wooman");
    }

}
