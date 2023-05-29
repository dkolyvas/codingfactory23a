package gr.aueb.cf.chapter2;

import java.math.BigInteger;

public class AddBigIntApp {

    public static void main(String[] args) {
        BigInteger bigNum= new BigInteger("2147483647");
        BigInteger bigNum2 = new BigInteger("151651651651679");
        BigInteger result= new BigInteger("8");

        result = bigNum.add(bigNum2);
    }
}
