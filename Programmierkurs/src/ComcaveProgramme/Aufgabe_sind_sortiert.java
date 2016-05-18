package ComcaveProgramme;

import java.util.Scanner;

public class Aufgabe_sind_sortiert {

	public static void main(String[] args) {
//	1.
//	Implementiert eine Methode "sind_sortiert()",
//	die 5 Ganzzahlen entgegen nimmt u.
//	"true" zurück gibt, wenn die übergebenen Zahlen aufsteigend sortiert sind,
//	sonst false.
//	Prüft im Hauptprg die Methode für mehrere Kombinationen.
//
//	2. dito für 5 Fließkommazahlen
		
		Scanner objScanner = new Scanner(System.in);
		int a=2;
		int b=3;
		int c=5;
		int d=8;
		int e=9;
		
		System.out.println("Ergebnis mit festen Werten");
		System.out.println(a+"<="+b+"<="+c+"<="+d+"<="+e+"="+sind_sortiert(a,b,c,d,e));
		System.out.println("-------------------------------------");

		float a1=1.1f;
		float b1=3.2f;
		float c1=4.4f;
		float d1=5.7f;
		float e1=6.9f;

		System.out.println("Ergebnis mit festen Fließkommawerten");
		System.out.println(a1+"<="+b1+"<="+c1+"<="+d1+"<="+e1+"="+sind_sortiert_float(a1,b1,c1,d1,e1));
		System.out.println("-------------------------------------");

		int[] sortFeld = new int[5];

		System.out.println("Ergebnis mit abgefragten Werten + Array");
		System.out.println("\nBitte geben Sie aufsteigend "+ sortFeld.length + " ganze Zahlen ein: ");

		for(int i = 0;i<sortFeld.length;i++){
			sortFeld[i] = objScanner.nextInt();
		}

		String sortErg="";
		if (!sind_sortiert_array(sortFeld)){ //ist das Array nicht sortiert füge der Ausgabe das Wort "NICHT " hinzu
			sortErg="NICHT ";
		}
		System.out.println("Die eingegebenen Zahlen sind "+sortErg+"aufsteigend sortiert");
		
		objScanner.close();
	}
	
	public static boolean sind_sortiert(int a, int b, int c, int d, int e){

		if(a<=b&b<=c&c<=d&d<=e){
				return true;
		}else{
			return false;
		}

	}

	public static boolean sind_sortiert_float(float a, float b, float c, float d, float e){

		if(a<=b&b<=c&c<=d&d<=e){
				return true;
		}else{
			return false;
		}

	}

	public static boolean sind_sortiert_array(int[] sort){
		boolean sortiert=true;
		for(int i=0;i<sort.length-1;i++){
			sortiert = sortiert&(sort[i]<=sort[i+1]); // sortiert bleibt true sofern keine <= Abfrage false ergibt (& Verknüpfung)
		}
		return sortiert;
	}
}
