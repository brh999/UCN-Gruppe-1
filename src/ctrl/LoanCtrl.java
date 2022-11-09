package ctrl;

import model.*;
import ctrl.*;

public class LoanCtrl {
	private Loan cLoan;

	public Loan createLoan(int loanPeriod) {
		cLoan = new Loan(loanPeriod);
		return cLoan;
	}

	public Friend findFriendByPhone(String phone) {
		return FriendCtrl.findFriendByPhone(phone);
	}

	public Copy findAvailableCopyByTitle(String title) {
		LP lp = LPCtrl.findLPByTitle(title);
		Copy res = LoanCont.getInstance().findCopyAvailable(lp);
		return res;
	}

	public void confirmLoan() {
		LoanCont.addLoanToContainer(cLoan);
	}

}
