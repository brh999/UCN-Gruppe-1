package model;

import java.util.ArrayList;

public class LP {

	private int barcode;
	private String title;
	private String artist;
	private String publicationDate;
	private ArrayList<Copy> copies;
	
	
	public LP(int barcode, String title, String artist, String publicationDate) {
		this.barcode = barcode;
		this.title = title;
		this.artist = artist;
		this.publicationDate = publicationDate;
	}

	
	public void createCopy(String purchaseDate, String purchasePrice) {
		Copy c = new Copy(purchaseDate, purchasePrice);
		addMember(c);
	}
	
	private void addMember(Copy c) {
		copies.add(c);
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}
	
	public ArrayList<Copy> getCopies(){
		return copies;
	}
	
}
