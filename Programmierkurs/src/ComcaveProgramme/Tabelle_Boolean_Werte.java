package ComcaveProgramme;

public class Tabelle_Boolean_Werte {

	public static void main(String[] args) {
//		Schreibt ein Programm mit Methoden "schreibe_Tabellenzeile" u. "schreibe_Tabellenkopf", 
//		der die Ausgabe erzeugt.
//		"schreibe_Tabellenzeile" soll zwei boolesche Paramter haben
//		u. wird vom Hauptprg 4* aufgerufen mit den enstprechenden Parametern.
		
		schreibe_Tabellenkopf();
		schreibe_Tabellenzeile(false, false);
		schreibe_Tabellenzeile(false, true);
		schreibe_Tabellenzeile(true, false);
		schreibe_Tabellenzeile(true, true);
		
	}
	
	public static void schreibe_Tabellenkopf(){
		System.out.println("a\tb\ta&b\ta|b");
	}
	
	public static void schreibe_Tabellenzeile(boolean a, boolean b){
		System.out.println(a+"\t"+b+"\t"+(a&b)+"\t"+(a|b));
	}

}
