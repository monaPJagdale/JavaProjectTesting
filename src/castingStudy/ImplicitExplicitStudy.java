package castingStudy;

public class ImplicitExplicitStudy {
    static void main(String[] args) {
        //implicit casting -->lower into higher data type.also called as winding casting.no data loss
        int a=10;   //memory Size of byte is 4
        System.out.println(a);  //10
        double b=a; //memory size of byte is 8
        System.out.println(b);
        System.out.println("============================================");

        //explicit casting-->higher into lower data type.also called as narrowing casting.data loss possible
        double c=12.921; //memomry size 8 byte
        System.out.println(c); //int memory size 4
        int d=(int)c;
        System.out.println(d);





    }
}
