package gr.aueb.cf.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ExerciseGradesApp {
    public static void main(String[] args) {
        try{
            BufferedReader rd = new BufferedReader(new FileReader("C:/tmp/grades.txt"));
            PrintStream ps = new PrintStream(new FileOutputStream("C:/tmp/average_grade.txt",true),true, StandardCharsets.UTF_8);
            EditResults(rd,ps);

        }catch( FileNotFoundException e){
            e.printStackTrace();
            PrintError("Δεν βρέθηκε το αρχείο");

        }catch (IOException e){
            PrintError("Λάθος στην εφαρμογή");

        }

    }

    public static void EditResults(BufferedReader rd, PrintStream ps) throws IOException{
        String line;
        String[] records;
        String fullName;
        int average;
        int[] grades = new int[2];
        while((line = rd.readLine())!=null){
            records = line.split(" +");
            if(records.length!=4) {
                PrintError("Αποτυχία εγγραφής. Μη έγκυρος αριθμός ορισμάτων.");
                continue;
                }


            fullName = records[0] + " "+ records[1] + ": ";
            for(int i =2; i<4; i++){
                try{
                    grades[i-2]= Integer.parseInt(records[i]);
                    if(grades[i-2] < 0 || grades[i-2] > 10){
                        throw new NumberFormatException();
                        }

                }catch (NumberFormatException e){
                    PrintError("Λάθος βαθμός. Η εγγραφή απέτυχε");
                    break;
                }
            }
            average = (grades[0]+grades[1])/2;
            ps.println(fullName + average);

        }
    }

    public static void PrintError(String message){
         try{
            PrintStream ps  = new PrintStream(new FileOutputStream("C:/tmp/log.txt",true),true, StandardCharsets.UTF_8);
            ps.println(message);
        }catch(FileNotFoundException e){
             e.printStackTrace();
        }
    }
}
