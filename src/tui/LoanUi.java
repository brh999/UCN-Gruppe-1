package tui;

import java.util.Scanner;

import ctrl.LoanCtrl;

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
				break;
			case "n":
				goOn = false;
				break;
			default:
				unknownInput(input);
			}
		}
	}

	private void findCopyByTitle() {
		System.out.println("Input the title of your LP: ");
		String input = scanner.nextLine();
		//TODO try catch
		lc.findAvailableCopyByTitle(input);
	}

	private void addFriendToLoan() {
		System.out.println("What's you friend/lenders phone number?");
		System.out.println("Write here: ");
		String input = scanner.nextLine();
		//TODO Try catch
		lc.findFriendByPhone(input);
	}

	private void createLoan() {
		System.out.println("How many days do you want to rent this LP out?");
		System.out.println("Choice: ");
		int input = Integer.parseInt(scanner.nextLine());
		//TODO Try catch
		lc.createLoan(input);
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
