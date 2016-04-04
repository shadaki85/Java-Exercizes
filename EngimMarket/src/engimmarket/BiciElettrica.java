package engimmarket;


public class BiciElettrica extends Bicicletta implements Vendibile{
    private int durataBatteria;
    private int potenza;
    private int prezzo;
    
    @Override
    public String getClassName(){
        return "Bicicletta Elettrica";
    }
    
    @Override
    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }
    @Override
    public int getPrezzo()
    {
        return prezzo;
    }

    public int getDurataBatteria() {
        return durataBatteria;
    }

    public void setDurataBatteria(int durataBatteria) {
        this.durataBatteria = durataBatteria;
    }

    public int getPotenza() {
        return potenza;
    }

    public void setPotenza(int potenza) {
        this.potenza = potenza;
    }

    public BiciElettrica(int durataBatteria, int potenza, String proprietario) {
        super(proprietario);
        this.durataBatteria = durataBatteria;
        this.potenza = potenza;
    }
    
    @Override
    public String toString(){
        return super.toString()+" - Autonomia "+this.getDurataBatteria()+", potenza "+this.getPotenza();
    }
}
