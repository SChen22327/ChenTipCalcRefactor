public class TipCalculator {
    private int numPeople;
    private double tipPercentage;
    private double totalBillBeforeTip = 0;

    public TipCalculator(int numPeople, double tipPercentage) {
        this.numPeople = numPeople;
        this.tipPercentage = tipPercentage;
    }

    public void addMeal(double cost) {
        totalBillBeforeTip += cost;
    }

    public double getTotalBillBeforeTip() {
        return totalBillBeforeTip;
    }


}
