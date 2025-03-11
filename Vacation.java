import java.text.*;

public class Vacation {
	
    //instance variables
    private String vacationName;
    private int numSold;
    private double priceEach;

    //no arg constructor 
    public Vacation() {
    }
    
    
    //constructor with two parameters
    public Vacation(String v, double p) {
        vacationName = v;
        priceEach = p;
        numSold = 0;
    }

    //method to update sales
    public void updateSales(int additionalSales) {
        numSold = numSold + additionalSales;
    }

    //method to caluculate the total value 
    public double totalValue() {
        return numSold * priceEach;
    }

    //toString
    public String toString() {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        return numSold + " trips to \"" + vacationName + "\" were sold for " + nf.format(priceEach) +
               " each, for a total of " + nf.format(totalValue());
    }

    //getters and setters
    public String getVacationName() {
        return vacationName;
    }

    public void setVacationName(String vacationName) {
        this.vacationName = vacationName;
    }

    public int getNumSold() {
        return numSold;
    }

    public void setNumSold(int numSold) {
        this.numSold = numSold;
    }

    public double getPriceEach() {
        return priceEach;
    }

    public void setPriceEach(double priceEach) {
        this.priceEach = priceEach;
    }

}
