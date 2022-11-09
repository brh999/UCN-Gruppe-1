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
		Friend res = null;
		res = FriendCtrl.findFriendByPhone(phone);
		cLoan.setFriend(res);
		return res;
	}

	public Copy findAvailableCopyByTitle(String title) {
		LP lp = LPCtrl.findLPByTitle(title);
		Copy res = LoanCont.getInstance().findCopyAvailable(lp);
		cLoan.setCopy(res);
		return res;
	}

	public void confirmLoan() {
		LoanCont.addLoanToContainer(cLoan);
	}

	public Loan getcLoan() {
		return cLoan;
	}

}
