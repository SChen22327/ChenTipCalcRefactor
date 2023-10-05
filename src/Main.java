import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double itemCost = 0;
        double totalBill;
        double tip;

        System.out.print("Welcome to the tip calculator!\nHow many people are in your group? ");
        int numPeople = scan.nextInt();
        scan.nextLine();
        System.out.print("How much are you tipping our \033[3mfine\033[0m waiters?\nPlease tell me the percent: ");
        double tipPercentage = scan.nextDouble();

        TipCalculator tc = new TipCalculator(numPeople, tipPercentage);

        while (itemCost != -1) {
            System.out.print("The cost of the item in dollars and cents(enter -1 to end): ");
            itemCost = scan.nextDouble();
            if (itemCost == -1) {
                break;
            }
            tc.addMeal(itemCost);
        }
        totalBill = tc.returnRoundedToTwo(tc.getTotalBillBeforeTip());
        System.out.println("The bill before tips is $" + String.format("%.2f", totalBill));
        System.out.println("The tip percentage is " + tc.getTipPercentage() + "%");
        tip = tc.returnRoundedToTwo(tc.tipAmount());
        System.out.println("The total amount of tip is " + String.format("%.2f", tip));
        System.out.println("The total bill including tips is " + String.format("%.2f", totalBill + tip));
    }
}
