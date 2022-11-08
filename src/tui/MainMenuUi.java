package tui;

import java.util.Scanner;

public class MainMenuUi {
	private Scanner scanner;
	private LoanUi loanUi;
	
	public MainMenuUi() {
		scanner = new Scanner(System.in);
		loanUi = new LoanUi();
	}
	
	public void start() {
		boolean goOn = true;
		while (goOn) {
			optionsMessage();
			String input = scanner.nextLine();
			switch (input) {
			case "1":
				break;
			case "2":
				break;
			case "3":
				loanMenu();
				break;
			case "9":
				testData();
				break;
			case "0":
				exit();
				goOn = false;
				break;
			default:
				unknownInput(input);
			}
		}
	}

	private void testData() {
		// TODO Auto-generated method stub
		
	}

	private void loanMenu() {
		loanUi.start();
	}

	private void optionsMessage() {
		clearConsole();
		System.out.println("****** Main Menu ******\n"
		 	     + "(1) Friends menu (N/A)\n"
		 	     + "(2) LP menu (N/A)\n"
		 	     + "(3) Loan menu\n"
		 	     + "(9) Generate test data (N/A)\n"
				 + "(0) Quit the program\n");
		System.out.print("Choice: ");
	}

	private void clearConsole() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n");
	}

	private void exit() {
		System.out.println("Closing LP lending system.");
	}

	private void unknownInput(String input) {
		System.out.println("Input: " + input + " is not a valid command.");
	}
}
