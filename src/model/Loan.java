package model;

import java.time.LocalDate;

/**
 * 
 * @author Alex
 * @author Rasmus
 * @author Danny
 * @author Kasper
 * @version 11/10-2022
 */

public class Loan {
	private int loanNumber = 0;
	private LocalDate date;
	private String borrowDate;
	private int daysBorrowed;
	private boolean state;
	private Copy copy;
	private Friend friend;

	/**
	 * Constructor for the objects of class Loan
	 * 
	 * @param borrowDays the amount of days the loan will last
	 */
	public Loan(int borrowDays) {
		date = LocalDate.now();
		borrowDate = date.toString();
		daysBorrowed = borrowDays;
		state = true;
		copy = null;
		friend = null;
	}

	/**
	 * Returns the Copy object of this Loan
	 * 
	 * @return the Copy object of this Loan
	 */
	public Copy getCopy() {
		return copy;
	}

	/**
	 * Overwrites the Copy object of this Loan with specified Copy object
	 * 
	 * @param copy new Copy object to overwrite the old Copy object with
	 */
	public void setCopy(Copy copy) {
		this.copy = copy;
	}

	/**
	 * Returns the current state of this Loan
	 * 
	 * @return boolean state of this Loan
	 */
	public boolean isState() {
		return state;
	}

	/**
	 * Overwrites the Friend object of this Loan with specified Friend object
	 * 
	 * @param friend new Friend object to overwrite the old Friend object with
	 */
	public void setFriend(Friend friend) {
		this.friend = friend;
	}

	/**
	 * Overwrites the borrowDate of this Loan with specified new date
	 * 
	 * @param d LocalDate object to convert to String and overwrite old borrowDate
	 *          with
	 */
	public void setBorrowDate(LocalDate d) {
		this.borrowDate = d.toString(); // TODO LocalDate vs String
	}

	/**
	 * Overwrites the daysBorrowed of this Loan with specified daysToAdd
	 * 
	 * @param daysToAdd new daysToAdd to overwrite the old daysBorrowed with
	 */
	public void setDaysBorrowed(int daysToAdd) {
		daysBorrowed = daysToAdd;
	}

	/**
	 * Increments daysBorrowed by specified days
	 * 
	 * @param days amount of days to increment daysBorrowed with
	 */
	public void addDaysToLoan(int days) {
		daysBorrowed += days;
	}

	/**
	 * Returns the Friend object of this Loan
	 * 
	 * @return the Friend object of this Loan
	 */
	public Friend getFriend() {
		return friend;
	}

}
