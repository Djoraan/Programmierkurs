package ComcaveProgramme;

public class ForSchleife {

	public static void main(String[] args) {
		// FOR-Schleife
		for(int ersteZeile=1;ersteZeile<=10;ersteZeile++){
			System.out.print("\t"+ersteZeile);
		}

		matrix();
	}
	
	public static void matrix() {
		// FOR-Schleife
		for(int x=1;x<=10;x++){
			System.out.print("\n"+x);
			for(int y=1;y<=10;y++){
				System.out.print("\t"+(y*x));
			}
		}

	}
	
		

}
