package model;

public class Copy {

	private int serialNumber;
	private String purchaseDate;
	private String purchasePrice;

	public Copy(String purchaseDate, String purchasePrice) {
		this.purchaseDate = purchaseDate;
		this.purchasePrice = purchasePrice;
		serialNumber = generateSerialNumber();
	}

	private int generateSerialNumber() {
		return 10; // TODO generateSerialNumbers
	}

	public int getSerialNumber() {
		return serialNumber;
	}

}
