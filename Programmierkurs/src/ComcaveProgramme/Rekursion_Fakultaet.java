package ComcaveProgramme;

public class Rekursion_Fakultaet {

	public static void main(String[] args) {
		// Fak! berechnen
		
		int m = 5;
		int F;
		
		if(m>0){ // Fakultät einer ganzen positiven zahl > 0
			F = fakultaetVonZahl(m);
			System.out.println(m+"! = "+F);
		}else if(m==0){ // Sonderfall 0!=1
			F=1;
			System.out.println(m+"! = "+F);
		}else{ //negative Zahlen sind nicht erlaubt
			System.out.println(m+"! ist ungültig, da kleiner 0");
		}
		

	}
	
	public static int fakultaetVonZahl(int zahl){
		if(zahl == 1){
			return 1;
		}else{
			return zahl * fakultaetVonZahl(zahl-1);
		}
			
	}
	

}
