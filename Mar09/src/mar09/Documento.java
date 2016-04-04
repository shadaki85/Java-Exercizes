package mar09;

import java.util.Date;


public abstract class Documento{
	
	private String nome;
	private String cognome;
	private String pIva;
	private String indirizzo;
	private Date dataEmissione;
	private int numDocumento;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getpIva() {
		return pIva;
	}
	public void setpIva(String pIva) {
		this.pIva = pIva;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	public Date getDataEmissione() {
		return dataEmissione;
	}
	public void setDataEmissione(Date dataEmissione) {
		this.dataEmissione = dataEmissione;
	}
	public int getNumDocumento() {
		return numDocumento;
	}
	public void setNumDocumento(int numDocumento) {
		this.numDocumento = numDocumento;
	}
	
	public Documento(){
		dataEmissione = new Date();
	}
	
	public Documento(Date dataEmissione, int numDocumento) {
		this.dataEmissione = dataEmissione;
		this.numDocumento = numDocumento;
	}
	/**
	 * @param args
	 */
	public abstract void stampa();
	
//	public int confronta(Documento documento) {
//		return this.getNumDocumento() - documento.getNumDocumento();
//	}
	
	public static void main(String[] args) {
		
		Documento[] docs = {
				new Fattura(),
				new Fattura(),
				new Preventivo(),
				new Ddt()
		};
		
		int i=1;
		
		for(Documento doc: docs)
		{
			doc.setIndirizzo("indirizzo "+i);
			doc.setDataEmissione(new Date());
			doc.setNome("nome "+i);
			i++;
			doc.stampa();
		}
	}
}




