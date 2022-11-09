package model;

import java.util.*;

/**
 * This class is the container for Loan objects.
 * 
 * @author Alex
 * @author Rasmus
 * @author Kasper
 * @author Danny
 *
 * @date 10/11/2022
 */
public class LoanCont {

	private static LoanCont instance;
	private static ArrayList<Loan> loans;

	/**
	 * This method creates a ArrayList of Loan objects as a singleton.
	 * 
	 * @return instance of LoanCont
	 */
	public static LoanCont getInstance() {
		if (instance == null) {
			instance = new LoanCont();
		}
		return instance;
	}

	/**
	 * This is the constructor for the LoanCont and creates an instance of loans
	 */
	public LoanCont() {
		loans = new ArrayList<>();
	}
	
	/**
	 * Finds the first copy available from a LP
	 * @param lp  The LP to find the first available copy from.
	 * @return Copy
	 */
	public Copy findCopyAvailable(LP lp) {
		Copy res = null;
		ArrayList<Copy> copies = lp.getCopies();
		for (int i = 0; i < copies.size(); i++) {
			boolean isLoaned = false;
			for (Loan l : loans) {
				if (l.getCopy() == copies.get(i)) {
					isLoaned = l.isLent();
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

}
