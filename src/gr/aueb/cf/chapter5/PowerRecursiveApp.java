package gr.aueb.cf.chapter5;

public class PowerRecursiveApp {
    public static void main(String[] args) {

    }

    public static float power (float a, float b){
        if (b == 0){
            return 1;
        }
        else if ( b < 0){
            return  power(a, b + 1) / a;
        }
        return a * power(a, b-1);
    }

}
