import java.util.Scanner;

public class WidgetDriver {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Widget w1 = new Widget();
		System.out.println(w1.toString());

		System.out.println("Create a new widget. How many in stock?");

		int num = scan.nextInt();
		System.out.println("What is the reorder level?");
		int reorder = scan.nextInt();
		System.out.println("How much does each cost?");
		double cost = scan.nextDouble();
		Widget w2 = new Widget(num, cost, reorder);
		System.out.println(w2.toString());
		
		w1.setCostEach(7.50);
		w1.setNumInStock(100);
		w1.setReorder(75);

		Widget[] widgets = new Widget[2];
		widgets[0] = w1;
		widgets[1] = w2;

		printAll(widgets);
		
		System.out.println(find(100,widgets));
		System.out.println(find(104,widgets));
		
		scan.close();
	}

	public static void printAll(Widget[] w) {
		for (int i = 0; i < w.length; i++)
			System.out.println(w[i].toString());
	}

	public static String find(int num, Widget[] w) {
		boolean found = false;
		int location = 0;
		String output = " ";
		while (!found && location < w.length) {
			if (w[location].getId() == num) {
				found = true;
				output = w[location].toString();
			} else
				location++;
		}
		if (!found)
			output = "The widget does not exist";
		return output;
	}
}
