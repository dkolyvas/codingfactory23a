package gr.aueb.cf.chapter7;

public class StringFormatApp {
    public static void main(String[] args) {
        char ch= 'B';
        int num = 8;
        String seat = String.format("%c%02d", ch, num);
        System.out.println(seat);
    }
}
