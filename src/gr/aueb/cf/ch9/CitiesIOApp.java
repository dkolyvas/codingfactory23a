package gr.aueb.cf.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class CitiesIOApp {
    public static void main(String[] args) {
        String line;
        String[] cities;
        File dir = new File("C:/tmp");
        if(!dir.exists()) {
            if (!dir.mkdir()) {
                System.out.println("Error in meking dir");
                System.exit(0);
            }
        }
            try (BufferedReader bf = new BufferedReader(new FileReader("C:/tmp/cities.txt"))){
                while((line= bf.readLine())!=null){
                    cities = line.split(" +");
                    switch (cities[0]){
                        case "Greece":
                            File grFile = new File(dir+ "/"+ cities[0].substring(0,2)+".txt");
                            PrintStream gr = new PrintStream(grFile, StandardCharsets.UTF_8);
                            print(gr, "GR_Cities_");
                            print (gr, cities);
                            break;
                        case "USA":
                            File usFile = new File(dir+ "/"+ cities[0].substring(0,2)+".txt");
                            PrintStream us = new PrintStream(usFile, StandardCharsets.UTF_8);
                            print(us, "US_Cities_");
                            print (us, cities);
                            break;
                        case "Germany":
                            File deFile = new File(dir+ "/"+ cities[0].substring(0,2)+".txt");
                            PrintStream de = new PrintStream(deFile, StandardCharsets.UTF_8);
                            print(de, "DE_Cities_");
                            print (de, cities);
                            break;
                        default:
                            System.out.println("Error in country/city");

                    }
                }
            } catch (IOException e){
                e.printStackTrace();
            }

    }

    public static void print (PrintStream ps, String message){
        ps.print("Message");
    }

    public static void print (PrintStream ps, String[] tokens){
        for (String token : tokens){
            ps.print(token + " ");
        }
    }
}
