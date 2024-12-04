package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc extends Disc implements Playable {

	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}
	
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}

	public String toString() {
	    return "DVD - " + title + " - " + category + " - " + director + 
	           " - " + length + " - " + cost + "$";
	}

	// Play method
	@Override
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
}
