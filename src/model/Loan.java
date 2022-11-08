package model;

import java.time.LocalDate;

public class Loan {
	private int loanNumber = 0;
	private LocalDate date;
	private String borrowDate;
	private String returnDate;
	private boolean state;
	private Copy copy;
	private Friend friend;

	public Loan(long borrowDays) {
		date = LocalDate.now();
		borrowDate = date.toString();
		returnDate = date.plusDays(borrowDays).toString(); // TODO er dette lovligt?
		state = true;
		copy = null;
		friend = null;
	}

	public Copy getCopy() {
		return copy;
	}

	public void setCopy(Copy copy) {
		this.copy = copy;
	}

	public boolean isState() {
		return state;
	}

	public void setFriend(Friend friend) {
		this.friend = friend;
	}

	public void setBorrowDate(LocalDate d) {
		this.borrowDate = d.toString(); // TODO LocalDate vs String
	}

	public void setReturnDate(LocalDate d, long daysToAdd) {
		this.returnDate = d.plusDays(daysToAdd).toString(); // TODO lovlig metode?
	}
}
