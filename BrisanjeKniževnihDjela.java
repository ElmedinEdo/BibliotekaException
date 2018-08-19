import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class BrisanjeKni�evnihDjela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					
		if (args.length != 1) {

			System.out.println("Argument nije prona�en. ");
			return;
		}

		File myTextFile = new File(args[0]);
		if (myTextFile.exists())
			System.out.println("Text file prona�en! ");
		else
			System.out.println("Text file nije prona�en! ");
		String editString = " ";
		try {
			Scanner textReader = new Scanner(myTextFile);
			while (textReader.hasNext())
				editString += textReader.nextLine();
			textReader.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		editString = editString.replaceAll("1 - Dervi� i smrt." , "");
		editString = editString.replaceAll("15 - Dundo Maroje." , "");
		editString = editString.replaceAll("19 - Dundo Maroje." , "");
		editString = editString.replaceAll("9 - Lica, 1960." , "");
		editString = editString.replaceAll("2 - Ti�ine, 1961." , "");
		try {
			PrintWriter editor = new PrintWriter(myTextFile);
			editor.write(editString);
			System.out.println("Editor finish editing.");
			editor.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
