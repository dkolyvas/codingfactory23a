package gr.aueb.cf.ch6.exercises;

public class MaxPositionApp {


    public static int getMaxPosition(int[] arr, int low, int high) {
        int position = -1;
        int maxValue = Integer.MIN_VALUE;
        if(low < 0 || high >= arr.length || arr == null) {
            return position;
        }
        for (int i = low; i <= high; i++) {
            if (arr[i] >= maxValue) {
                maxValue = arr[i];
                position = i;
            }
        }
        return position;
    }


}