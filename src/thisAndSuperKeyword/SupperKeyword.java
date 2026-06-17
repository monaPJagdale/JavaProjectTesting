package thisAndSuperKeyword;

public class SupperKeyword extends ThisKeyword {
    int a = 10;    //global variable
    int b = 20;   //global variable

    static void main(String[] args) {
        SupperKeyword supperKeyword = new SupperKeyword();
        supperKeyword.show();
        supperKeyword.display();


      ThisKeyword thisKeyword = new ThisKeyword(); //method overriding
        thisKeyword.display();
    }
    public void display()
    {

        System.out.println("hello"); //30
        //hello
    }
    public void show() {
        int a = 30;  //local variable of show method
        int sum = a + this.a; //local + global variable using this keyword
        System.out.println(sum); //4o

        int sum1 = this.a + this.b + super.a; //global variable of same class+ global variable of extended class
        System.out.println(sum1); //40
    }


}
