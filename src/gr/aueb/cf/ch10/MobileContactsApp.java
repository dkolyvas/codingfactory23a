package gr.aueb.cf.ch10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;


public class MobileContactsApp {
    final static Path path = Paths.get("C:/tmp/log-mobile.txt");
    final static String [][] contacts= new String[500][3];
    static int pivot= -1;
     final static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        String s;
        int choice;
        String phoneNumber;
        do{
            PrintMenu();
            s=getChoice();
            if(s.matches("[qQ]")) quit = true;
            else{
                try{
                    choice = Integer.parseInt(s);
                    if(!isValid(choice)){
                        throw new IllegalArgumentException("Error - Invalid Choice");
                    }
                    switch (choice){
                        case 1:
                            printContactMenu();
                            insertController(getFirstName(), getLastName(),getPhoneNumber());
                            break;
                        case 2:
                            printContactMenu();
                            deleteController(getPhoneNumber());
                            break;
                        case 3:
                            phoneNumber = getPhoneNumber();
                            printContactMenu();
                            updateController(phoneNumber, getFirstName(),getLastName(),getPhoneNumber());
                            break;
                        case 4:
                            phoneNumber = getPhoneNumber();
                            String[] contact = getOneController(phoneNumber);
                            printContact(contact);
                            break;
                        case 5:
                            String[][] allContacts = getAllContactsController();
                            printContacts(allContacts);
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid Choice");

                    }
                } catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
            }

        }while (!quit);
    }

    public static void printContact(String[] contact){
        for (String s:contact){
            System.out.print(s+ " \n");
        }
    }

    public static void printContacts(String [][] contacts){
        for(String[] contact: contacts){
            printContact(contact);

        }
    }

    public static boolean isValid( int choice){
        return (choice >=1 && choice<=5);
    }

    public static void PrintMenu(){
        System.out.println("Επιλέξτε ένα από τα παρακάτω");
        System.out.println("1. Εισαγωγή Επαφής");
        System.out.println("2. Διαγραφή Επαφής");
        System.out.println("3. Ενημέρωση Επαφής");
        System.out.println("4. Αναζήτηση Επαφής");
        System.out.println("5. Εκτύπωση όλων των επαφών");
        System.out.println("Q. Έξοδος");
    }
    public static String getChoice(){
        System.out.println("Επιλέξτε:");
        return in.nextLine();

    }
    public static void printContactMenu(){
        System.out.println("Εισάγετε Όνομα , Επώνυμο και Τηλέφωνο");
    }
   public static String getFirstName(){
       System.out.println("Εισάγετε όνομα");
       return   in.nextLine().trim();
   }

    public static String getLastName(){
        System.out.println("Εισάγετε επώνυμο");
        return   in.nextLine().trim();
    }

    public static String getPhoneNumber(){
        System.out.println("Εισάγετε τηλέφωνο");
        return   in.nextLine().trim();
    }
    /** controllers
     *
     */
    public static void insertController( String firstName, String lastName, String phoneNumber){
        try{
            if(firstName == null || lastName == null || phoneNumber==null){
                throw new IllegalArgumentException("null values are not allowed");
            }
            if (firstName.length()<2 || firstName.length()>50){
                throw  new IllegalArgumentException("FirstName is not valid");

            }
            if (lastName.length()<2 || lastName.length()>50){
                throw  new IllegalArgumentException("FirstName is not valid");

            }
            if(phoneNumber.length()<2|| phoneNumber.length()>12){
                throw new IllegalArgumentException("Phone number is not valid");

            }
            insertContactService(firstName.trim(), lastName.trim(), phoneNumber.trim());

        }catch (IllegalArgumentException e){
            e.printStackTrace();
            throw e;
        }
    }
    public static void updateController( String oldPhoneNumber, String firstName, String lastName, String newPhoneNumber){
        try{
            if(firstName == null || lastName == null || oldPhoneNumber==null || newPhoneNumber== null){
                throw new IllegalArgumentException("null values are not allowed");
            }
            if (firstName.length()<2 || firstName.length()>50){
                throw  new IllegalArgumentException("FirstName is not valid");

            }
            if (lastName.length()<2 || lastName.length()>50){
                throw  new IllegalArgumentException("FirstName is not valid");

            }
            if(newPhoneNumber.length()<2|| newPhoneNumber.length()>12){
                throw new IllegalArgumentException("Phone number is not valid");

            }
            if(oldPhoneNumber.length()<2|| oldPhoneNumber.length()>12){
                throw new IllegalArgumentException("Phone number is not valid");

            }
            updateController(oldPhoneNumber, firstName.trim(), lastName.trim(), newPhoneNumber.trim());

        }catch (IllegalArgumentException e){
            e.printStackTrace();
            throw e;
        }
    }

    public static String[] deleteController(String phoneNumber){
        try{
            if(phoneNumber.length()<2|| phoneNumber.length()>12){
                throw new IllegalArgumentException("Phone number is not valid");

            }
            return  deleteContactService(phoneNumber);
        }catch( IllegalArgumentException e){
            e.printStackTrace();
            throw e;
        }
    }

    public static String[] getOneController (String phoneNumber){
        try{
            if(phoneNumber.length()<2|| phoneNumber.length()>12){
                throw new IllegalArgumentException("Phone number is not valid");

            }
            return  getOneContactService(phoneNumber);
        }catch( IllegalArgumentException e){
            e.printStackTrace();
            throw e;
        }
    }

    public static String[][] getAllContactsController(){
        try{
            return getAllContactsService();
        }catch (IllegalArgumentException e){
            e.printStackTrace();
            throw e;
        }
    }

    /**service layer
     * */
     public static String[] getOneContactService(String phoneNumber){
         try{
             String[] contact = getContactByPhoneNumber(phoneNumber);
             if(contact.length ==0){
                 throw new IllegalArgumentException("Contact not found");
             }
             return contact;
         }catch (IllegalArgumentException e){
             log(e);
             throw e;
         }
     }


     public static String[][] getAllContactsService() {
          try {
              String[][] contactsList = getAllContacts();
              if (contactsList.length == 0) {
                  throw new IllegalArgumentException("List is empty");
              }
              return  contactsList;
          }catch (IllegalArgumentException e){
              log(e,"contact list is empty");
              throw e;
          }

     }

     public static void insertContactService (String firstName, String lastName, String phoneNumber){
         try{
             if(!insert(firstName, lastName,phoneNumber)){
                 throw new IllegalArgumentException("Error in insert");
             }
         } catch (IllegalArgumentException e){
                log(e);
                throw e;
         }

     }

     public static void updateContactService(String oldPhoneNumber, String firstName, String lastName, String newPhoneNumber){
         try{
             if(!update(oldPhoneNumber, firstName,lastName, newPhoneNumber)){
                 throw new IllegalArgumentException("Error in update");
             }

         }catch (IllegalArgumentException e) {
             throw e;
         }
     }

     public static String[] deleteContactService (String phoneNumer){
         String[] contact;
         try{
             contact = delete(phoneNumer);
             if(contact.length ==0){
                 throw new IllegalArgumentException("Error in Delete");
             }
             return contact;

         }catch (IllegalArgumentException e){
             log(e);
             throw  e;
         }
     }


    /**Crude services that are provided to service layer*/
    public static int getIndexByPhoneNumber(String phoneNumber){
        for (int i =0; i<=pivot; i++ ){
            if (contacts[i][2].equals(phoneNumber)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean insert (String firstName, String lastName, String phoneNumber){
        boolean inserte= false;
        if( isFull(contacts)) return false;
        if (getIndexByPhoneNumber(phoneNumber) !=-1){
            return false;
        }
        pivot++;
        contacts[pivot][0]= firstName;
        contacts[pivot][1] = lastName;
        contacts[pivot][2] = phoneNumber;

        return true;
    }
    public static boolean update(String oldPhonenumber,String firstName, String lastName, String newPhoneNumber){
        int positionToUpdate = getIndexByPhoneNumber(oldPhonenumber);
        String[] contact = new String[3];
        if(positionToUpdate == -1) {
//            return new String[] {};
            return false;

        }
//        contact[0] = contacts[positionToUpdate][0];
//        contact[1] = contacts[positionToUpdate][1];
//        contact[2] = contacts[positionToUpdate][2];

        contacts[positionToUpdate][0] = firstName;
        contacts[positionToUpdate][1] = lastName;
        contacts[positionToUpdate][2] = newPhoneNumber;

        return true;
    }

    public static boolean isFull(String[][] arr){
        return pivot==arr.length -1;
    }

    public  static String[] delete(String phoneNumber){
        int positionToDelete = getIndexByPhoneNumber(phoneNumber);
        String[] contact = new String[3];
        if (positionToDelete==-1){
            return  new String[] {};
        }

        for(int i= 0; i< contacts.length; i++){
            contact[i]= contacts[positionToDelete][i];
        }
        if (positionToDelete != contacts.length-1){
            System.arraycopy(contacts, positionToDelete + 1, contacts, positionToDelete, pivot);
        }
        pivot--;
        return contact;
    }

    public static String[] getContactByPhoneNumber(String phoneNumber){
        int positionToReturn = getIndexByPhoneNumber(phoneNumber);
        if(positionToReturn == -1){
            return new String[] {};
        }
        return contacts[positionToReturn];
    }

    public static String[][] getAllContacts(){
        return Arrays.copyOf(contacts, pivot+1);
    }

    public static void log(Exception e, String...message) {
        try (PrintStream ps = new PrintStream(new FileOutputStream(path.toFile(), true))) {
            ps.println(LocalDate.now() + "\n" + e.toString());
            ps.printf("%s", (message.length == 1) ? message[0] : "");

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
