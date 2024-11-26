package dvd.aims;

public class Aims {
		public static void main(String[] args) {
			Cart hleOrder = new Cart();

			// Create new DVD objects and add them to the cart
			DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
			hleOrder.addDigitalVideoDisc(dvd1);
			
			DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
			hleOrder.addDigitalVideoDisc(dvd2);
			
			DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
			hleOrder.addDigitalVideoDisc(dvd3);

			System.out.println("Total cost is: " + hleOrder.totalCost() + "$");
	    }
	}
