package tui;

import model.Friend;
import model.FriendCont;
import model.LP;
import model.LPCont;

public class TryMe {
	public static void main(String[] args) {
		writeTestData();
		MainMenuUi ui = new MainMenuUi();
		ui.start();
	}

	public static void writeTestData() {
		FriendCont fc = FriendCont.getInstance();
		fc.addFriend(new Friend("Joe", "Joe street", "9200", "Joee City", "1234"));
		fc.addFriend(new Friend("Jane", "Jane street", "9200", "Joee City", "4321"));
		fc.addFriend(new Friend("Billy", "Billy street", "9200", "Joee City", "1122"));

		LPCont lpc = LPCont.getInstance();
		LP lp1 = new LP(12345, "Joe's song", "Bananna Joe", "20/2/2002");
		LP lp2 = new LP(12345, "Jane's song", "Jane Himmerland", "24/12/1882");
		LP lp3 = new LP(12345, "Billy's Anthem", "Billy Bob", "11/9/2001");

		lpc.addLP(lp1);
		lpc.addLP(lp2);
		lpc.addLP(lp3);

		lp1.createCopy("1/1/1", "200");
		lp1.createCopy("1/1/1", "123");
		lp2.createCopy("1/1/1", "412");
		lp2.createCopy("1/1/1", "512");
		lp2.createCopy("1/1/1", "222");
		lp3.createCopy("1/1/1", "999");

	}
}
