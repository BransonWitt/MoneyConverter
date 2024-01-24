import java.util.Scanner; //importing Scanner

public class MoneyConverter {
    public static void main(String[] args) {
        //Creating our Scanner to read how much money a person has
        Scanner EnterAmount = new Scanner(System.in);

        //Asking and Receiving money amount
        System.out.println("Enter the total amount of money you have:");
        String TotalAmountS = EnterAmount.nextLine();

        //If the person uses a $ sign, remove it
        if (TotalAmountS.charAt(0) == '$') {
            TotalAmountS = TotalAmountS.substring(1);
        }

        //Converting a String into a Double
        Float TotalAmount = Float.parseFloat(TotalAmountS);

        // Rounding whatever is imported as #.## into a rounded ###. format
        int IntAmount = (int)Math.floor(TotalAmount * 100);

        //Computing Coinage
        int Dollars = IntAmount / 100;
        IntAmount = IntAmount - (Dollars * 100);
        int Quarters = IntAmount / 25;
        IntAmount = IntAmount - (Quarters * 25);
        int Dimes = IntAmount / 10;
        IntAmount = IntAmount - (Dimes * 10);
        int Nickels = IntAmount / 5;
        IntAmount = IntAmount - (Nickels * 5);

        //Printing out total Amount
        System.out.println("Coinage Broken Down:");
        System.out.println(Dollars + " Dollars");
        System.out.println(Quarters + " Quarters");
        System.out.println(Dimes + " Dimes");
        System.out.println(Nickels + " Nickels");
        System.out.println(IntAmount + " Pennies");
        System.out.println();

        //Bonus bit, converting USD to EURO

        Scanner ConvertToEuro = new Scanner(System.in); //  Yes/No scanner

        //Capturing the answer to our printed Question
        System.out.println("Would you like to convert the USD to Euro?");
        String answer = ConvertToEuro.nextLine();

        //If answer is yes
        if (answer.equals("yes") || answer.equals("Yes") || answer.equals("Y") || answer.equals("y")){
            Double Euro = TotalAmount * 0.92; //Conversion amount as of 1/23
            String Euros = Euro.toString(); //Converting to string
            Euros = Euros.substring(0, 4);//Truncating String
            System.out.println(Euros);
        }
    }
}