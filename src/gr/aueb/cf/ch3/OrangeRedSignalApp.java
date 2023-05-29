package gr.aueb.cf.ch3;

import java.util.Scanner;

public class OrangeRedSignalApp {
    /**
     * Ένα αεροσκόφος έχει δύο δεξαμενές
     * Αν μία δεξαμενή έχει λιγότερο από
     * 1/4 καύσιμα  μόνο σε μία τότε ανάβει πορτοκαλί σήμα,
     * ενώ αν και οι δύο έχουν λιγότερο από ένα τέταρτο
     * τότε ανάβει κόκκινο σήμα
     * O πιλότος δίνει true/false για tank1 tank2 <1/4
     */


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isTank1Empty = false;
        boolean isTank2Empty = false;
        boolean orangeOn = false;
        boolean redOn = false;

        System.out.println(" Please insert if Tank 1 < 1/4 (true / false):");
        isTank1Empty = in.nextBoolean();
        System.out.println("Please insert if Tank 2 < 1/4 (true/false):");
        isTank2Empty = in.nextBoolean();

        orangeOn = isTank1Empty || isTank2Empty;
        redOn = isTank1Empty && isTank2Empty;



    }
}