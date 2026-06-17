package controlAndCntrolflowStatement;

public class ElseIf_Study {
    //else if statement is use to test multiple condition execute sequentially
    //descending order can be use of execution
    //last condition called as default condition
    //if any condition false then execute default condition

    static void main() {
        //if Age is <= 18 then Minor
        //else if Age is >=18 than Adult
        //else if Age is >=70 then  Senior  Citizen

        int Age = 15;
        if (Age >= 70) {
            System.out.println("Senior  Citizen");
        } else if (Age >= 18) {
            System.out.println("Adult");
        } else if ((Age <= 18)) {
            System.out.println("Minor");
        }
    }
}
