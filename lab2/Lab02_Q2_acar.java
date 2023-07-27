import java.util.Scanner;

public class Lab02_Q2_acar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter your Phone number");
        String phoneNumber = in.nextLine();
        String nospace = phoneNumber.replaceAll("\\s", "");
        System.out.println( nospace );

        System.out.println("country code: " + nospace.substring(nospace.indexOf("(") + 1, nospace.indexOf(")")));
        System.out.println("area code: " + nospace.substring(nospace.indexOf(")") + 1, nospace.indexOf("-")));   
        System.out.println("phone number: " + nospace.substring(nospace.indexOf("-") + 1, nospace.length() - 2) + " " + nospace.substring(nospace.length() -2, nospace.length()));
        in.close();


    }

}

