public class Inventory {
	
	NumberFormat nf = NumberFormat.getCurrencyInstance();

	   
	//instance variables
	private int inventoryID;
    private String itemName;
    private int numInStock;
    private double priceEach;
    private Supplier Supplier;
    private static int nextNum = 1000; //static variable to start inventory ID at 1000,

    //arg constructor
    public Inventory() {
    	inventoryID = nextNum;
        nextNum = nextNum + 1; 
    }
    

    //full constructor
    public Inventory(String i, int n, double p, Supplier s) {
        itemName = i;
        numInStock = n;
        priceEach = p;
        inventoryID = nextNum;
        nextNum = nextNum + 1; 
        Supplier = s;
    }
    
 // Calculate total value
    public double totalValue() {
        return numInStock * priceEach;
    }
    
    public String toString() {
        return itemName + " with id of " + inventoryID + " has " + numInStock + 
               " in stock with a price each of " + nf.format(priceEach) + 
               " and a total value of " + nf.format(totalValue()) + ".\n" + Supplier.toString();
    }
    
    //getters and setters
    public int getInventoryID() {
        return inventoryID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getNumInStock() {
        return numInStock;
    }

    public void setNumInStock(int numInStock) {
        this.numInStock = numInStock;
    }

    public double getPriceEach() {
        return priceEach;
    }

    public void setPriceEach(double priceEach) {
        this.priceEach = priceEach;
    }
    
}
