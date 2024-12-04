package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.media.Media;
import java.util.*;

public class Cart {
	public static final int MAX_NUMBER_OF_ORDER = 20;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    public void addMedia(Media media) {
        if (itemsOrdered.size() < MAX_NUMBER_OF_ORDER) {
            itemsOrdered.add(media);
            System.out.println("Added");
        } else {
            System.out.println("The cart is full.");
        }
    }
	
	public void addMedia(Media[] mediaList) {
		for (Media media : mediaList) {
			addMedia(media);
		}
	}
	
	public void removeMedia(Media media) {
		if (!itemsOrdered.contains(media)) {
			System.out.println("Item " + media.getTitle() + " not found in the cart.");
		} else {
			itemsOrdered.remove(media);
			System.out.println("Item " + media.getTitle() + " has been removed from the cart.");
		}
	}
	public void removeMedia(Media[] mediaList) {
		for (Media media : mediaList) {
			this.removeMedia(media);
		}
	}

	public float totalCost() {
		float totalCost = 0;
		for (Media media : itemsOrdered) {
			totalCost += media.getCost();
		}
		return totalCost;
	}
	
	public void searchByID(int searchID) {
		for (Media media : itemsOrdered) {
			if (media.getId() == searchID) {
				System.out.println("Found DVD: " + media.getTitle());
				return;
			}
		}
		System.out.println("No results found.");
	}
	
	public void searchByTitle(String searchTitle) {
		ArrayList<Media> searchResults = new ArrayList<>();
		for (Media media : itemsOrdered) {
			if (media.isMatch(searchTitle)) {
				searchResults.add(media);
			}
		}
		if (searchResults.isEmpty()) {
			System.out.println("No results found.");
		} else {
			System.out.println("Search results: ");
			for (Media media : searchResults) {
				System.out.println("- " + media.getTitle());
			}
		}
	}
	
    public void detailDisplayCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < itemsOrdered.size(); i++) {
            System.out.println((i + 1) + ". " + itemsOrdered.get(i).toString());
        }
        System.out.println("Total cost: " + totalCost() + "$");
        System.out.println("***************************************************");
    }

	public void sortMediabyTitle() {
		itemsOrdered.sort(Media.COMPARE_BY_TITLE_COST);
		System.out.println("Cart sorted by title.");
	}

	public void sortMediabyCost() {
		itemsOrdered.sort(Media.COMPARE_BY_COST_TITLE);
		System.out.println("Cart sorted by cost.");
	}
}
