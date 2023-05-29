package gr.aueb.cf.ch8;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        int choice=0;
        while(choice!=5){
            PrintMenu();
            try{
                choice = getChoice();
                printChoice(choice);
            } catch (IllegalArgumentException e){
                e.fillInStackTrace();
                System.out.println("Wrong selection. Please try again");
            }
        }

    }

    public static void PrintMenu(){
        System.out.println("Please select one of the following:");
        System.out.println("1. New File");
        System.out.println("2. Open existing File");
        System.out.println("3. Move  File");
        System.out.println("4. Delete file");
        System.out.println("5. Exit");
    }

    public static int getChoice() throws IllegalArgumentException{
        Scanner in = new Scanner(System.in);
        if(in.hasNextInt()) return in.nextInt();
        else throw new IllegalArgumentException();
    }

    public static void printChoice(int choice) throws IllegalArgumentException{
        switch ( choice){
            case 1:
                System.out.println("Creating new file");
                break;
            case 2:
                System.out.println("Opening File");
                break;
            case 3:
                System.out.println("Moving File");
                break;
            case 4:
                System.out.println("Deleting File");
                break;
            case 5:
                System.out.println("Quiting");
                break;
            default:
                throw new IllegalArgumentException();
        }
    }


}
