package gr.aueb.cf.ch10.exercises;

import java.util.Arrays;

public class DeepAndShallowCopy {

    public static void main(String[] args) {

        int[][] arr = {{2,5},{1,6},{7,3},{6,8}};
        int[][] shallow = shallowCopy(arr);
        int[][] deep = deepCopy(arr);

        System.out.println("original array is:");
        printArray(arr);
        arr[0][0]= 12;
        arr[0][1]=8;
        arr[1][0]=4;
        arr[1][1]= 0;
        arr[3][0]=45;
        System.out.println("modified array is:");
        printArray(arr);
        System.out.println("The shallow copy of the original array is :");
        printArray(shallow);
        System.out.println("The deep copy of the original array is :");
        printArray(deep);


    }

    public static int[][] shallowCopy(int[][] arr){
        int[][] copy;
        copy = arr;
        return copy;
    }

    public static int[][] deepCopy(int[][] arr){
        int[][] copy = new int[arr.length][arr[0].length];
        for(int i = 0; i < arr.length; i++){
            copy[i]= Arrays.copyOf(arr[i],arr[i].length);
        }


        return copy;
    }

    public static void printArray(int[][] arr){
            for(int i = 0; i<arr.length; i++){
                for(int j= 0; j<arr[i].length; j++) {
                    System.out.print(arr[i][j]+" ");
                   }
                System.out.println("");
            }
        }


}
