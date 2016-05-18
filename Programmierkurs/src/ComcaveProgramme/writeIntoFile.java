package ComcaveProgramme;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;

public class writeIntoFile {

	public static void main(String[] args) {
		
		String textToWrite = "Dies soll in die Datei geschrieben werden";
		
		File file = new File(System.getenv("USERPROFILE")+"/Documents/test_writeIntoFile.txt");
		
		if(file.exists()){
			try {
				Formatter form = new Formatter(file);
//				form.format("");
				form.format("%s", textToWrite);
				System.out.println("Datei vorhanden und Inhalt neu geschrieben/überschrieben");
				form.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("Fehler:");
				e.printStackTrace();
			}
		}else{
			System.out.println("Die Datei existiert nicht");
		}

	}

}
