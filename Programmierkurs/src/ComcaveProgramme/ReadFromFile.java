package ComcaveProgramme;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {

	public static void main(String[] args) {

		File file = new File("C:/Users/selsner/Documents/test.txt");
		
		try {
			FileReader fileReader = new FileReader(file);
			//Array Char definieren
			char[] myText = new char[100];
			try {
				fileReader.read(myText);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			for(char x : myText){ // gibt hier fix 100 Zeichen aus, auch wenn in der Datei weniger Zeichen drin stehen
				System.out.print(x);
			}
//			fileReader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
