package logicalPrograms;

public class CountNoOfWhiteSpace {
    public static void main(String[] args) {
        String s = "M O N A";  //3
        int counter = 0;
        for (int i = 0; i <= s.length() - 1; i++) {
            char temp = s.charAt(i);
            if (temp == ' ') {
                counter++;
            }

        }
        System.out.println(counter);
    }
}
