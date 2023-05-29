package gr.aueb.cf.ch6;

public class PopulateArry {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 5;
        arr[1] = 7;
        arr[2] = 8;

        //unsized array initialization

        int[] arr2 = {1, 5, 8, 9, 12};

        //array initializer

        int[] arr3;
        arr3 = new int[]{4, 6, 9, 10};

        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        for (int item : arr3) {
            System.out.print(item + " ");
        }
    }
}
