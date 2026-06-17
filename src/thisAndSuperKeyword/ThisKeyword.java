package thisAndSuperKeyword;

public class ThisKeyword {
    int a=10;   //global variable

    static void main(String[] args) {
        ThisKeyword thisKeyword=new ThisKeyword();
        thisKeyword.display();

    }
    public void display()
    {
        int a=20;                //local variable of display method name is same as global variable
        int sum=a+this.a;       //local variable+global variable..global variable access using this keyword
        System.out.println(sum); //30
    }
}

