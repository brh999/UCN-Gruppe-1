package model;

import java.util.*;

/**
 * This class is the container for Friend objects.
 * 
 * @author Alex
 * @author Rasmus
 * @author Kasper
 * @author Danny
 *
 * @date 10/11/2022
 */
public class FriendCont {

	private static FriendCont instance;
	private ArrayList<Friend> friends;

	/**
	 * This method creates a ArrayList of Friend objects as a singleton.
	 * 
	 * @return instance of FriendCont
	 */
	public static FriendCont getInstance() {
		if (instance == null) {
			instance = new FriendCont();
		}
		return instance;
	}

	/**
	 * This is the constructor for the FriendCont and creates an instance of friends
	 */
	private FriendCont() {
		friends = new ArrayList<>();
	}

	/**
	 * This method finds a Friend object from by searching for phone number
	 * 
	 * @param phone number of specific Friend
	 * @return Friend object with associated phone number
	 */
	public Friend findFriendByPhone(String phone) {
		Friend res = null;
		for (int i = 0; i < friends.size(); i++) {
			if (friends.get(i).getPhone().equals(phone)) {
				res = friends.get(i);
			}
		}
		if (res == null) {
			System.out.println("No friend found with phone: " + phone);
		}
		return res;
	}

	/**
	 * This method adds a Friend object to the ArrayList of friends
	 * 
	 * @param f should be a Friend object
	 */
	public void addFriend(Friend f) {
		friends.add(f);
	}

}
