package model;
import java.util.*;

public class FriendCont {
	
	private static FriendCont instance;
	private static ArrayList<Friend> friends;
	
	public FriendCont() {
		if(instance == null) {
			instance = new FriendCont();
			instance.friends = new ArrayList<>();
		}
	}
	
	public static Friend findFriendByPhone(String phone) {
		Friend res = null;
		for(Friend f : friends) {
			if(f.getPhone().equals(res)) {
				res = f;
			}
		}
		if(res == null) {
			System.out.println("No friend found with phone: " + phone);
		}
		return res;
	}
	
}
