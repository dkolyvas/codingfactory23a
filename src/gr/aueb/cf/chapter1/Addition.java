package gr.aueb.cf.chapter1;

import gr.aueb.cf.chapter1.model.Point;
import static java.lang.Math.abs;
public class Addition {
    private Point point;
    public static void main(String[] args)
    {

        int num1 = 19; int num2=30;
        int sum = num1 + num2;
        System.out.printf("The sum of %d and %d equals %d ", num1, num2, sum);
        int abs = java.lang.Math.abs(-3);
    }
    /** Adds two ints
     * @param a the first int
     * @param b the second int
     * @return a+b
     *
     
     * @deprecated
    */
    public static int add(int a, int b){
        return a + b;
    }
}
