package ctrl;

import model.*;
import ctrl.*;

/**
 * 
 * @author Rasmus, Alex, Kasper, Danny
 *
 */

public class LoanCtrl {
	private Loan cLoan;

	/**
	 * Create a loan object
	 * 
	 * @param loanPeriod
	 * @return Loan
	 */
	public Loan createLoan(int loanPeriod) {
		cLoan = new Loan(loanPeriod);
		return cLoan;
	}

	/**
	 * Find a Friend object by phone
	 * 
	 * @param phone Phone number to find friend by
	 * @return Friend
	 */
	public Friend findFriendByPhone(String phone) {
		Friend res = null;
		res = new FriendCtrl().findFriendByPhone(phone);
		setFriend(res);
		return res;
	}

	/**
	 * Sets the Friend object for this cLoan object for this LoanCtrl, if the
	 * specified Friend object is not null
	 * 
	 * @param friend Friend object to set for cLoan
	 */
	private void setFriend(Friend friend) {
		if (cLoan != null) {
			cLoan.setFriend(friend);
		}

	}

	/**
	 * Find first available copy by title
	 * 
	 * @param title The title of the copy
	 * @return Copy
	 */
	public Copy findAvailableCopyByTitle(String title) {
		Copy res = null;
		LP lp = LPCtrl.findLPByTitle(title);
		if (lp != null) {
			res = LoanCont.getInstance().findCopyAvailable(lp);
			setCopy(res);
		}

		return res;
	}

	/**
	 * Sets the Copy object for this cLoan object for this LoanCtrl, if the
	 * specified Copy object is not null
	 * 
	 * @param copy Copy object to set for cLoan
	 */
	private void setCopy(Copy copy) {
		if (cLoan != null) {
			cLoan.setCopy(copy);
		}
	}

	/**
	 * Confirm loan by adding the loan to the LoanCont
	 * 
	 */

	public void confirmLoan() {
		if (cLoan.getCopy() != null && cLoan.getFriend() != null) {
			LoanCont.getInstance().addLoanToContainer(cLoan);
		}
	}

	/**
	 * Returns the current loan object cLoan for this LoanCtrl
	 * 
	 * @return current loan object cLoan
	 */
	public Loan getcLoan() {
		return cLoan;
	}

}
