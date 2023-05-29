package gr.aueb.cf.chapter7;

public class CompareStringsApp {

    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "athens";

        if(s1.compareTo(s2) < 0){
            System.out.println("s1 < s2");
        } else if (s1.compareTo(s2)>0){
            System.out.println("s1 > s2");
        } else {
            System.out.println("s1 = s2");
        }

    }
}
