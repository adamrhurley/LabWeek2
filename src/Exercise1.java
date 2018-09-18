import java.util.Scanner;


public class Exercise1 {
    public static void main(String[] args) {

        float exchangeRate, poundValue;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter an exchange rate: ");
        exchangeRate = input.nextFloat();

        System.out.print("Please enter a £ value: ");
        poundValue= input.nextFloat();



        while(poundValue>0)
        {
            System.out.print("Euro Value: "+ String.format("%.2f",poundValue*exchangeRate) + "\nPound Value: " + poundValue );

            System.out.print("\nPlease enter a £ value: ");
            poundValue= input.nextFloat();



        }
    }
}
