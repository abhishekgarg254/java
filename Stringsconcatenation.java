import java.util.*;

public class Stringsconcatenation {
    public static void main (String args[]){
        //conactination
        String firstName = "Abhishek";
        String lastName = "Garg";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName.length());

        //charAct
        for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }
    }    
}
