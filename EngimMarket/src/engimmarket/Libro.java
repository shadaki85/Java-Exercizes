package engimmarket;


public class Libro extends EngimMarket implements Vendibile{
	private String autore;
	private String titolo;
        private String editore;
	private int numero;
        private int prezzo;
        
        public void setPrezzo(int prezzo) {
            this.prezzo = prezzo;
        }
        @Override
        public int getPrezzo()
        {
            return prezzo;
        }
        
	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getEditore() {
		return editore;
	}
	public void setEditore(String editore) {
		this.editore = editore;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Libro(){
		
	}
	public Libro(String autore, String titolo, String editore, int numero) {
		this.autore = autore;
		this.titolo = titolo;
		this.editore = editore;
		this.numero = numero;
    }

    @Override
    public int compareTo(Object t) {
        if (this.getPrezzo() < ((Vendibile)t).getPrezzo())
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }

    @Override
    public String getClassName() {
        return "Libro";
    }
}
