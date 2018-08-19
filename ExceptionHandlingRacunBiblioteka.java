
public class ExceptionHandlingRacunBiblioteka extends ExceptionHandlingBibliotekaTest  {

	private double id;
	private String ime;
	private String prezime;
	

	public ExceptionHandlingRacunBiblioteka(double id, String ime, String prezime) {
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		

	}

	
	public ExceptionHandlingRacunBiblioteka() {
		// TODO Auto-generated constructor stub
	}

	public double getId() {
		return id;
	}

	public void setId(double id) {
		this.id = id;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	}
