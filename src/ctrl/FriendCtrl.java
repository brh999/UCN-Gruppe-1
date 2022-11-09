package ctrl;

import model.FriendCont;
import ctrl.*;
import model.Friend;

/**
 * 
 * @author Alex, Rasmus, Kasper, Dani (Gruppe 1)
 *
 */

public class FriendCtrl {

	/** Find friend by phone number
	 * 
	 * @param phone Phone number to search friend by
	 * @return Friend
	 */
	public Friend findFriendByPhone(String phone) {
		return FriendCont.getInstance().findFriendByPhone(phone);
	}
	
	
}
