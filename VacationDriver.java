import java.util.Scanner;

public class VacationDriver {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		//ask for the number of vacations and read it into numVacations
		System.out.println("How many vacations are there?");
		int numVacations = input.nextInt();

		//ask for the number of salespeople and read it into numPeople
		System.out.println("How many sales people are there?");
		int numPeople = input.nextInt();
		input.nextLine(); // Consume the newline

		//beginning of loop for number of vacations
		for (int i = 0; i < numVacations; i++) {
			
			//ask for the name and price and read these into variables
			System.out.print("What is the name of vacation #" + (i + 1) + "?\n");
			String vacationName = input.nextLine();

			System.out.println("How much does " + vacationName + " cost?");
			double priceEach = input.nextDouble();
			input.nextLine(); 

			//create a Vacation instance using the data obtained above
			Vacation vacation = new Vacation(vacationName, priceEach);

			//loop through the salespeople
			for (int j = 0; j < numPeople; j++) {
				System.out.println("How many vacations were made in by person #" + (j + 1) + " for " + vacationName + "?");
				int sales = input.nextInt();
				input.nextLine(); // Consume the newline

				//call updateSales with this number
				vacation.updateSales(sales);
			}//end of inner loop

			//print out this vacation info
			System.out.println(vacation);
		}//end of outer for loop

		System.out.println("Thank you for using the Vacation selling program!");
		input.close();
	}//end of main
}
