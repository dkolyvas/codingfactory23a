package gr.aueb.cf.ch6;

public class ArraySearchApp {


    public static void main(String[] args) {
        final int SECRET = 12;
        int[] arr = {1,5,9,3,12};
        boolean secretFound = false;

        for (int item: arr){
            if(item == SECRET){
                secretFound = true;
                break;
            }
        }
        if(secretFound) {
            System.out.println("Secret Key was found");

        } else {
            System.out.println("Secret key wasn't found");
        }

    }
}
