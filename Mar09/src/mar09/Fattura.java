package mar09;

import java.util.Date;

public class Fattura extends Documento{

	private Date scadenza;
	private float importoTotale;
		
	public Date getScadenza() {
		return scadenza;
	}
	public void setScadenza(Date scadenza) {
		this.scadenza = scadenza;
	}
	public float getImportoTotale() {
		return importoTotale;
	}
	public void setImportoTotale(float importoTotale) {
		this.importoTotale = importoTotale;
	}
	
	
	
	public Fattura() {
		super();
	}
	/**
	 * @param args
	 */
	@Override
	public void stampa(){
		System.out.println("Fattura:");
		System.out.println("Indirizzo: "+this.getIndirizzo());
		System.out.println("Data Emissione: "+this.getDataEmissione());
		System.out.println("Data Emissione: "+this.getNome());
		System.out.println("----------------------");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
