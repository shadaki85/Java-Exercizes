package mar09;

import java.util.Date;


public class Preventivo extends Documento {
	private float totale;
	private Date scadenza;

	public float getTotale() {
		return totale;
	}
	public void setTotale(float totale) {
		this.totale = totale;
	}
	public Date getScadenza() {
		return scadenza;
	}
	public void setScadenza(Date scadenza) {
		this.scadenza = scadenza;
	}
	
	
	@Override
	public void stampa(){
		System.out.println("Preventivo:");
		System.out.println("Indirizzo: "+this.getIndirizzo());
		System.out.println("Data Emissione: "+this.getDataEmissione());
		System.out.println("Data Emissione: "+this.getNome());
		System.out.println("----------------------");
	}
}
