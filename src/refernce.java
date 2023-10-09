public class refernce {


    /*
    import java.util.Scanner;
public class Unit_1_Project {
    public static void main(String[] args){
        //This welcomes the user and asks the user the amount of people in the group and the amount you will tip
        Scanner scan = new Scanner(System.in);
        boolean repT = true;
        System.out.println("Hello to the tip calculator!");
        System.out.print("How many people are in your group?: ");
        double people = scan.nextDouble();
        System.out.print("How much would you like to tip from (0 - 100): ");
        double tip = scan.nextDouble();

        double price = 0;
        double number;

        //This part asks and adds the values of the cost
        while(repT) {
            System.out.print("What is the price of the item?: ");
            number = scan.nextDouble();
            if (number != -1) {
                price += number;
            } else {
                repT = false;
            }
        }

        //Everything below helps simplies and round the varables needed to be printed
        double totalCost = price*((tip/100)+1);
        // this simpflies the values to print
        double totalTip = totalCost-price;
        double perPersonBTip = price/people;
        double tipPerPerson =(totalCost-price)/people;
        double totalCostPerPerson = (totalCost/people);

        //rounds the values
        totalCost = ((double)Math.round((totalCost*100)))/100;
        totalTip = ((double)Math.round((totalTip*100)))/100;
        perPersonBTip = ((double)Math.round((perPersonBTip*100)))/100;
        tipPerPerson = ((double)Math.round((tipPerPerson*100)))/100;
        totalCostPerPerson = ((double)Math.round((totalCostPerPerson*100)))/100;





        //this prints all the values
        System.out.println("Total bill before tip :$" + price);
        System.out.println("Total percentage :" + (int) tip + "%");
        System.out.println("Total tip :$" + totalTip);
        System.out.println("Total bill with tip:$" + totalCost );
        System.out.println("Per person cost before tip:$" + perPersonBTip);
        System.out.println("Tip per person:$" + tipPerPerson);
        System.out.println("Total cost per person:$" + totalCostPerPerson);
        scan.nextLine();
        //This part asks the user if you liked the food
        System.out.print("Did you like your food Y/N : ");
        String liked= scan.nextLine();
        //This part responds to the input (by checking if the input is equal to a certian String using if or else) and prints one of the print statments
        if (liked.equals("Y")){
            System.out.println("Thanks for your feedback, we are happy you enjoyed. Hope to see you next time!!!");
        }
        else{
            System.out.println("Thanks for your feedback, we will try to improve next time. Hope to see you next time!!!");

        }

    }
}
     */
}
