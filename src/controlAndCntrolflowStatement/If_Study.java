package controlAndCntrolflowStatement;

public class If_Study {
    static void main(String[] args) {
        //if your Division is A then you are  excellent student
        //meaning of Is = equals to
        char div = 'A';

        if (div == 'A') {
            System.out.println("You are  excellent student");
        }

        System.out.println("===========");


        if (div == 'B') {
            System.out.println("You are  excellent student");
        }
        //if grade is pass then Your are go to next class
        String grade="Pass";

        if (grade == "Pass") {
            System.out.println("Your are go to next class");
        }

        System.out.println("===========");
        if (grade =="Fail") {
            System.out.println("You are  excellent student");
        }



    }
}
