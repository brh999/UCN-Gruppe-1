package model;

/**
 * 
 * @author Alex
 * @author Rasmus
 * @author Danny
 * @author Kasper
 * @version 11/10-2022
 */

public class Copy {

	private int serialNumber;
	private String purchaseDate;
	private String purchasePrice;
	private static int serialNumbersInTotal = 0;

	/**
	 * Constructor for objects of class Copy
	 * 
	 * @param purchaseDate  the purchaseDate of this LP
	 * @param purchasePrice the purchasePrice of this LP
	 */
	public Copy(String purchaseDate, String purchasePrice) {
		this.purchaseDate = purchaseDate;
		this.purchasePrice = purchasePrice;
		serialNumber = generateSerialNumber();
	}

	/**
	 * Increments the serial number of the Copy class
	 * 
	 * @return the serialNumbersInTotal variable
	 */
	private int generateSerialNumber() {
		serialNumbersInTotal++;
		return serialNumbersInTotal;
	}

	/**
	 * Returns the serialNumber of this Copy
	 * 
	 * @return the serialNumber of this Copy
	 */
	public int getSerialNumber() {
		return serialNumber;
	}

}
