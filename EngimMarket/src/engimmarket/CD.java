package engimmarket;




public class CD extends EngimMarket implements Vendibile{

	private String titolo;
	private String autore;
	private int annoUscita;
	private String[] elencoCanzoni;
	private int numeroCanzoni;
        private int prezzo;
        
        public void setPrezzo(int prezzo) {
            this.prezzo = prezzo;
        }
        
        @Override
        public int getPrezzo()
        {
            return prezzo;
        }
	
	public CD(String titolo,String autore, int annouscita, String[] elencoCanzoni){
		this.titolo = titolo;
		this.autore = autore;
		this.annoUscita = annouscita;
		this.elencoCanzoni = elencoCanzoni;
	}
	
	public CD(String titolo,String autore, int annouscita, int numeroCanzoni){
		this.titolo = titolo;
		this.autore = autore;
		this.annoUscita = annouscita;
		this.numeroCanzoni = numeroCanzoni;
		this.elencoCanzoni = new String[numeroCanzoni];
		String track = "Track";
		
		for (int i=0;i<numeroCanzoni;i++){
			this.elencoCanzoni[i] = track+(i+1);
		}		
	}
	
	
	
	public String getTitolo() {
		return titolo;
	}

	public String getAutore() {
		return autore;
	}

	public int getAnnoUscita() {
		return annoUscita;
	}

	public String[] getElencoCanzoni() {
		return elencoCanzoni;
	}

	public int getNumeroCanzoni() {
		return numeroCanzoni;
	}

	public String posizioneTraccia(String nomeTraccia){
		String pos = "Traccia "+nomeTraccia+" non trovata!";
		for (int i=0;i<elencoCanzoni.length;i++){
			if (elencoCanzoni[i].equals(nomeTraccia)){
				System.out.println("Hai cercato "+"'"+nomeTraccia+"'.");
				pos = "Posizione traccia: "+i;
			}
		}
		return pos;
	}
	
	public void stampaCd(){
		System.out.println("");
		System.out.println("---------------");
		System.out.println("Titolo: "+this.getTitolo());
		System.out.println("Autore: "+this.getAutore());
		System.out.println("Anno Uscita: "+this.getAnnoUscita());
		System.out.println("Elenco canzoni:");
		System.out.println("---------------");
		for(int i=0; i<this.getElencoCanzoni().length;i++)
		{
			System.out.println("Canzone numero "+(i+1)+": "+this.getElencoCanzoni()[i]);
		}
		System.out.println("---------------");
		System.out.println("");
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
        return "CD";
    }
}


//Esercizio CD 
//
//Scrivere una classe  che rappresenti un compact disc tramite gli attributi opportuni:
//titolo, autore, anno di uscita e elenco delle canzoni. 
//Creare un costruttore che inizializzi tutti gli attributi con passaggio di parametri e un costruttore che 
//prenda il numero delle tracce in input e inizializzi l'attributo canzoni in automatico 
//(ad esempio le tracce avranno nome del tipo: Track1, Track2 etc)
//Scrivere i metodi:
// get e set delle variabili istanza
//un metodo per la stampa dello stato degli attributi
//un metodo che trova il numero della traccia dato il nome
//Scrivere un main per testare la classe in modo da usare i due costruttori, il metodo stampa 
//e il metodo di ricerca della traccia