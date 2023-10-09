import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello to the tip calculator!");
        System.out.print("How many people are in your group?: ");
        int people = scan.nextInt();
        System.out.print("How much would you like to tip from (0 - 100): ");
        double tip = scan.nextDouble();
        TipCalculator tipCalc = new TipCalculator(tip, people);
        double cost = 0;
        boolean replit = true;
        while (replit){
            System.out.print("What is the price of the item?: ");
            cost = scan.nextDouble();
            if (cost == -1){
                replit = false;
            }
            else {
                tipCalc.addMeal(cost);
            }
        }
        System.out.println("Total Bill Before Tip: " + tipCalc.getTotalBillBeforeTip());
        System.out.println("Total Percentage: " + (int)tip);
        System.out.println("Total Tip: " + tipCalc.tipAmount());
        System.out.println("Total Bill With Tip: " + tipCalc.totalBill());
        System.out.println("Per Person Cost Before Tip: " + tipCalc.perPersonCostBeforeTip());
        System.out.println("Tip Per Person: " + tipCalc.perPersonTipAmount());
        System.out.println("Total Cost Per Person: "+ tipCalc.perPersonTotalCost());

    }

}