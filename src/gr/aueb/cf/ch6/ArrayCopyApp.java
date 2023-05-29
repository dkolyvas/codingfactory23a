package gr.aueb.cf.ch6;

import java.util.Arrays;

public class ArrayCopyApp {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] arr2 = new int[arr.length];
        int[] arr3;
        System.arraycopy(arr, 0,arr2,0,arr.length);

        // εναλλακτικά

        arr3 = Arrays.copyOf(arr,arr.length);
        int[] arr4 = Arrays.copyOfRange(arr,2, arr.length);
    }
}
