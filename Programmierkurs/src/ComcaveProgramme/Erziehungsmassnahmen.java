package ComcaveProgramme;

public class Erziehungsmassnahmen {

	public static void main(String[] args) {
//		int a=3,b=5,c;
//		short a=3,b=5;
		byte a=3,b=5;
		byte c;

//		int c = a+b;
		c = (byte) (a+b); // beim arbeiten mit Operatoren wird das Erg. autom in INT umgewandelt, daher muss man casten oder die Erg. Var. in INT ändern
		//int c = a+b;
		System.out.println(c);

	}

}
