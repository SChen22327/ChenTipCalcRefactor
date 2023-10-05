public class TipCalculator {
    private int numPeople;
    private double tipPercentage;
    private double totalBillBeforeTip = 0;

    public TipCalculator(int numPeople, double tipPercentage) {
        this.numPeople = numPeople;
        if (tipPercentage / (int) tipPercentage > 1) {
            this.tipPercentage = tipPercentage;
        } else {
            this.tipPercentage = (int) tipPercentage;
        }
    }
    public void addMeal(double cost) {
        totalBillBeforeTip += cost;
    }
    public double returnRoundedToTwo(double num) {
        double tempNum = Math.round(num * 100) / 100.0;
        return tempNum;
    }
    public double getTotalBillBeforeTip() {
        return totalBillBeforeTip;
    }

    public double getTipPercentage() {
        return tipPercentage;
    }

    public double tipAmount() {
        return (tipPercentage / 100.0 ) * totalBillBeforeTip;
    }

    public double totalBill() {
        return totalBillBeforeTip + tipAmount();
    }

    public double perPersonCostBeforeTip() {
        return Math.round(totalBillBeforeTip * 100.0 / numPeople) / 100.0;
    }

    public double perPersonTipAmount() {
        return Math.round(tipAmount() * 100.0 / numPeople) / 100.0;
    }

    public double perPersonTotalCost() {
        return Math.round(totalBill() * 100.0 / numPeople) / 100.0;
    }

}
