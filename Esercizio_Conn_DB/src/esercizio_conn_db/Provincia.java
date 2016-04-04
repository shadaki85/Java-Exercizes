package esercizio_conn_db;

public class Provincia {
    private int id;
    private String nome;
    private int comuni;
    private String sigla;
    private int abitanti;
    private int superficie;

    public Provincia(int id, String nome, int comuni, String sigla, int abitanti, int superficie) {
        this.id = id;
        this.nome = nome;
        this.comuni = comuni;
        this.sigla = sigla;
        this.abitanti = abitanti;
        this.superficie = superficie;
    }

    public String getSigla() {
        return sigla;
    }

    public int getAbitanti() {
        return abitanti;
    }

    public int getSuperficie() {
        return superficie;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getComuni() {
        return comuni;
    }
    
}
