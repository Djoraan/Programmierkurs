package ComcaveProgramme;

import java.util.Scanner;
public class ScannerClass {

	public static void main(String[] args) {

		Scanner objScanner = new Scanner(System.in);
		
		double erg,a,b;
		
		System.out.println("Bitte geben Sie eine Zahl ein: ");
		a = objScanner.nextDouble();
		
		System.out.println("Bitte geben Sie eine weitere Zahl ein: ");
		b = objScanner.nextDouble();
		
		erg = a/b;		
		System.out.println(a+" / "+b+" = "+erg);
		
		objScanner.close();
	}

}
