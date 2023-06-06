package gr.aueb.cf.ch11;

import java.util.Scanner;

public class Student {
    private int id;
    private String firstname;
    private String lastname;
    private static int studentsCount = 0;
//
//    public Student(){
//        /**id = 0;
//        firstname = null;
//        lastname = null;**/
//    }
//
//    public Student(int id, String firstname, String lastname){
//        this.id = id;
//        this.firstname = firstname;
//        this.lastname = lastname;
//    }
//
//    public int getId(){
//        return id;
//    }
//    public void setId(int id1){
//        this.id = id1;
//    }
//
//    public String getFirstname(){
//    return firstname;}
//
//    public void setFirstname(String firstname1) {
//        this.firstname = firstname1;
//    }
//
//    public String getLastname(){
//        return lastname;
//    }
//
//    public void setLastname(String lastname1){
//        this.lastname = lastname1;
//    }
    static Scanner in = new Scanner(System.in) ;
    static {
        int num = in.nextInt();
        studentsCount = (num ==1) ? 1 : 0;

        }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Student(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        studentsCount++;
    }

    public Student(){
        studentsCount++;
    }

    public static int getStudentsCount() {
        return studentsCount;
    }
}
