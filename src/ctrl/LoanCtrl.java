package ctrl;

import model.*;
import ctrl.*;
/**
 * 
 * @author Rasmus, Alex, Kasper, Dani
 *
 */

public class LoanCtrl {
	private Loan cLoan;

	/** Create a loan object
	 * 
	 * @param loanPeriod 
	 * @return Loan
	 */
	public Loan createLoan(int loanPeriod) {
		cLoan = new Loan(loanPeriod);
		return cLoan;
	}

	/** Find a Friend object by phone
	 * 
	 * @param phone  Phone number to find friend by
	 * @return Friend
	 */
	public Friend findFriendByPhone(String phone) {
		Friend res = null;
		res = FriendCtrl.findFriendByPhone(phone);
		cLoan.setFriend(res);
		return res;
	}

	/** Find first available copy by title
	 * 
	 * @param title The title of the copy
	 * @return Copy
	 */
	public Copy findAvailableCopyByTitle(String title) {
		LP lp = LPCtrl.findLPByTitle(title);
		Copy res = LoanCont.getInstance().findCopyAvailable(lp);
		cLoan.setCopy(res);
		return res;
	}
	
	/** Confirm loan by adding the loan to the LoanCont
	 * 
	 */

	public void confirmLoan() {
		LoanCont.addLoanToContainer(cLoan);
	}

	public Loan getcLoan() {
		return cLoan;
	}

}
