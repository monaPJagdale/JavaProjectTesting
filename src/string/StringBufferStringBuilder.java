package string;

public class StringBufferStringBuilder {
    static void main(String[] args) {
        String name="pune";
        System.out.println(name);
        String name1=name.replace("p","P");
        System.out.println(name1);

    //StringBuffer

        StringBuffer city=new StringBuffer("aurangabad");
        System.out.println(city);

        city.replace(2,4,"M");
        System.out.println(city);

        city.append("Pune");
        System.out.println(city);
        city.insert(0,"Test");
        System.out.println(city);
        city.delete(0,5);
        System.out.println(city);
    //StringBuilder
        StringBuilder balance=new StringBuilder("1234567890");
        System.out.println(balance);
        balance.append("678");
        System.out.println(balance);
        balance.insert(0,0);
        System.out.println(balance);
        balance.replace(4,7,"8");
        System.out.println("replace "+balance);
        balance.delete(5,6);
        System.out.println(balance);
        System.out.println("reverse "+balance.reverse());

    //capacity example
     StringBuffer sb=new StringBuffer();
        System.out.println("default capacity "+sb.capacity());

        sb.append("the string is StringBuffer example");
        System.out.println("current capacity " + sb.capacity());



    }
}
