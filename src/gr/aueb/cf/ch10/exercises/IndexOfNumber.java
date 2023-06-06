package gr.aueb.cf.ch10.exercises;

import java.util.Scanner;

public class IndexOfNumber {
    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 4,4, 6, 7, 8, 8, 8, 8, 8};
        Scanner in = new Scanner(System.in);
        int key;
        int[] index;

        System.out.println("Please select the number to be found: ");
        key= in.nextInt();
        index = getHighAndLowIndexOf(arr, key);
        if(index[0] >= 0) {
            System.out.printf("Number %d was found at index %d-%d", key, index[0] + 1, index[1] + 1);
        } else System.out.println("Numer " + key + " was not found");

    }

    public static int[] getHighAndLowIndexOf(int[] arr, int key){
        int[] result = new int[2];
        boolean found= false;
        int i = 0;
        while (!found && i < arr.length){
            if(arr[i] == key){
                found = true;
                result[0] = i;
                for(int j = i; j < arr.length; j++)
                    if(arr[j] ==key){
                        result[1]= j;
                    } else break;
                }
            i++;
        }
        if(!found) {
            result[0] =-1;
            result[1] =-1;

        }
        return result;
    }
}
