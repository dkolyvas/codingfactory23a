package gr.aueb.cf.ch11;

public class StudentApp {
    public static void main(String[] args) {
        Student alice = new Student(1, "Alice", "Wonderland");
        Student bob = new Student(1, "Bob", "D");
        /**alice.setId(1);
        alice.setFirstname("Alice");
        alice.setLastname("Wonderland");**/
        bob.setId(3);

        System.out.println("Id: "+ alice.getId());
        System.out.println("First Name :"+ alice.getFirstname());
        System.out.println("Last Name: "+ alice.getLastname());
        System.out.println(Student.getStudentsCount());
    }
}
