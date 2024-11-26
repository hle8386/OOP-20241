package dvd.aims;

public class Cart {
	private int qtyOrdered = 0;
	public static final int MAX_NUMBER_OF_ORDER = 20;
	private DigitalVideoDisc itemsOrdered [] = 
			new DigitalVideoDisc [MAX_NUMBER_OF_ORDER];

	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered < MAX_NUMBER_OF_ORDER) 
		{
			itemsOrdered[qtyOrdered] = disc;
	        qtyOrdered+=1;
	        System.out.println("The DVD is added to the cart.");
		} 
	    else 
	    {
	        System.out.println("The cart is full.");
	    }
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].equals(disc)) {
				for (int j = i; i < qtyOrdered - 1; j++) {
					itemsOrdered[j] = itemsOrdered[j+1];
				}
				itemsOrdered[qtyOrdered-1] = null;
				qtyOrdered -= 1;
				System.out.println("The DVD is removed");
				return;
			}
		}
		System.out.println("Cannot find the disc");
	}
	public float totalCost() {
		float totalCost = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			totalCost += itemsOrdered[i].getCost();
		}
		return totalCost;
	}
}
