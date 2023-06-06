package gr.aueb.cf.ch10.exercises;

import java.util.Arrays;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] maxSubarray;
        System.out.print("Initial array is {");
        for (int i : arr){
            System.out.print(i + ",");
        }
        System.out.print("}\n");
        maxSubarray = getMaxSubarray(arr);

        System.out.print("Max sum subarray is {");
        for (int i : maxSubarray){
            System.out.print(i + ",");
        }
        System.out.print("}\n");


    }

    public static int[] getMaxSubarray(int[] arr) {

        /** Η μέθοδος ξεκινάει από την αρχή του πίνακα και ελέγχει τα αθροίσματα
         * διαδιοχικών υποπινάκων. Αν το άθροισμα ξεπερνάει αυτό που μέχρι τώρα έχει βρεθεί
         * απομονώνει τη μέχρι τώρα μέχιστη τιμή και το index του αντίστοιχου υποπίνακα.
         * Αν η τιμή του υποπίνακα είναι αρνητική ξεκινάει να ελέγχει για υποπίνακες που ξεκινάνε
         * από το επόμενο στοιχείο καθώς οι επόμενοι υποπίνακες θα έχουν μεγαλύτερο άθροισμα.
         * Μόνη εξαίρεση η περίπτωση που όλα τα νούμερα του πίνακα είναι αρνητικά οπότε
         * δίνεται το index της μεγαλύτερης τιμής
         */


        int maxSum = Integer.MIN_VALUE;
        int lowIndex = 0;
        int highIndex = 0;
        int currSum = 0;
        int maxNumIndex = 0;
        int[] maxArray;
        int currLow = 0;


        int i = 0;

        while (i < arr.length) {
            if(arr[maxNumIndex]< arr[i]) maxNumIndex = i;

            currSum += arr[i];
            if (currSum <= 0) {
                currSum = 0;
                currLow = ++i;
                continue;
            }
            if (currSum > maxSum) {
                highIndex = i;
                maxSum = currSum;
                lowIndex = currLow;
            }

            i++;

        }
        if(maxSum >0){
            maxArray = Arrays.copyOfRange(arr, lowIndex, highIndex+1);
        } else {
            maxArray = Arrays.copyOfRange(arr, maxNumIndex, maxNumIndex+1);
        }
        return maxArray;
    }
}
