package ComcaveProgramme;

import java.util.Scanner;

public class ArrayClass {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		// Typ[] Name = new Typ[Anzahl];
//		int[] myArray = new int[10];
//		int[] myArray = {5,3,34,4,7,4,92,7,5,33};
		// mein Index geht bei 10 von 0 - 9
//		myArray[0] = 5;
//		myArray[1] = 10;
//		myArray[2] = 4;
//		myArray[3] = 89;
//		myArray[4] = 8;
//		myArray[5] = 2;
//		myArray[6] = 10;
//		myArray[7] = 10;
//		myArray[8] = 100;
//		myArray[9] = 99;
		
//		for(int i=0;i<myArray.length;i++){
//			System.out.println(myArray[i]);
//		}
//
//		System.out.println("-----");
//		
//		for(int i : myArray){ // andere kürzere Schreibweise
//			System.out.println(i); 	// hier nich myArray[i] benutzen sondern nur i, 
//									//da oben i der Wert des Arrays an der aktuellen Pos. i zugewiesen
//		}
//		

		int[] myArray = new int[6];
		System.out.println("Bitte geben Sie "+ myArray.length + " Zahlen ein: ");
		
		for(int i = 0;i<myArray.length;i++){
			myArray[i] = scanner.nextInt();
		}
		scanner.close();
		
		double sum=0;
		double avrg;

		for(int i : myArray){
//			sum=sum+i;
			sum+=i; // += Kurzform
		}
		avrg = sum / myArray.length;
		System.out.println(sum);
		System.out.println("Der Durchschnitt der "+ myArray.length + " Zahlen ist : "+avrg);

	}

}
