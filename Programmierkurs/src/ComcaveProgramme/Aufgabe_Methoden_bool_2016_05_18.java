package ComcaveProgramme;

import java.util.Scanner;

public class Aufgabe_Methoden_bool_2016_05_18 {

	public static void main(String[] args) {
//		1.
//		Implementiert eine Methode "zweihoch()",
//		die eine Ganzzahl "n" entgegen nimmt
//		u. die zweierpotenz von n zurück gibt,
//		also zwei hoch n.
//		Schreibt ein Hauptprogramm darum herum,
//		das die Methode für mehrere Zahlen testet.
//
//		2. 
//		Implementiert eine Methode "ist_gerade()",
//		die eine Ganzzahl entgegen nimmt
//		und einen booleschen Wert zurück liefert,
//		nämlich "true", wenn die übergebene Zahl gerade ist,
//		sonst "false".
//		Auch darum herum ein Hauptprg,
//		das die Methode für beide Fälle testet.
		
		int n;
		
		Scanner objScanner = new Scanner(System.in);
		System.out.print("Bitte eine Potenz n eingeben zu 2^n: ");
		n = objScanner.nextInt();

		System.out.println("Das Ergebnis von 2^"+n+" lautet: "+zweihoch(n));

		System.out.print("\n\nBitte eine ganze Zahl eingeben: ");
		n = objScanner.nextInt();

		if(ist_gerade(n)){
			System.out.println("Die Zahl "+n+" ist gerade");
		}else{
			System.out.println("Die Zahl "+n+" ist ungerade");
		}

		objScanner.close();
		
	}
	
	public static int zweihoch(int n){
		if(n>1){
			return n=2*zweihoch(n-1);
		}else{
			return 2;
		}
	}
	
	public static boolean ist_gerade(int a){
		return a%2==0;
	}

}
