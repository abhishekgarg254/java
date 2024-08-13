import java.util.*;

public class stringbuilderdeclarartion {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Abhishek");
        System.out.println(sb);

        //char at index 0
       // System.out.println(sb.charAt(0));

        //set char at index
        //sb.setCharAt(0, 'p');
        //System.out.println(sb);

        sb.insert(0,'S');
        System.out.println(sb);

        //deleting
        sb.delete(0, 1);
        System.out.println(sb);
    }    
}
