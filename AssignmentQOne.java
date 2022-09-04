package BitManipulation;
import java.util.*;
public class AssignmentQOne {
    public static void main(String args[]) {
        /*
         * What is the value of x^x for any valueof x?
         */
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        x = x ^ x;
        System.out.println(x);
    }
}
