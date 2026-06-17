package logicalPrograms;

public class ReverseStringFromOddPlace {
    static void main(String[] args) {
       String s = "java Selenium Automation";
        String[] s1 = s.split(" ");
        String reserved ="";
        System.out.println(s1[0]);
        //System.out.println(s1[1]);
        //System.out.println(s1[2]);

        for (int i = 0; i <= s1.length-1; i++) {
            //odd index
            if (i % 2 != 0) {
                String temp = s1[i];  //selenium
                for (int j = temp.length() - 1; j >= 0; j--) {
                    reserved = reserved+temp.charAt(j);
                }
                s1[i] = reserved;
                reserved = " ";

            }
        }

        for (int i = 0; i <= s1.length - 1; i++) {
            System.out.println(s1[i] + " ");
        }
//
//        String s = "Java Selenium Automation Testing";
//        String[] s1 = s.split(" "); //{"Java" "Selenium" "Automation"}
//        String rev = "";
//        for (int i = 0; i <= s1.length - 1; i++) {
//            if (i % 2 != 0) {
//                String temp = s1[i];//selenium
//                for (int j = temp.length() - 1; j >= 0; j--) {
//                    rev = rev + temp.charAt(j);// rev=muineleS
//                }
//                s1[i] = rev;//selenium
//                rev = "";
//            }
//        }
//
//
//
//
//        for (int i = 0; i <= s1.length - 1; i++) {
//            System.out.print(s1[i] + " ");
//        }



    }

}

