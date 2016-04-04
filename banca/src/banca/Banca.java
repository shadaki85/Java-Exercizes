package banca;

import java.util.Iterator;
import java.util.List;


public class Banca {
    private String nome;
    private int numFiliale;
    private List<ContoCorrente> conti;

    public Banca(String nome, int numFiliale, List<ContoCorrente> conti) {
        this.nome = nome;
        this.numFiliale = numFiliale;
        this.conti = conti;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumFiliale() {
        return numFiliale;
    }

    public void setNumFiliale(int numFiliale) {
        this.numFiliale = numFiliale;
    }

    public List<ContoCorrente> getConti() {
        return conti;
    }

    public void setConti(List<ContoCorrente> conti) {
        this.conti = conti;
    }
    
    public void addContoCorrente(ContoCorrente cc){
        ContoCorrente giaPresente = null;
        for (ContoCorrente conto:conti){
            if(conto.getIdConto() == cc.getIdConto())
            {
                giaPresente = conto;
            }
        }
        if(giaPresente == null){
            conti.add(cc);
            System.out.println("Conto N°"
                    +cc.getIdConto()
                    +" intestato a "
                    +cc.getIntestatario().getNome()
                    +" "
                    +cc.getIntestatario().getCognome()
                    +" aggiunto alla banca "
                    +this.nome);
        }
        else
        {
            System.out.println("ERRORE: Il conto N°"+cc.getIdConto()+" è già presente nella banca "+this.nome+"!");
        }
        
    }
    public boolean removeContoCorrente(int idConto){
        Iterator<ContoCorrente> it = conti.iterator();
        ContoCorrente contoDaRimuovere = null;
        while(it.hasNext()){
            contoDaRimuovere = it.next();
            if (contoDaRimuovere.getIdConto() == idConto)
            {
                it.remove();
                return true;
            }
        }
        return false;
    }
    
    public ContoCorrente getContoCorrente(String cf){
        ContoCorrente cc = null;
        for(ContoCorrente conto:conti)
        {
            if(conto.getIntestatario().getCf().equals(cf)){
                cc = conto;
            }
        }
        return cc;
    }
    
    public ContoCorrente getContoCorrente(int idConto){
        ContoCorrente cc = null;
        for(ContoCorrente conto:conti)
        {
            if(conto.getIdConto() == idConto){
                cc = conto;
            }
        }
        return cc;
    }
    
    public boolean faiDeposito(int idConto, double ammontare){
        for(ContoCorrente conto:conti){
            if(conto.getIdConto() == idConto){
                conto.setSaldo(conto.getSaldo() + ammontare);
                return true;
            }
        }
        return false;
    }
    
    public boolean faiPrelievo(int idConto, double ammontare){
        for(ContoCorrente conto:conti){
            if(conto.getIdConto() == idConto && conto.getSaldo() >= ammontare){
                conto.setSaldo(conto.getSaldo() - ammontare);
                return true;
            }
        }
        return false;
    }
    
    public boolean faiBonifico(int idContoUscita, int idContoEntrata, double ammontare){
        return faiPrelievo(idContoUscita,ammontare) && faiDeposito(idContoEntrata,ammontare);
    }
    

    public void situazioneBanca(){
        System.out.println("------SITUAZIONE BANCA '"
                +this.getNome()
                +"' Filiale N°"
                +this.getNumFiliale()
                +"------");
        
        for (ContoCorrente conto:conti){
            System.out.println("---Conto N°"
                    +conto.getIdConto()
                    +" intestato a "
                    +conto.getIntestatario().getNome()
                    +" "
                    +conto.getIntestatario().getCognome()
                    +" saldo attuale: "
                    +conto.getSaldo()
                    +"€---"
            );
        }
    }
}


/*
La Banca offre i seguenti metodi:
  void addContoCorrente(ContoCorrente).
  boolean removeContoCorrente(idConto).
  ContoCorrente getContoCorrente(codiceFiscalePersona).
  faiDeposito(idConto, ammontare) 
     [Creare un metodo faiDeposito(ammontare) in ContoCorrente]
  faiPrelievo(idConto, ammontare)
     [Creare un metodo faiPrelievo(ammontare) in ContoCorrente]
  faiBonifico(idConto1, idConto2, ammontare)
*/