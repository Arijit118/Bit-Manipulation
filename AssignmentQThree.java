package BitManipulation;

public class AssignmentQThree {
    public static void main(String args[]) {
        /*
         * Add 1 to an integer using Bit Manipulation.
         * Hint: Try using BitWise Not operator.
         * 
         * The expression -~x will add 1 to an integer x.We know that to get negative of a number,
         * invert its bits and add 1 to it (Remember negative numbers are stored in 2’scomplement form).
         */
        int x = 6;
        System.out.println("X + 1 = "+ -~x);
    }
}
