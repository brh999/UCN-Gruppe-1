package model;
import java.util.*;

public class LoanCont {
	private static LoanCont instance;
	private static ArrayList<Loan> loans;
	
	public LoanCont() {
		loans = new ArrayList<>();
	}
	
	public Copy findCopyAvailable(LP lp) {
		Copy res = null;
		for(Copy c : lp.getCopies()) {
			boolean isLoaned = false;
			for(Loan l : loans) {
				if(l.getCopy() == c) {
					isLoaned = true;
				}
			}
			if(!isLoaned) {
				res = c;
			}
		}
		return res;
	}

	public static void addLoanToContainer(Loan cLoan) {
			loans.add(cLoan);
	}
	
	public static LoanCont getInstance() {
		if(instance == null) {
			instance = new LoanCont();
		}
		return instance;
	}
	
}
