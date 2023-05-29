package gr.aueb.cf.ch10;

public class ProjectCh5 {
    public static void main(String[] args) {

    }

    public static void printStarsH (int n){
        for (int i = 1; i<=n; i++){
            System.out.print("*");
        }
    }
    public static void printStarsV (int n){

        for (int i = 1; i<=n; i++){
            System.out.println("*");
        }
    }
    public static void prinStatsHV(int n){
        for (int i = 1; i<=n; i++)
        {
            printStarsH(n);
            System.out.println();
        }
    }
    public static void printStarsAsc (int n){
        for(int i = 1; i<=n; i++){
            printStarsH(i);
            System.out.println();
        }
    }
    public static void printStarsDesc ( int n){
        for (int i= n; i>0; i++) {
            printStarsH(i);
            System.out.println();
        }
        }
        public static void printMenu(){
            System.out.println("Please select one of the following");
    }
}
