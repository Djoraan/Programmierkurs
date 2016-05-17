package ComcaveProgramme;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;

public class ReadFile {
	
	public static void main(String[] args) { // das Windows \ in / umwandeln oder in \\ da es sonst als Escape Sequenz behandelt wird
		File file = new File("C:/Users/selsner/Documents/test.txt");
				
//		if(file.exists()){
//			System.out.println("File " + file.getName() + " gibt es");
//		}else{
//			System.out.println("File " + file.getName() + " gibt es nicht");
//		}
	

		if(!file.exists()){
			// Datei existiert nicht, also erstellen
			
			try{
				Formatter formatter = new Formatter("C:/Users/selsner/Documents/test.txt");
				System.out.println("Die Datei " + file.getName() + " wurde erstellt");
				formatter.close();
			} catch (FileNotFoundException e){
				e.printStackTrace();
			}
		}
	
	}
}