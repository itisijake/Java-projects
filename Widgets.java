public class Widget {

	private int id;
	private int numInStock;
	private double costEach;
	private int reorder;

	private static int nextId = 100;

	public Widget() {
		id = nextId;
		nextId++;
	}

	public Widget(int n, double c, int r) {
		numInStock = n;
		costEach = c;
		reorder = r;
		id = nextId;
		nextId++;
	}

	public String toString() {
		return "There are " + numInStock + " widgets with an id of " + id + " which cost " + costEach
				+ " each. The reorder level is " + reorder;
	}

	public boolean equals(Widget w) {
		if (this.getId() == w.getId())
			return true;
		else
			return false;
	}

	public boolean belowLevel() {
		if (numInStock < reorder)
			return true;
		else
			return false;
	}

	public double discount(int numBought, double percent) {
		double cost;
		if (numBought > 100)
			cost = numBought * costEach * ((100 - percent) / 100);
		else
			cost = numBought * costEach;
		return cost;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumInStock() {
		return numInStock;
	}

	public void setNumInStock(int numInStock) {
		this.numInStock = numInStock;
	}

	public double getCostEach() {
		return costEach;
	}

	public void setCostEach(double costEach) {
		this.costEach = costEach;
	}

	public int getReorder() {
		return reorder;
	}

	public void setReorder(int reorder) {
		this.reorder = reorder;
	}

}
