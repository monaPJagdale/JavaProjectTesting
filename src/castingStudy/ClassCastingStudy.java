package castingStudy;

public class ClassCastingStudy {
    static void main(String[] args) {
        Father father = new Father(); //supper class object
        father.car();
        father.bike();
        System.out.println("================");
        Son son = new Son();     //base class object
        son.car();
        son.bike();
        son.education();
        System.out.println("================");


        Father son1 = new Son();     //actual class casting-->object of sub class but reference datatype of supper class
        son1.car();
        son1.bike();                //common methods of super and sub class
        son1.data();                //individual method of supper class father allow to call

        //son1.education();        //individual method of sub class son does not allow


        //Son s= new Father();


    }
}
