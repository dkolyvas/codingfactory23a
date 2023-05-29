package gr.aueb.cf.chapter7;

public class SplitStringApp {
    public static void main(String[] args) {
        String s = "Athens  University of Economics and Business";
        String[] tokens = s.split(" ");
        for( String token : tokens){
            System.out.println(token + "/");
        }
        tokens = s.split(" +");
    }
}
