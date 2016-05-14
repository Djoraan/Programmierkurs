package ComcaveProgramme;

public class Text_und_Zahlen {

	public static void main(String[] args) {
		int zahl1=3, zahl2=2;
		int s,p,d;
		s = Summ(zahl1,zahl2); //oder nur s = zahl1+zahl2;
		p = Prod(zahl1,zahl2);
		d = Diff(zahl1,zahl2);
		
		System.out.println("Gegeben sind die Zahlen: " + zahl1 + " und " + zahl2);
		System.out.println("Die Summe der Zahlen " + zahl1 + " und " + zahl2 +" ist " + s);
		// oder ohne extra Variablen
		//System.out.println("Die Summe der Zahlen " + zahl1 + " und " + zahl2 +" ist " + Summ(zahl1,zahl2));
		System.out.println("Das Produkt der Zahlen " + zahl1 + " und " + zahl2 +" ist " + p);
		System.out.println("Die Differenz der Zahlen " + zahl1 + " und " + zahl2 +" ist " + d);
		
	}
	
	
	public static int Summ(int a, int b){
		
		int erg = a+b; //nicht nötiger Zwischenschritt
		
		return erg;
	}

	public static int Prod(int a, int b){
		
		return a*b;
	}

	public static int Diff(int a, int b){
	
		return a-b;
	}

}
