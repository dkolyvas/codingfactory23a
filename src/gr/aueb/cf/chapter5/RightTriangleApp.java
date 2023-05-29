package gr.aueb.cf.chapter5;

import java.util.Scanner;

/**
 * Λαμβάνει τριες τιμές a, b, c
 * για τις πλευρές ενός τριγώνου όπου
 * a είναι η υποτείνουσα, και b,c οι άλλες δύο και αποφαίνεται
 * αν το τρίγωνο είναι ορθογώνιο βάσει του
 * πυθαγορείου θεωρήματος
 */
public class RightTriangleApp {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        Scanner in = new Scanner(System.in);
        final double EPSILON = 0.000005;
        boolean isRight = false;

        System.out.println("Please insert triangle dimensions a, b, c where a is the largest side");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        a *=a;
        b *=b;
        c *=c;

        isRight = (Math.abs(a-b-c) <=EPSILON);

        System.out.println("Triangle is right: "+ isRight);



    }
}
