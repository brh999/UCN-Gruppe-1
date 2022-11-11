package tui;

import java.util.Scanner;

import ctrl.LoanCtrl;
import model.*;

public class LoanUi {
	private Scanner scanner;
	private LoanCtrl lc;

	public LoanUi() {
		scanner = new Scanner(System.in);
		lc = new LoanCtrl();
	}

	public void start() {
		boolean goOn = true;
		while (goOn) {
			optionsMessage();
			String input = scanner.nextLine();
			switch (input) {
			case "1":
				createLoan();
				addFriendToLoan();
				findCopyByTitle();
				confirmLoan();
				break;
			case "2":
				break;
			case "3":
				goOn = false;
				break;
			default:
				unknownInput(input);
			}
		}
	}

	private void confirmLoan() {
		boolean goOn = true;
		while (goOn) {
			System.out.println("Would you like to confirm the loan? (Y/N)");
			String input = scanner.nextLine().toLowerCase();
			switch (input) {
			case "y":
				lc.confirmLoan();
				printReciept();
				goOn = false;
				break;
			case "n":
				goOn = false;
				break;
			default:
				unknownInput(input);
			}
		}
	}

	private void printReciept() {
		Loan l = lc.getcLoan();
		Copy c = l.getCopy();
		Friend f = l.getFriend();
		System.out.println(f.getName() + " has lent " + c.getTitle() +" with the serial number: " + c.getSerialNumber());
	}

	private void findCopyByTitle() {
		System.out.println("Input the title of your LP: ");
		String input = scanner.nextLine().toLowerCase();
		if (lc.findAvailableCopyByTitle(input) == null) {
			System.out.println(input + " is not a valid input or all copies are lent out."
					+ "\nPlease try agian(Press any key to continue)");
			scanner.nextLine();
			findCopyByTitle();
		} else {
			lc.findAvailableCopyByTitle(input);
		}
	}

	private void addFriendToLoan() {
		System.out.println("What's your friend/lenders phone number?");
		System.out.println("Write here: ");
		String input = scanner.nextLine();
		if (isNumeric(input)) {
			Friend f = lc.findFriendByPhone(input);
			if (f == null) {
				System.out.println("No friend found with phone: " + input);
				addFriendToLoan();
			}
		} else {
			System.out.println(input + " is not a valid number." 
					+ "\nPlease try agian(Press any key to continue)");
			scanner.nextLine();
			addFriendToLoan();
		}
	}

	private void createLoan() {
		System.out.println("How many days do you want to rent this LP out?");
		System.out.println("Choice: ");
		String input = scanner.nextLine();
		if (isNumeric(input)) {
			lc.createLoan(Integer.parseInt(input));
		} else {
			System.out.println(input + " is not a valid number." 
					+ "\nPlease try agian(Press any key to continue)");
			scanner.nextLine();
			createLoan();
		}

	}

	private boolean isNumeric(String str) {
		boolean isValid;
		try {
			Integer.parseInt(str);
			isValid =  true;
		} catch (NumberFormatException e) {
			isValid = false;
		}
		return isValid;
	}

	private void optionsMessage() {
		clearConsole();
		System.out.println(
				"****** Loan Menu ******\n" + "(1) Lend LP\n" + "(2) Return LP (N/A)\n" + "(3) Return to main menu\n");
		System.out.print("Choice: ");
	}

	private void clearConsole() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n");
	}

	private void unknownInput(String input) {
		System.out.println("Input: " + input + " is not a valid command.");
	}
}
