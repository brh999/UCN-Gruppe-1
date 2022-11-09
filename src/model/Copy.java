package model;

public class Copy {

	private int serialNumber;
	private String purchaseDate;
	private String purchasePrice;
	private static int serialNumbersInTotal = 0;

	public Copy(String purchaseDate, String purchasePrice) {
		this.purchaseDate = purchaseDate;
		this.purchasePrice = purchasePrice;
		serialNumber = generateSerialNumber();
	}

	private int generateSerialNumber() {
		serialNumbersInTotal++;
		return serialNumbersInTotal;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

}
