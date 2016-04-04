package mar09;

import java.util.Date;


public class Ddt extends Documento{
	
	private Date partenza;
	private Date arrivo;
	private String luogoPart;
	private String luovoArrivo;
		
	public Date getPartenza() {
		return partenza;
	}

	public void setPartenza(Date partenza) {
		this.partenza = partenza;
	}

	public Date getArrivo() {
		return arrivo;
	}

	public void setArrivo(Date arrivo) {
		this.arrivo = arrivo;
	}

	public String getLuogoPart() {
		return luogoPart;
	}

	public void setLuogoPart(String luogoPart) {
		this.luogoPart = luogoPart;
	}

	public String getLuovoArrivo() {
		return luovoArrivo;
	}

	public void setLuovoArrivo(String luovoArrivo) {
		this.luovoArrivo = luovoArrivo;
	}


	@Override
	public void stampa(){
		System.out.println("DDT:");
		System.out.println("Indirizzo: "+this.getIndirizzo());
		System.out.println("Data Emissione: "+this.getDataEmissione());
		System.out.println("Data Emissione: "+this.getNome());
		System.out.println("----------------------");
	}
}
