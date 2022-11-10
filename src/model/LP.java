package model;

import java.util.ArrayList;

/**
 * 
 * @author Alex
 * @author Rasmus
 * @author Danny
 * @author Kasper
 * @version 11/10-2022
 */

public class LP {

	private int barcode;
	private String title;
	private String artist;
	private String publicationDate;
	private ArrayList<Copy> copies;

	/**
	 * Constructor for the objects of class LP
	 * 
	 * @param barcode         the barcode of this LP
	 * @param title           the title of this LP
	 * @param artist          the artist of this LP
	 * @param publicationDate the publicationDate of this LP
	 */
	public LP(int barcode, String title, String artist, String publicationDate) {
		this.barcode = barcode;
		this.title = title;
		this.artist = artist;
		this.publicationDate = publicationDate;
		copies = new ArrayList<>();
	}

	/**
	 * Creates new Copy with specified purchaseDate and purchasePrice and then adds
	 * the new Copy object to the ArrayList of this LP // TODO bedre formulering
	 * 
	 * @param purchaseDate  purchaseDate of the new Copy to be created
	 * @param purchasePrice purchasePrice of the new Copy to be created
	 */
	public void createCopy(String purchaseDate, String purchasePrice) {
		Copy c = new Copy(purchaseDate, purchasePrice);
		addCopy(c);
	}

	/**
	 * Adds the specified Copy object to the ArrayList of this LP
	 * 
	 * @param c Copy object to be added
	 */
	private void addCopy(Copy c) {
		copies.add(c);
		c.setLP(this);
	}

	/**
	 * Returns the title of this LP
	 * 
	 * @return the title of this LP
	 */
	public String getTitle() {
		return title;
	}


	/**
	 * Returns the ArrayList of Copy objects from this LP // TODO er det en ny
	 * ArrayList eller en memory reference?
	 * 
	 * @return ArrayList of Copy objects from this LP
	 */
	public ArrayList<Copy> getCopies() {
		return copies;
	}

}
