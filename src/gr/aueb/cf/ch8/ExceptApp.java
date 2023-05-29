package gr.aueb.cf.ch8;

import java.io.IOException;

public class ExceptApp {
    public static void main(String[] args)  {
        int[] arr = new int[10];
       try {
           int ch = getNextChar();
           System.out.println(ch);
       } catch (IOException e){
           System.out.println("Invalid number");
       }

       for (int i= 0; i < arr.length; i++){
           System.out.println(arr[i] + " ");
       }
    }

    public static int getNextChar() throws IOException {
        int ch = ' ' ;
        try {
             ch = System.in.read();
        } catch (IOException ex){
            ex.printStackTrace();
            throw ex;
        }
        return ch;
    }
}
