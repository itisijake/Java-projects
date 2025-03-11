public class Paint {
	
	//main method
    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
    	DecimalFormat df = new DecimalFormat("##.##");
		NumberFormat nf = NumberFormat.getCurrencyInstance();
        
		//get total number of rooms
        System.out.println("How many rooms to paint?");
        int rooms = input.nextInt();
        
        //initialize the total square footage for the rooms 
        double totalSquareFootage = 0;
        
        //for loop to run for each room to get the square footage of each 
        for (int i = 1; i <= rooms; i++) {
            System.out.println("How many square feet in room # " + i + "?");
            totalSquareFootage = totalSquareFootage + input.nextDouble();
        }
        
        //get the cost per gallon
        System.out.println("What is the cost per gallon?");
        double paintPrice = input.nextDouble();
        
        //call each of the methods 
        double gallonsNeeded = getGallons(totalSquareFootage);
        double hoursRequired = getHours(totalSquareFootage);
        double paintCost = getPaintCost(gallonsNeeded, paintPrice);
        double laborCost = getLaborCost(hoursRequired);
        double totalCost = totalCost(paintCost, laborCost);
        
        //final output 
        System.out.println("The paint job has a total square footage of " + df.format(totalSquareFootage) + 
        		" which takes " + df.format(gallonsNeeded)+ " gallons of paint");
        System.out.println("and will take " + df.format(hoursRequired) + " hours to paint.");
        System.out.println("The total cost of the job will be " + nf.format(totalCost));
        
        input.close();
    }

    
    //static methods, return calculations for hours, gallons of paint, and total costs. 
    public static double getPaintCost(double gallons, double pricePerGallon) {
        return gallons * pricePerGallon;
    }
    
    public static double getGallons(double squareFeet) {
        return squareFeet / 115;
    }
    
    public static double getHours(double squareFeet) {
        return (squareFeet / 115) * 8;
    }
    
  
    public static double getLaborCost(double hours) {
        return hours * 18.00;
    }
    
    public static double totalCost(double paintCost, double laborCost) {
        return paintCost + laborCost;
    }
}
