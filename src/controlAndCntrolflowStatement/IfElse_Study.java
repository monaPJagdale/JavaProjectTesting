package controlAndCntrolflowStatement;

public class IfElse_Study {
    //if condition true then body will be excute
    //if condition false then else body will be excute

    static void main(String[] args) {
        //if fever is greater >= 96.oo then High Fever
        //else Low Fever
        float fever=92f;
        if (fever>=96.0f)
        {
            System.out.println("High Fever");
        }
        else
        {
            System.out.println("Low Fever");
        }
    }
}
