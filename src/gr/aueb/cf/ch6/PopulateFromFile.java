package gr.aueb.cf.ch6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PopulateFromFile {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:/Data_Files/int.txt");
        Scanner inp = new Scanner(file);


        int[] grades = new int[5];

        for (int i = 0; i < grades.length; i++) {
            grades[i] = inp.nextInt();
        }

        for (int grade : grades) {
            System.out.print(grade + " ");
        }
    }
}
