package gr.aueb.cf.ch10.exercises;

import java.util.Scanner;

public class theaterBooking {
    static boolean[][] seats = new boolean[12][30];
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {


        }


    }

    public static int columnLetterToNumber (char column) {
        int columnNumber;
        switch (column) {
            case 'A':
                columnNumber = 0;
                break
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

        public static int[][] getSeatIndex(String seat) {
                int col;
                int row;

                col = columnLetterToNumber(seat.charAt(0));



        }

    }
