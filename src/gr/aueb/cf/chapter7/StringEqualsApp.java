package gr.aueb.cf.chapter7;

public class StringEqualsApp {

    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "Athens";
        String s3 = new String("Athens");
        String s4 = "athens";

       /** if(s1 == s3){
            System.out.println("Strings s1 and s2 are equal");
        }*/
       if(s1.equals(s3)){
           System.out.println("Strings s1 and s3 are equal");
       }

        if (s1.equalsIgnoreCase(s4)) {

            System.out.println("Strings s1 and s4 are equal");
        }
    }
}
