public class TipCalculator {
    private int numPeople;
    private double tipPercentage;
    private double totalBillBeforeTip;

    public TipCalculator(double tipPercentage, int numPeople){
        this.tipPercentage=tipPercentage;
        this.numPeople=numPeople;
        this.totalBillBeforeTip = 0.0;
    }
    public double getTotalBillBeforeTip (){
        return totalBillBeforeTip ;
    }
    public double getTipPercentage (){
        return tipPercentage;
    }
    public void addMeal(double cost){
        totalBillBeforeTip +=cost;
    }
    public double tipAmount(){
        double tipAmount = (double)totalBillBeforeTip * (double)(tipPercentage/100);
        tipAmount = ((double)Math.round((tipAmount*100)))/100;
        return tipAmount;
    }
    public double totalBill(){
        double totalBill = (double)totalBillBeforeTip + (double)tipAmount();
        totalBill = ((double)Math.round((totalBill*100)))/100;
        return totalBill;
    }
    public double perPersonCostBeforeTip(){
        double perPersonCostBeforeTip = (double)totalBillBeforeTip / (double)numPeople;
        perPersonCostBeforeTip = ((double)Math.round((perPersonCostBeforeTip*100)))/100;
        return perPersonCostBeforeTip;
    }
    public double perPersonTipAmount(){
        double perPersonTipAmount =  (double)tipAmount() / (double)numPeople;
        perPersonTipAmount = ((double)Math.round((perPersonTipAmount*100)))/100;
        return perPersonTipAmount;
    }
    public double perPersonTotalCost(){
        double perPersonTotalCost =  (double)totalBill() / (double)numPeople;
        perPersonTotalCost = ((double)Math.round((perPersonTotalCost*100)))/100;
        return perPersonTotalCost;
    }




}


