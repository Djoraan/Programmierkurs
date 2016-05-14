package ComcaveProgramme;

public class IF_WHILE_Kombinationen {

	public static void main(String[] args) {
		// IF-WHILE Kombinationen
		// Summe der geraden Zahlen von 1 bis 20 berechnen
		int summe=0;
		int zaehler=1;
		do{
			if(zaehler %2==0){
				summe=summe+zaehler;
				System.out.println("Zwischensumme: "+summe+" (zaehler = "+zaehler+")");
			}
		zaehler++;
		}while(zaehler<=20);
		System.out.println("Summe: "+summe);
	}
}
