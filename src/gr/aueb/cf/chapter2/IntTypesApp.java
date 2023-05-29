package gr.aueb.cf.chapter2;

/**
 * Εμφανίζει τους τύπους δεδομένων
 * ακεραίων, το μέγεθος και τα
 * MIN max
 */
public class IntTypesApp {

    public  static void main(String[] args)
    {System.out.printf("Type: %s, Size: %d bits, Min %d, Max: %d", Integer.TYPE, Integer.BYTES*8, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("Type: %s, Size: %d bits, Min %d, Max: %d", Byte.TYPE, Byte.BYTES*8, Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("Type: %s, Size: %d bits, Min %d, Max: %d", Short.TYPE, Short.BYTES*8, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("Type: %s, Size: %d bits, Min %d, Max: %d", Long.TYPE, Long.BYTES*8, Long.MIN_VALUE, Long.MAX_VALUE);
/**
 * Byte
 * Short
 * Long
 */
    }
}
