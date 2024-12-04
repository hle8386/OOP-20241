package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {

	//constructors
	public DigitalVideoDisc(String title) {
		super();
		this.setTitle(title);
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.setTitle(title);
		this.setCategory(category);
		this.setCost(cost);
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.setTitle(title);
		this.setCategory(category);
		this.setDirector(director);
		this.setCost(cost);
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.setTitle(title);
		this.setCategory(category);
		this.setDirector(director);
		this.setLength(length);
		this.setCost(cost);
	}

	public String toString() {
		return "DVD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + Integer.toString(this.getLength()) + " - " + Float.toString(this.getCost()) + "$";
	}

	// Play method
	@Override
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
}
