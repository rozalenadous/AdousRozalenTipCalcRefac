public class TipCalc {

    // instance variables
private int numPeople;
private int tipPercentage;
private double totalBillBeforeTip;

    // constructor
public TipCalc (int numPeople, int tipPercentage){
this.numPeople = numPeople;
this.tipPercentage = tipPercentage;
totalBillBeforeTip = 0.0;
}
 // getters/methods
public double getTotalBillBeforeTip(){
    return totalBillBeforeTip;
}

public int getTipPercentage(){
    return tipPercentage;
}
public void addMeal(double cost){
    totalBillBeforeTip += cost;
}
public double tipAmount(){
return (double)tipPercentage/100*totalBillBeforeTip;
}

public double totalBill(){
    return tipAmount()+totalBillBeforeTip;
}
public double perPersonCostBeforeTip(){
   return totalBillBeforeTip / numPeople;
}
public double perPersonTipAmount(){
    return tipAmount()/numPeople;
}
public double perPersonTotalCost(){
    return totalBill()/numPeople;
}
}

