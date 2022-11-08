package model;

import java.util.*;

public class FriendCont {

	private static FriendCont instance;
	private static ArrayList<Friend> friends;

	public static FriendCont getInstance() {
		if (instance == null) {
			instance = new FriendCont();
		}
		return instance;
	}

	private FriendCont() {
		friends = new ArrayList<>();
	}

	public static Friend findFriendByPhone(String phone) {
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

}
