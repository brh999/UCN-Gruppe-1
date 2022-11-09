package tui;

import java.util.Scanner;

import ctrl.LoanCtrl;

public class LoanUi {
	private Scanner scanner;

	public LoanUi() {
		scanner = new Scanner(System.in);
	}

	public void start() {
		boolean goOn = true;
		while (goOn) {
			optionsMessage();
			String input = scanner.nextLine();
			switch (input) {
			case "1":
				createLoan();
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

	private void createLoan() {
		LoanCtrl lc = new LoanCtrl();
		lc.createLoan();
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
