package BitManipulation;

public class AssignmentQFour {
    public static void main(String args[]) {
        /*
         * Convert uppercase characters to lowercase using bits
         */
        //Ascii value of space is 32, and A = 65;
        // int val = ' '; 
        // System.out.println(val);
        for(char ch='A'; ch<='Z'; ch++) {
            System.out.println((char)(ch | ' '));
        }
    }
}
