import java.util.Scanner;
public class TipCalcRunner {
    public static void main(String [] args) {
        // welcome screen
        Scanner scan = new Scanner (System.in);
        System.out.println("Hello, welcome to the tip calculator!");

        // user imputed variables
        System.out.println("Please input the bill (only numbers)");
        double bill = scan.nextDouble();
        scan.nextLine();
        System.out.println();
        System.out.println("Please input the number of people in the party.");
        int numPeople = scan.nextInt();
        System.out.println();
        System.out.println("Please input the percent you want to tip (only whole numbers)");
        int tipPercentage = scan.nextInt();
        System.out.println();

TipCalc newTip = new TipCalc(numPeople, tipPercentage);
newTip.addMeal(bill);
System.out.println("-----------------------------");
        // calculation print statements
      System.out.println("The total bill before tip is: $" + String.format("%.2f", newTip.getTotalBillBeforeTip()));
       System.out.println("The tip percentage is: " + newTip.getTipPercentage());
        System.out.println("The total tip is: $" + String.format("%.2f", newTip.tipAmount()));
        System.out.println("The tip per person is: $" +  String.format("%.2f", newTip.perPersonTipAmount()));
        System.out.println("The cost per person before tip is: $" + String.format("%.2f", newTip.perPersonCostBeforeTip()));
        System.out.println("The total bill including the tip is: $" + String.format("%.2f", newTip.totalBill()));
       System.out.println("The total per person (including tip and bill) is: $" + String.format("%.2f", newTip.perPersonTotalCost()));

// exit screen
        System.out.println("Thank you for using the tip calculator, see you next time!");

    }
}
