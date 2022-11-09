package ctrl;

import model.FriendCont;
import model.Friend;

public class FriendCtrl {

	public static Friend findFriendByPhone(String phone) {
		return FriendCont.findFriendByPhone(phone);
	}
}
