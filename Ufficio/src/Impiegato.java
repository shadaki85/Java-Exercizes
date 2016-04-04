
public class Impiegato {
	
	private String name;
	private String surname;
	private int stipendio;
	
	public Impiegato(String name, String surname, int stipendio){
		this.name = name;
		this.surname = surname;
		this.stipendio = stipendio;
	}
	
	public String getName(){
		return name;
	}
	
	public String getSurname(){
		return surname;
	}
	
	public int getStipendio(){
		return stipendio;
	}
	
	public int aumentaStipendio(int aumento)
	{
		int nuovoStipendio = this.stipendio + aumento;
		return nuovoStipendio;
	}
}


//1. Classe Impiegato che lo rappresenti tramite nome e stipendio con
//un costruttore che inizializzi nome e stipendio, con opportuni metodi
//di get sugli attributi e con un metodo per aumentarne lo stipendio.
