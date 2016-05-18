package ComcaveProgramme;

import java.util.Scanner;

public class Primzahlen_Rekursiv {

	public static void main(String[] args) {
//	Primzahlen
//	Eine Zahl ist prim, wenn sie größer als 1 ist und es keine Zahl außer der 1 
//	und sie selbst gibt, durch welche sie ganzzahlig teilbar ist. 
//	Zunächst scheint es so, als müsse man also für jede Zahl x prüfen, 
//	ob es irgendeine Zahl i von 2 bis x-1 gibt, durch welche x ganzzahlig teilbar ist, 
//	um festzustellen, ob x prim ist. 
//	Aufgabe: 
//	Schreiben Sie bitte ein Programm, das die ersten n Primzahlen bestimmt und ausgibt.
//	•	Der einfachste Algorithmus um zu ermitteln, ob eine Zahl x eine Primzahl ist, 
//	besteht darin, x durch jede Zahl kleiner als x zu teilen und zu überprüfen, ob ein 
//	Rest übrig bleibt. 
//	Für die 25 würde der Algorithmus (ob 25 prim ist) also folgendermaßen ablaufen: 
//	25 / 2 = 12 Rest 1
//	25 / 3 = 8 Rest 1
//	25 / 4 = 6 Rest 1
//	25 / 5 = 5 Rest 0 -> 25 ist keine Primzahl 
//	Wenn der Algorithmus durchgelaufen ist, ohne einen Teiler für x gefunden zu haben, 
//	so muss x eine Primzahl sein.   

		int zahl;
		Scanner objScanner = new Scanner(System.in);
		System.out.print("Bitte eine positive ganze Zahl > 1 eingeben: ");
		zahl = objScanner.nextInt();
		if(zahl>1){
			if (prim(zahl,zahl-1)){
				System.out.println(zahl+" ist eine Primzahl");
			}else{
				System.out.println(zahl+" ist keine Primzahl");
			}
		}else{
			System.out.println(zahl+" ist nicht > 1, versuch's nochmal");
		}
		objScanner.close();
	}
	
	public static boolean prim(int zahl, int teiler){
		if(teiler==1){ // Teiler = 1 = Ende und somit prim = true da Zahl durch 1 teilbar und vorher Methode nicht ausgestiegen
			return true;
		}else if(zahl%teiler==0){ // Hier ebenfalls Ende, jedoch false, da Zahl durch eine andere Zahl also 1 oder sich selbst teilbar
			System.out.println(zahl+" % "+teiler+" = 0");
			return false;
		}else {
			return prim(zahl,teiler-1); // Zahl nicht durch Teiler teilbar, dann rekursiv weiter mit dem nächst kleineren Teiler
			
		}
	}

}
