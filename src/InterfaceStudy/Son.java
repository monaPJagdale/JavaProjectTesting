package InterfaceStudy;

public class Son implements father,motherr{
    static void main(String[] args) {
        Son son=new Son();
        son.hardwork();
        son.look();
        son.nature();
        son.honesty();
        son.love();
        father.kindness();
        motherr.kindness();

    }
    @Override
    public void hardwork() {
        System.out.println("hardwork");

    }

    @Override
    public void look() {
        System.out.println("look");

    }

    @Override
    public void love() {
        father.super.love();
        motherr.super.love();
    }



    @Override
    public void nature() {
        System.out.println("nature");

    }

    @Override
    public void honesty() {
        System.out.println("honesty");


    }
}
