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
		ArrayList<Copy> copies = lp.getCopies();
		for (int i = 0; i < copies.size(); i++) {
			boolean isLoaned = false;
			for (Loan l : loans) {
				if (l.getCopy() == copies.get(i)) {
					isLoaned = true;
				}
			}
			if (!isLoaned) {
				res = copies.get(i);
			}
		}
		return res;
	}

	public static void addLoanToContainer(Loan cLoan) {
		loans.add(cLoan);
	}

	public static LoanCont getInstance() {
		if (instance == null) {
			instance = new LoanCont();
		}
		return instance;
	}

}
