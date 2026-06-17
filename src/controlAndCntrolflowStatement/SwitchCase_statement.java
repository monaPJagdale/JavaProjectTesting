package controlAndCntrolflowStatement;

public class SwitchCase_statement {
    //switch case statement use for multiple cases or condition check
    //default statement is mandatory for meaning full  message
    //switch (expression) -inside the parenthesis expression will be evaluated
    //compiler will jump to the match expression and corresponding block will be executed
    //break keyword is used to break the compiler execution corresponding match expression found
    //else if statement will execute over the true condition will found & switch case directly on match expression found and execute
    //switch case is time efficient than if else if statement
    static void main(String[] args) {
        //season summer -->then print"Please on the AC"
        //season Rainy -->then print"Please on the Umbrella"
        //season cold -->then print"Please on the Heater"-0
        String season = "Rainy";

        switch (season) {
            case "summer":
                System.out.println("Please on the AC");
                break;
            case "Rainy":
                System.out.println("Please on the umbrella");
                break;
            case "cold":
                System.out.println("Please on the heater");
                break;
            default:
                System.out.println("Enter correct season name");
        }

    }

}
