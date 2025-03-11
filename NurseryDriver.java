public class NurseryDriver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //get supplier details
        System.out.println("What is the supplier id?");
        int supplierID = scan.nextInt();
        //scanner problem
        scan.nextLine(); 

        System.out.println("What is the supplier's name?");
        String companyName = scan.nextLine();

        System.out.println("What is the supplier's phone number?");
        String phone = scan.nextLine();

        //create Supplier instance
        Supplier supplier = new Supplier(supplierID, companyName, phone);

        //get the number of items
        System.out.println("Let's get the items from this supplier. How many are there?");
        int numItems = scan.nextInt();
        scan.nextLine();

        //process each inventory item
        for (int i = 1; i <= numItems; i++) {
            System.out.println("What is the nursery item's name for item # " + i);
            String itemName = scan.nextLine();

            System.out.println("How many are in stock?");
            int numInStock = scan.nextInt();

            System.out.println("How much does each cost?");
            double priceEach = scan.nextDouble();
            scan.nextLine(); 

            //call inventory constructor from inventory class
            Inventory item = new Inventory(itemName, numInStock, priceEach, supplier);

            //print item
            System.out.println(item);
        }

        scan.close();
    }
}
