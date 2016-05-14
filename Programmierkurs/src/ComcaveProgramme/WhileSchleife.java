package ComcaveProgramme;

public class WhileSchleife {

	public static void main(String[] args) {
		// while
		
		int zaehler = 0;
		
		while(zaehler < 10){
			System.out.println(zaehler);
			zaehler = zaehler + 1;
		}
		System.out.println("----");
		zaehler = 50;
		do{
			System.out.println(zaehler);
			zaehler = zaehler + 1;
		}while(zaehler < 10);


	}

}
