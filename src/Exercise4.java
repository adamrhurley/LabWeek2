import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args)
    {
        String fullName, capitalName /*surname*/;
        int nameLength;
        char firstInitial;
         Scanner input = new Scanner(System.in);

         System.out.print("Please enter your full name: ");
         fullName = input.nextLine();

         nameLength = fullName.length();

         firstInitial = fullName.charAt(0);

         capitalName = fullName.toUpperCase();

         //surname = fullName.lastIndexOf();


         System.out.println("The length of your name is " + nameLength + " letters long");

         System.out.println("\n\nThe first initial of your name is: " + firstInitial) ;

         System.out.println("\n\nYour name in capital letters is: " + capitalName);

        // System.out.print("Your surname is: " + surname);

    }
}
