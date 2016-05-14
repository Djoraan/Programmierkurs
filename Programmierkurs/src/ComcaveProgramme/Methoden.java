package ComcaveProgramme;

public class Methoden {

	public static void main(String[] args) {
		// Methoden // Funktionen ...
		
		SayHello();
		
		String str1 = "Com";
		String str2 = "Cave";
		System.out.println(MakeString(str1, str2));
		
		int a = 40;
		int b = 20;
		System.out.println(Summ(a, b));
	}
	
	public static void SayHello() {
		
		System.out.println("Ich bin eine Methode");

	}
	
	public static String MakeString(String str1, String str2){
		
		return str1+str2;
		
	}
	
	public static int Summ(int a, int b){
		
		int erg = a+b;
		
		return erg;
	}

}
