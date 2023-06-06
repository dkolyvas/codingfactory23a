package gr.aueb.cf.ch11;

public class AccountApp {
    public static void main(String[] args) {
        Account alice = new Account(1, "GR12345", "Alice", "W", "f12345", 350);


        try {
            alice.deposit(100);
            System.out.println("New balance is " + alice.getAccountBalance());
        }catch (Exception e){
            System.out.println(e.getMessage());

        }
    }
}
