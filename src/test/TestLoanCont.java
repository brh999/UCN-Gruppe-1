package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ctrl.LoanCtrl;
import model.Friend;
import model.FriendCont;
import model.LP;
import model.LPCont;
import model.LoanCont;

class TestLoanCont {

	private LoanCont lc;
	private FriendCont fc;
	private LPCont lpc;
	@BeforeEach
	void setUp() throws Exception {
		
		lc = LoanCont.getInstance();
		fc = FriendCont.getInstance();
		lpc = LPCont.getInstance();
		
		fc.addFriend(new Friend("Joe", "Joe street", "9200", "Joee City", "1234"));
		fc.addFriend(new Friend("Jane", "Jane street", "9200", "Joee City", "4321"));
	
		LP lp1 = new LP(12345, "Joe's song", "Bananna Joe", "20/2/2002");
		LP lp2 = new LP(12345, "Jane's song", "Jane Himmerland", "24/12/1882");

		lpc.addLP(lp1);
		lpc.addLP(lp2);
		
		lp1.createCopy("1/1/1", "200");
		lp1.createCopy("1/1/1", "123");
		lp2.createCopy("1/1/1", "412");
		lp2.createCopy("1/1/1", "512");
		lp2.createCopy("1/1/1", "222");
	}

	@Test
	void testSingletonOnLoanCont() {
		//Arrange
		LoanCont lc1 = LoanCont.getInstance();
		//Act
		//Assert
		assertSame(lc, lc1);
	}
	
	@Test
	void testFindFirstAvailableCopy() {
		//Arrange
		
		//Act
		//Assert
	}

}
