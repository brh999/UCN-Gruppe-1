package model;

/**
 * This class is Friend i.e. creates a Friend.
 * 
 * @author Alex
 * @author Rasmus
 * @author Kasper
 * @author Danny
 *
 * @date 10/11/2022
 */

public class Friend {
	private String name;
	private String address;
	private String postal;
	private String city;
	private String phone;

	/**
 	* This methode creates a Friend with:
 	* @param name
 	* @param address
 	* @param postal
 	* @param city
 	* @param phone
 	*/

	public Friend(String name, String address, String postal, String city, String phone) {
		this.name = name;
		this.address = address;
		this.postal = postal;
		this.city = city;
		this.phone = phone;
	}

	/**
	 * This methos returns phone from a friend
	 * @return phone
	 */

	public String getPhone() {
		return phone;
	}

	/**
	 * This methos returns name
	 * @return name
	 */

	public String getName() {
		return name;
	}

}
