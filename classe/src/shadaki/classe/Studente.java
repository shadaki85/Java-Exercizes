package shadaki.classe;


public class Studente implements Comparable<Studente>{
    private String nome;
    private String cognome;
    private int eta;
    private static int counter = 1;
    private int matricola;

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

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public int getMatricola() {
        return matricola;
    }

    public Studente(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        matricola=counter++;
    }
    
    
    @Override
    public String toString(){
        return this.getNome()
                +" "
                +this.getCognome()
                + " di anni "
                +this.getEta()+" matricola N°"+getMatricola();
    }

    @Override
    public int compareTo(Studente o) {
        return this.getEta()-o.getEta();
    }
}
