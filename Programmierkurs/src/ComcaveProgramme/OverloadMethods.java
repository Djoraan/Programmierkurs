package ComcaveProgramme;

import java.util.Random;

public class OverloadMethods {

	int klassVar = 4;

	public static void main(String[] args) {
	
		System.out.println(rechne(3,0,"durch"));
		
		Random random = new Random();
		
		int zufallerg = random.nextInt(10)+1; // => 1-10
		System.out.println(zufallerg);
		
		Exception exception = new Exception();

	}

	// folgende Methoden heiﬂen alle gleich und unterscheiden sich nur durch die Anzahl Parameter
	public static int rechne(){
		return 0;
	}

	public static int rechne(int a){
		return a;
	}

	public static int rechne(int a, int b){
		return b;
	}

	public static int rechne(int a, int b, String s){
		int z = 0;
		// Rechne-Aufgabe.docx
		// ich muss wissen, was s aussagt
		if (s.equals("plus")){
			z = a+b;
			return z;
		}
		else if (s.equals("minus")){
			z = a-b;
			return z;
		}
		else if (s.equals("mal")){
			z = a*b;
			return z;
		}
		else if (s.equals("durch")){
			z = a/b;
			return z;
		}
		else{
			System.out.println("Operation nicht klar");
		}

		return z;
	}

}
