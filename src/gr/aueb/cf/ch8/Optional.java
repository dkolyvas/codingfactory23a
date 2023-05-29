/**
package gr.aueb.cf.ch8;

import java.sql.SQLOutput;
import java.util.Optional;

public class Optional {
    public static void main(String[] args) {
//        String s = null;
//        String str = getCopy(s);
//        if(str.equals("AUEB")){
//            System.out.println(str);

        String s = "AUEB";
        String copied = null;
        Optional<String> str = getStrCopy(s);
        if(str.isPresent()){
            copied= str.get();
            }
        System.out.println(copied);
        stri.isPresent(System.out::println);
    }

    public static String getCopy( String s){
       return s;
    }

    public static Optional<String> getStrCopy(String s){
        if(s==null) return Optional.empty();
        return Optional.of(s);
    }
}
*/
