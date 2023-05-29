package gr.aueb.cf.chapter7;

public class ForStringApp {
    public static void main(String[] args) {
        String s= "Coding Factory";
       /* for(int i = 0; i<s.length(); i++){
            System.out.print(s.charAt(i)+ " ");
        }
        System.out.println("\u2764");
        for(char ch :s.toCharArray())
        {
            System.out.print(ch + " ");
        }
        System.out.println("\u2764");

        int index = s.indexOf("od");
        System.out.println(index);

        index=s.indexOf("o",7);
        System.out.println(index);

        index = s.lastIndexOf("o");
        System.out.println(index);
        if(s.startsWith("Coding")) System.out.println("Start Ok");*/

        String substring = s.substring(0, 6);
        System.out.println(substring);
    }


}
