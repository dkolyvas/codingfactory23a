package gr.aueb.cf.chapter5.exercise;


import java.util.Scanner;


public class ExerciseStarMenu {
    public static void main(String[] args) {
        int choice = 0;
        Scanner in = new Scanner(System.in);
        do {
            ShowMenu();
            choice = in.nextInt();
            if ((choice <= 0)|| (choice >6)){
                System.out.println("Invalid choice");
                continue;
            }
            switch (choice){
                case 1:
                    ShowHorizontally();
                    break;
                case 2:
                    ShowVertically();
                    break;
                case 3:
                    ShowSquare();
                    break;
                case 4:
                    ShowUpperTriangle();
                    break;
                case 5:
                    ShowLowerTriangle();
                    break;
                case 6:
                    System.out.println("Quitting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }

        } while (choice !=6);
    }

    public static void ShowMenu(){
        System.out.println("Please choose one of the following");
        System.out.println("1. Show stars in horizontally");
        System.out.println("2. Show stats vertically");
        System.out.println("3. Show a square of stars");
        System.out.println("4. Show an upright triangle of stars");
        System.out.println("5. Show a reverse triangle of stars");
        System.out.println("6. Quit");
    }

    public static int SelectStarsNumber(){
        int n = 0;
        Scanner in = new Scanner(System.in);
        while (n <= 0){
            System.out.println("Please select the number of stars");
            n = in.nextInt();
            if (n > 0){
                return n;
            }
            else {
                System.out.println("Invalid Choice");
            }
        }
        return n;
    }

    public static void ShowHorizontally()
    {
        int n = 0;
        n = SelectStarsNumber();

        for(int i = 1; i <=n; i++){
            System.out.print("*");
        }
        System.out.println("");

    }
    public static void ShowVertically(){
        int n = 0;
        n = SelectStarsNumber();

        for(int i = 1; i <= n; i++){
            System.out.println("*");
        }

    }

    public static void ShowSquare() {
        int n = 0;
        n = SelectStarsNumber();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void ShowUpperTriangle(){
        int n = 0;
        n = SelectStarsNumber();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    public static void ShowLowerTriangle (){
        int n = 0;
        n = SelectStarsNumber();

        for(int i = 1; i <= n; i++){
            for(int j = n; j >= i; j--){
                System.out.print("*");
            }
            System.out.println("");
        }

    }



}
