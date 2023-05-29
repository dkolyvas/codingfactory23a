package gr.aueb.cf.ch6;

public class SecretArryWithMethod {
    public static void main(String[] args) {
        int[] arr = {1,2 ,3, 4, 5,6};
        int value = 0;
        int position = 0;
        position = getElementPosition(arr, value);
        System.out.println(position);
    }

    public static int getElementPosition(int[] arr, int value){

        for (int i = 0; i <arr.length; i++){
            if(arr[i]== value){
                return i;
            }

        }
        System.out.println("No matches");
        return -1;
    }
}
