import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;

public class ExceptionHandlingBibliotekaTest {

	public static void main(String[] args) throws IOException  {
		Scanner input = new Scanner(System.in);
		boolean continueInput = true;
		do {
			try {

				System.out.println("Unesite password: ");
				int broj = input.nextInt();

				System.out.println("Paswword koji ste unijeli je: " + broj);

				continueInput = false;
			} catch (InputMismatchException ex) {
				System.out.println("<<Try again>> " + "<<Pogrešan password: unesite bilo koji broj>>");
				input.nextLine();
			}
		} while (continueInput);
		System.out.println("");

		System.out.println("Izaberite jednu od ponuðenih opcija: ");
		System.out.println("0 - Ukupna  književna djela u Biblioteci: ");
		System.out.println("1) Student 1 ");
		System.out.println("2) Student 2 ");
		System.out.println("3) Student 3 ");
		System.out.println("4) Izlaz ");
		int izbor = input.nextInt();

		if (izbor == 0) {
			FileReader file = new FileReader("C:\\Users\\edd\\Desktop\\Književnadjela\\Ukupnadjela.txt ");
			BufferedReader reader = new BufferedReader(file);
			String text = "";
			String line = reader.readLine();
			while (line != null) {
				text += line;
				line = reader.readLine();
			}
			System.out.println(text);
			izbor = input.nextInt();
		}

		if (izbor == 1) {
			ExceptionHandlingRacunBiblioteka korisnik1 = new ExceptionHandlingRacunBiblioteka();
			korisnik1.setId(1);
			korisnik1.setIme("Jane ");
			korisnik1.setPrezime("Clark ");

			System.out.println("\nId= " + korisnik1.getId() + "\nIme = " + korisnik1.getIme() + "\nPrezime = "
					+ korisnik1.getPrezime());

			LocalDate localDate = LocalDate.of(2018, 8, 12);
			LocalDate newDate = localDate.plusDays(60);
			System.out.println("Knjige su izdate do datuma: " + newDate);

			FileReader file = new FileReader("C:\\Users\\edd\\Desktop\\Književnadjela\\Student1.txt");
			BufferedReader reader = new BufferedReader(file);

			String text = "";
			String line = reader.readLine();
			while (line != null) {
				text += line;
				line = reader.readLine();
			}
			System.out.println(text);
			izbor = input.nextInt();
		}

		if (izbor == 2) {

			ExceptionHandlingRacunBiblioteka korisnik1 = new ExceptionHandlingRacunBiblioteka();
			korisnik1.setId(2);
			korisnik1.setIme("Mike");
			korisnik1.setPrezime("Stone ");

			System.out.println("\nId= " + korisnik1.getId() + "\nIme = " + korisnik1.getIme() + "\nPrezime = "
					+ korisnik1.getPrezime());

			LocalDate localDate = LocalDate.of(2018, 8, 17);
			LocalDate newDate = localDate.plusDays(0);
			System.out.println("Knjige su izdate do datuma: " + newDate);

			FileReader file = new FileReader("C:\\Users\\edd\\Desktop\\Književnadjela\\Student2.txt");
			BufferedReader reader = new BufferedReader(file);

			String text = "";
			String line = reader.readLine();
			while (line != null) {
				text += line;
				line = reader.readLine();
			}
			System.out.println(text);
			izbor = input.nextInt();
		}

		if (izbor == 3) {

			ExceptionHandlingRacunBiblioteka korisnik1 = new ExceptionHandlingRacunBiblioteka();
			korisnik1.setId(3);
			korisnik1.setIme("Mia");
			korisnik1.setPrezime("Stonn ");

			System.out.println("\nId= " + korisnik1.getId() + "\nIme = " + korisnik1.getIme() + "\nPrezime = "
					+ korisnik1.getPrezime());

			LocalDate localDate = LocalDate.of(2018, 8, 17);
			LocalDate newDate = localDate.plusDays(30);
			System.out.println("Knjige su izdate do datuma: " + newDate);

			FileReader file = new FileReader("C:\\Users\\edd\\Desktop\\Književnadjela\\Student3.txt ");
			BufferedReader reader = new BufferedReader(file);

			String text = "";
			String line = reader.readLine();
			while (line != null) {
				text += line;
				line = reader.readLine();
			}
			System.out.println(text);
			izbor = input.nextInt();
		}

		if (izbor == 4) {
			System.out.println("\nIzlaz");

		}

	}
}
