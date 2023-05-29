package gr.aueb.cf.chapter7;

public class ConcatApp {

    public static void main(String[] args) {
        String firstname = "Athanasios ";
        String lastname = "Androutsos";
        String fullname;
        String title = "Dr";
        String titlefullname;

        fullname = firstname + lastname;
        titlefullname = title.concat(firstname).concat(lastname);
        System.out.println(fullname);
        System.out.println(titlefullname);

    }
}
