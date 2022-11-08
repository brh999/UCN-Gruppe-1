package ctrl;
import model.*;
import ctrl.*;

public class LoanCtrl {
	private Loan cLoan;
	
	public Loan createLoan(long loanPeriod) {
		cLoan = new Loan(loanPeriod);
		return cLoan;
	}
	
	public void loanSetCopy(String title) {
		cLoan.setCopy(findAvailableCopyByTitle(title));
		System.out.println("Added copy:  " + cLoan.getCopy() +  " - to loan");
	}
	
	public void loanSetFriend(String phone) {
		cLoan.setFriend(FriendCont.findFriendByPhone(phone));
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
