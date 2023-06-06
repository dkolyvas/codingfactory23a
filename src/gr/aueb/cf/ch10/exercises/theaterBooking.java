package gr.aueb.cf.ch10.exercises;

import java.util.Scanner;

public class theaterBooking {
    static boolean[][] seats = new boolean[12][30];
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        initialize();

        while (choice != 4){
            printMenu();
            choice = in.nextInt();
            switch(choice){
                case 1:
                    bookSeat();
                    break;
                case 2:
                    cancelResevation();
                    break;
                case 3:
                    showAvailableSeats();
                    break;
                case 4:
                    System.out.println("Quitting the app. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again ");
                    break;
            }
        }





    }

    public static void printMenu(){
        System.out.println("Please choose one of the following:");
        System.out.println("1. Book a seat");
        System.out.println("2. Cancel a reservation");
        System.out.println("3. Show available seats");
        System.out.println("4. Quit");
    }

    public static int columnLetterToNumber (char column) {
        int columnNumber;
        switch (column) {
            case 'A':
                columnNumber = 0;
                break;
            case 'B':
                columnNumber = 1;
                break;
            case 'C':
                columnNumber = 2;
                break;
            case 'D':
                columnNumber = 3;
                break;
            case 'E':
                columnNumber = 4;
                break;
            case 'F':
                columnNumber = 5;
                break;
            case 'G':
                columnNumber = 6;
                break;
            case 'H':
                columnNumber = 7;
                break;
            case 'I':
                columnNumber = 8;
                break;
            case 'J':
                columnNumber = 9;
                break;
            case 'K':
                columnNumber = 10;
                break;
            case 'L':
                columnNumber = 11;
                break;
            default:
                columnNumber = -1;
        }
        return columnNumber;}


        public static void initialize () {
            for (int i = 0; i < 12; i++) {
                for (int j = 0; j < 30; j++) {
                    seats[i][j] = false;
                }
            }
        }

        public static int[] getSeatIndex(String seat) {
                int col;
                int row;
                int[] index = new int[2];
                int indexStr;
                String strRow;

                col = columnLetterToNumber(seat.charAt(0));

                indexStr = Integer.min(3,seat.length());

                try {
                    strRow = seat.substring(1,indexStr);
                    row = Integer.parseInt(strRow)-1;


                }catch(NumberFormatException e){
                    row = -1;}

                index[0]=col;
                index[1]=row;

                return index;

        }

        public static void showAvailableSeats() {
            final String COLUMNS = "ABCDEFGHIJKL";
            System.out.println("Available seats are:");
            for (int i = 0; i < 12; i++) {
                for (int j = 0; j < 30; j++) {
                    if (!seats[i][j]) {
                        System.out.printf("%c%d, " ,COLUMNS.charAt(i), j+1);
                    }
                }
                System.out.println("");
            }
        }


        public static void bookSeat() {

                String choice;
                int[] index;
                while (true) {
                    showAvailableSeats();
                    System.out.println("Please book a seat : ");
                    choice = in.next();

                    index = getSeatIndex(choice);

                    if(index[0] < 0 || index[1] < 0 || index[0] > 11 || index[1] > 29 ) {
                        System.out.println("Invalid choice. Please try again ");

                    } else if (seats[index[0]][index[1]]) {
                        System.out.println("Seat " + choice + " is already booked. Please try again");

                    } else {
                        seats[index[0]][index[1]] = true;
                        System.out.println("seat " + choice + " has been bookes successfully");
                        break;

                    }


                }
            }
            public static void showBookedSeats() {
                final String COLUMNS="ABCDEFGHIJKL";
                System.out.println("Booked seats are:");
                for (int i = 0; i <12; i++) {
                    for(int j = 0; j < 30; j++) {
                        if(seats[i][j]) {
                            System.out.printf("%c%d, " ,COLUMNS.charAt(i), j+1);
                        }
                    }
                }
            }

            public static void cancelResevation() {

                String choice;
                int[] index;
                while(true) {
                    showBookedSeats();
                    System.out.println("Please select the seat to be unbooked : ");
                    choice = in.next();

                    index = getSeatIndex(choice);

                    if (index[0] < 0 || index[1] < 0 || index[0] > 11 || index[1] > 29) {
                        System.out.println("Invalid choice. Please try again ");

                    } else if (!seats[index[0]][index[1]]) {
                        System.out.println("Seat " + choice + " is not booked. Please try again");

                    } else {
                        seats[index[0]][index[1]] = false;
                        System.out.println("seat " + choice + " has been unbooked successfully");
                        break;

                    }


                }

        }



    }
