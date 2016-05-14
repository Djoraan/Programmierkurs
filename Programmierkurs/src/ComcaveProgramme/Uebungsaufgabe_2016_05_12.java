package ComcaveProgramme;

public class Uebungsaufgabe_2016_05_12 {

	public static void main(String[] args) {
	//	Bitte schreiben Sie ein Programm, welches eine ganze Zahl als Eingabe bekommt, 
	//	die Dann herunterzählt und immer wieder diese Zahl auf Teilbarkeit überprüft. 
	//	Diese Zahlen sollen darauf geprüft werden, ob sie durch 2 , 3, 4, 5, oder 6 teilbar sein.
	//	z.B. 45 
	//	ist die 45 durch 2,3,4,5, oder 6 teilbar, wenn ja, ausgeben Zahl und Text dazu
	//	jetzt die 44 und so weiter 
	//	bei 1 aufhören bitte
//		System.out.println("Test");
		
		int zahl=45;
		
//		teilbarSimple(zahl);
		teilbarTable(zahl);
		

	}//main
	
	public static void teilbarSimple(int zahl){
	
		for(int z=zahl;z>0;z--){
			for(int t=2;t<=6;t++){ //zahl versuchen durch 6,5,4,3,2 zu teilen
				
				if(z %t==0){
				System.out.println(z+" ist durch "+t+" teilbar");
				}
			}//end for t
				
		}//end for zahl
	}//end teilbarSimple

	
	public static void teilbarTable(int zahl){
		
		for(int z=zahl;z>0;z--){
			System.out.print("\n_____________________________________________________________");
			System.out.print("\n"+z+" ist teilbar durch\t");
			for(int t=2;t<=6;t++){ //zahl versuchen durch 6,5,4,3,2 zu teilen
				if(z %t==0){
				System.out.print(t+"\t");
				}else{
					System.out.print("-\t");
				}
				
			}//end for t
				
		}//end for zahl		
	} //end teilbarTable
}
