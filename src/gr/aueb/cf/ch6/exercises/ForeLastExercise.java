package gr.aueb.cf.ch6.exercises;

public class ForeLastExercise {


    public static int getSecondMin (int[] arr)
    {
        int minVal = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        if (arr == null || arr.length== 1){
            System.out.println("Invalid Data");
            return second;
        }
        for (int i =0; i <arr.length; i++){
            if (arr[i] < minVal){
                second = minVal;
                minVal = arr[i];
            }
        }
        return second;

    }
}
