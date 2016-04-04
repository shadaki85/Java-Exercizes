package engimmarket;


public class Bicicletta extends EngimMarket implements Vendibile,Scontabile{
	private int numTelaio;
	private String proprietario;
	private final int MAX_VEL = 20;
	private static int contatore = 0;
	private int velIniz = 6;
	private int marciaIniz = 2;
        private int prezzo;
        private int sconto;
        
        @Override
        public int compareTo(Object t){
            if (this.getPrezzo() < ((Vendibile)t).getPrezzo())
            {
                return 1;
            }
            else
            {
                return -1;
            }
        }
        
        public void setPrezzo(int prezzo) {
            this.prezzo = prezzo;
        }
               
        @Override
        public int setSconto(int sconto){
            this.sconto = sconto;
            prezzo = prezzo-sconto;
            return prezzo;
        }
               
        @Override
        public int getSconto(){
            return sconto;
        }
        
        @Override
        public int getPrezzo()
        {
            return prezzo;
        }
	
	
	public int getVelIniz() {
		return velIniz;
	}

	public int getMarciaIniz() {
		return marciaIniz;
	}

	public String getProprietario() {
		return proprietario;
	}

	public Bicicletta(String proprietario){
		this.proprietario = proprietario;
		this.numTelaio= ++contatore;
	}
	
	public Bicicletta(){
		this("Stefano");
	}
	
	public int getNumTelaio() {
		return numTelaio;
	}
	
	private int aumentaMarcia(int nuovaMarcia){
		int marcia = this.marciaIniz+nuovaMarcia;
		return marcia;
	}
	
	public int aumentaVel(int velCorrente, int marcia){
		int velNuova = velCorrente*marcia;
		if (velNuova <= MAX_VEL)
		{
			return velNuova;
		}
		else
		{
			velNuova = MAX_VEL;
			return velNuova;
		}
	}
	@Override
        public String toString()
        {
            return "Bicicletta di "+this.getProprietario()+" con numero telaio '"+this.getNumTelaio()+"'";
        }
        
        
	public static void mainz(String[] args) {
		Bicicletta bici1 = new Bicicletta();
		Bicicletta bici2 = new Bicicletta("Antonio");
		Bicicletta bici3 = new Bicicletta("Sara");
		Bicicletta bici4 = new Bicicletta();                
                
		System.out.println("Hai creato "+Bicicletta.contatore+" biciclette");
		System.out.println("--------------------------");
		Bicicletta[] roster = {bici1,bici2,bici3,bici4};
		for(int i=0; i<roster.length;i++)
		{
			System.out.println("Bici di: "+roster[i].getProprietario()+" - Num Telaio: "+roster[i].getNumTelaio());
		}
		System.out.println("--------------------------");
		System.out.println("La bici di "+bici2.getProprietario()+" aumenta marcia da "+bici2.getMarciaIniz()+" a "+bici2.aumentaMarcia(3));
		if (bici2.aumentaVel(bici2.getVelIniz(),bici2.aumentaMarcia(3)) < 20)
		{
			System.out.println("La bici andava a velocità "+bici2.getVelIniz()+" ora va a velocità "+ bici2.aumentaVel(bici2.getVelIniz(),bici2.aumentaMarcia(3)));
		}
		else
		{
			System.out.println("La bici andava a velocità "+bici2.getVelIniz()+" ora va a velocità "+ bici2.aumentaVel(bici2.getVelIniz(),bici2.aumentaMarcia(3))+" (VELOCITA' MASSIMA!)");
		}
		System.out.println("--------------------------");
		System.out.println("La bici di "+bici1.getProprietario()+" aumenta marcia da "+bici1.getMarciaIniz()+" a "+bici1.aumentaMarcia(1));
		if (bici1.aumentaVel(bici1.getVelIniz(),bici1.aumentaMarcia(1)) < 20)
		{
			System.out.println("La bici andava a velocità "+bici1.getVelIniz()+" ora va a velocità "+ bici1.aumentaVel(bici1.getVelIniz(),bici1.aumentaMarcia(1)));
		}
		else
		{
			System.out.println("La bici andava a velocità "+bici1.getVelIniz()+" ora va a velocità "+ bici1.aumentaVel(bici1.getVelIniz(),bici1.aumentaMarcia(1))+" (VELOCITA' MASSIMA!)");
		}
	}

    @Override
    public String getClassName() {
        return "Bicicletta";
    }
}


/*
Estensione Es. Bicicletta:

Modificare le classi Bici e ProvaBici in modo che:

- ogni bicicletta abbia un numero di telaio univoco che la contraddistingua generato al momento
	della creazione della bici
- la classe Bicicletta abbia un contatore che tenga traccia del numero delle bici create
	e un apposito metodo che ne fornisca il valore
- uno dei due costruttori richiami l'altro
- ci sia una velocit� massima (costante) che le bici non possono superare, 
	quindi il metodo aumentaVelocit� dovr� essere modificato di conseguenza.
*/