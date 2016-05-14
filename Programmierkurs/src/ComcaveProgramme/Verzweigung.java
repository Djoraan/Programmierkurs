package ComcaveProgramme;

public class Verzweigung {

	public static void main(String[] args) {
		// IF - ELSE Anweisung
		
		int zahl = 3;
		//Ausgeben ob zahl gerade oder ungerade ist
		gerade(zahl);
		// abfragen, ob Zahl gerade ist
		
		
		int x=9,y=4;
		// Das Minimum von x und y ausgeben
		System.out.println("Das Minimum von x=" + x + " und y=" + y + " ist: " + Minimum(x,y));
	}
	
	public static void gerade(int zahl){
		if (zahl %2==0){
			System.out.println("Die Zahl " + zahl + " ist gerade");
		}
		else{
			System.out.println("Die Zahl " + zahl + " ist ungerade");
		}

	}
	
	public static int Minimum(int x, int y){
		if(x<=y){
			return x;
		}
		else{
			return y;	
		}	
	}

}
