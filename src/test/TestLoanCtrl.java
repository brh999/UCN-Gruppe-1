package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ctrl.LoanCtrl;
import model.*;

class TestLoanCtrl {

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
		// Arrange
		LoanCont lc1 = LoanCont.getInstance();
		// Act
		// Assert
		assertSame(lc, lc1);
	}

	@Test
	void testFindFirstAvailableCopy() {
		// Arrange
		LoanCtrl lctrl = new LoanCtrl();
		lctrl.createLoan(30);
		lctrl.findFriendByPhone("1234");
		lctrl.findAvailableCopyByTitle("Joe's song");
		lctrl.confirmLoan();

		Loan l1 = lctrl.getcLoan();

		lctrl.createLoan(30);
		lctrl.findFriendByPhone("1234");
		lctrl.findAvailableCopyByTitle("Joe's song");
		lctrl.confirmLoan();

		Loan l2 = lctrl.getcLoan();

		// Act

		// Assert
		assertNotSame(l1.getCopy(), l2.getCopy());

	}

	@Test
	void testNoAvailableCopy() {
		// Arrange
		LoanCtrl lctrl = new LoanCtrl();
		lctrl.createLoan(30);
		lctrl.findFriendByPhone("1234");
		lctrl.findAvailableCopyByTitle("Joe's song");
		lctrl.confirmLoan();

		Loan l1 = lctrl.getcLoan();

		lctrl.createLoan(30);
		lctrl.findFriendByPhone("1234");
		lctrl.findAvailableCopyByTitle("Joe's song");
		lctrl.confirmLoan();

		Loan l2 = lctrl.getcLoan();

		lctrl.createLoan(30);
		lctrl.findFriendByPhone("1234");
		lctrl.findAvailableCopyByTitle("Joe's song");
		lctrl.confirmLoan();

		Loan l3 = lctrl.getcLoan();

		// Act

		// Assert

		assertEquals(null, l3.getCopy());
		assertEquals(2, lc.getLoansSize());

	}

}
