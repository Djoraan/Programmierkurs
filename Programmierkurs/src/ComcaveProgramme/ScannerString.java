package ComcaveProgramme;

import java.util.Scanner;

public class ScannerString {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie Ihren Nachnamen ein: ");
		String nachname = scanner.nextLine(); //.next reagiert schon auf space, .nextLine reagiert erst auf [Enter]
		
		System.out.println("Bitte geben Sie Ihren Vornamen ein: ");
		String vorname = scanner.nextLine();
		
		System.out.println("Hallo "+ vorname + " "+nachname);
		
		scanner.close();
	}

}
