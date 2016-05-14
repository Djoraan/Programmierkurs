package ComcaveProgramme;

public class HelloWorld { //Anfang

// hier kommt der Code

	// hier brauchen wir die main Methode
	// type: main [Strg]+[Space]
	
	public static void main(String[] args){ //main Anfang | void = Methode gibt keinen Wert zurück
		
		String hello = "Hello World";
		
		System.out.println(hello); // Quicktype: sysout [Strg]+[Space]
		
		int a = 3;
		int b = 6;
		int erg = a + b;
		byte by = 8; // 8 Bit
		short c = 78; // 16 Bit ...
		long lo = 234567; // 64 Bit...
		lo = by+c;
		System.out.println("Die Addition von " + a + " und " + b + " = " + erg);
		
		float f1 = 4.98f; // das f hinter 4.98 ist nötig um die Zahl als float zu kennzeichnen
		float f2 = 1.02f;
		f1=f1+f2;
		System.out.println("f1+f2="+f1);
		
		double d1 = 2.54;
		double d2 = 0.65;
		System.out.println(d2);
		
		boolean bol1 = true;
		System.out.println(bol1);
		
		// addiere long + integer
		long x = a + lo;
		int x2 = (int) (a + lo); // long von int gecasted
		System.out.println(x);
		
		float y = (float) (f1 + d1);
		System.out.println("long " + x + " und long von int " + x2 + " und float " + y);
		
	} //main Ende
	
	
} // Ende
