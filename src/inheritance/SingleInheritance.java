package inheritance;

public class SingleInheritance {
    static void main(String[] args) {
        Mother mother=new Mother();
        mother.nature();                //properties of class mother accses using object
        Mother.height();
        System.out.println(mother.color);  //variable of mother class
        System.out.println("*******************************");

        Son son=new Son();
        son.weight();
        Son.hobbies();
        System.out.println(son.surname);  //variable of Son class
        System.out.println("*******************************");

        son.nature();
        Son.height();
        System.out.println(son.color);  //variable of Son class





    }
}
