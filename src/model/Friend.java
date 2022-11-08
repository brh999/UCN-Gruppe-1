package model;

public class Friend {
	private String name;
	private String address;
	private String postal;
	private String city;
	private String phone;
	
	public Friend(String name, String address, String postal, String city, String phone) {
		this.name = name;
		this.address = address;
		this.postal = postal;
		this.city = city;
		this.phone = phone;
	}
	
	public String getPhone() {
		return phone;
	}
	
}
