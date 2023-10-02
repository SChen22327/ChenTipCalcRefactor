import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double itemCost = 0;

        System.out.print("Welcome to the tip calculator!\nHow many people are in your group? ");
        int numPeople = scan.nextInt();
        scan.nextLine();
        System.out.print("How much are you tipping our \033[3mfine\033[0m waiters?\nPlease tell me the percent: ");
        double tipPercentage = scan.nextDouble();

        TipCalculator tc = new TipCalculator(numPeople, tipPercentage);

        while (itemCost != -1) {
            System.out.print("The cost of the item in dollars and cents(enter -1 to end): ");
            itemCost = scan.nextDouble();
            tc.addMeal(itemCost);
        }

        System.out.println("The bill before tips is $" + tc.getTotalBillBeforeTip());
        System.out.println("The tip percentage is " + tc.getTipPercentage() + "%");
        System.out.println("The amount of tip is " + tc.tipAmount());
    }
}
