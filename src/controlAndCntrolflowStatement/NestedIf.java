package controlAndCntrolflowStatement;

public class NestedIf {
    //gmail login
    //if username correct ---please enter password
    //if password is correct --login successfuly--inbox
    //else password is incorrect--please check your password
    //else username is incorrect ---please check username
    static void main(String[] args) {
        String username ="mona";
        String password="mona@123";

        if(username =="mona"){
            if (password=="trupti@123"){
                System.out.println("login succesfully");
            }
            else{
                System.out.println("please enter correct passowrd");

            }
        }
        else{
            System.out.println("Please enter coorect username");
        }
    }



}
