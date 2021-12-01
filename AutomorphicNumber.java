import java.util.Scanner;

public class AutomorphicNumber {

    public static void main(String[] args) {

        System.out.println("Enter a number:");

        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long numSq = (long) Math.pow(num, 2);


        while (numSq != 0) {

            long numSqRev = 0; // is used to cut off the last digit(first when not reversed)
            long numSqAtEnd = 0; // final result after all calculations, is used to check if equal to num inputted by user
            long tmpNumSQ = numSq; //  gets destroyed to 0 - used for reversing numSQ

            while (tmpNumSQ != 0) { // Reverses numSQ, stores result in numSqRev
                long rem = tmpNumSQ % 10;
                numSqRev = numSqRev * 10 + rem;
                tmpNumSQ = tmpNumSQ / 10;
            }

            numSqRev = numSqRev / 10; // takes out last digit from the reversed number

            long tmpNumSQRev = numSqRev; // gets destroyed to 0 - used for reversing numSqRev

            while (tmpNumSQRev != 0) { // reverses numSqRev, stores result in numSqAtEnd
                long rem = tmpNumSQRev % 10;
                numSqAtEnd = numSqAtEnd * 10 + rem;
                tmpNumSQRev = tmpNumSQRev / 10;
            }


            /* checks to see if the number(that was reversed, last digit taken off, and reversed again)
            is equal to original num inputted by the user */
            if (numSqAtEnd == num) {
                System.out.println(num + " is an automorphic number");
                System.exit(0); // exits out of program if true
            }

            numSq = numSqAtEnd; // sets numSQ to the number received after all reversions and calculation
        }

        System.out.println(num + " is not an automorphic number"); // else not balha baljhsdf blah

    }

}
