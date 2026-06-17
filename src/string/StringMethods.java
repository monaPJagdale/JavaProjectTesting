package string;

public class StringMethods {


    static void main(String[] args) {
        //1.lenghth()
        String a = "Pune";
        System.out.println(a.length());   //4
        int stringLength = a.length();
        System.out.println(stringLength);   //4

        String a1 = "";
        System.out.println(a1.length());  //0

//        String a2=null;
//        System.out.println(a2.length());  //  null pointer exception

        //2.toUpperCase()
        String b = "Testing";
        System.out.println(b.toUpperCase());  //TESTING

        //3.toLowerCase
        String b1 = "Testing";
        System.out.println(b1.toLowerCase());  //testing


        //4.equals()
        String name = "Velocity";
        String name1 = "Velocity";
        System.out.println(name.equals(name1));//true
        String name2 = "velocity";
        System.out.println(name.equals(name2));//false because case sensitive

        String name3 = new String("Velocity"); //true
        String name4 = new String("Velocity");
        System.out.println(name3.equals(name4));

        System.out.println("*********************************");
        System.out.println(name == name1);
        System.out.println(name == name2);

        System.out.println(name == name3);
        System.out.println(name3 == name4); //memory allocation is different
        System.out.println("***************6.contains()******************");
        //6.contains()
        String d1 = "katarj";
        boolean result = d1.contains("rj");
        System.out.println(result);
        System.out.println(d1.contains("tj"));
        System.out.println(d1.contains("t"));

//        String d2=null;
//        System.out.println(d2.contains("t"));
        String d3 = " ";
        System.out.println(d3.contains("t"));
        System.out.println("***************7.isEmpty()******************");

        String d4 = " ";
        System.out.println(d4.length());
        System.out.println(d4.isEmpty());

        System.out.println(d1.isEmpty());

//        String d5=null;
//        System.out.println(d5.isEmpty("t"));
        System.out.println("***************8.isBlank()******************");
        System.out.println(d4.isBlank());
        String d6 = "";
        System.out.println(d6.isBlank());
        String d7 = "mona";
        System.out.println(d7.isBlank());
        System.out.println("***************9.charAt()******************");
        //input integer type and return character type so result in String
        // (according to index and its starts fron 0)

        String e1 = "Velocity Testing";
        System.out.println(e1.charAt(14));

        //System.out.println(e1.charAt(20));//boundary value exception
        System.out.println("***************10.endsWith()******************");
        //return boolean types
        //end with specific sequence given in input
        //input -sequence of character
        //single character also
        //whole string also
        //is a suffix of the character -ending portion
        //case sencetive

        String f1 = "selenium";
        System.out.println(f1.endsWith("m")); //true
        System.out.println(f1.endsWith("enium"));//true
        System.out.println(f1.endsWith("selenium"));//true
        System.out.println(f1.endsWith("Selenium")); //false  //case sencetive
        System.out.println(f1.endsWith("le")); //false

        System.out.println("***************11.startsWith()******************");
        //return boolean types
        //prefix of character-starting portion
        //single character also
        //whole string also
        //case sencitive
        System.out.println(f1.startsWith("s")); //true
        System.out.println(f1.startsWith("se"));//true
        System.out.println(f1.startsWith("m"));//false
        System.out.println("***************12.subString()******************");
        //return string result
        //return portion of string
        //2 options 1.beginindex-strarts with begin ingdext stretch to last of strin


        String g1 = "Velocity Corporate traning";
        System.out.println(g1.substring(9));
        System.out.println(g1.substring(0, 9));
        //  System.out.println(g1.substring(0,40));//boundary value exception


        System.out.println("********************************************************************************");
        //*concat*
        // concat the string
        //add new string in runtime

        String e="Java";
        String f="Testing";
        System.out.println(e.concat(f)); //JavaTesting
        System.out.println(e.concat(" ").concat(f));//Java Testing
        System.out.println(e.concat(" ").concat("Slenium ").concat(f)); //Java  Slenium Testing
        System.out.println("********************************************************************************");

        //*indexOf()*
        //input char result int in the form of index no
        //if eneter wwong or ivalid input then returns -1

        String k="pune";
        String k1="Testing";
        System.out.println(k.indexOf("u")); //1
        System.out.println(k1.lastIndexOf('t')); //3
        String k2="engineering";
        System.out.println(k2.indexOf("n",3)); //4
        System.out.println(k2.indexOf("i",7,9));//8
        System.out.println("********************************************************************************");
        //*replace()*
        String  l="testing";
        System.out.println(l.replace('t','l')); //lesling
        String l1="engineering";
        System.out.println(l1.replace("in","kl")); //engkleerklg
        System.out.println(l1.replaceFirst("in","kl"));//engkleeing
        System.out.println(l1.replaceAll("engineering","testing"));//testing


    }
}
