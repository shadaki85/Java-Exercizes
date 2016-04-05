package shadaki.classe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


public class Classe {
    private String nome;
    private List<Studente> studenti = new ArrayList<>();

    public Classe(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Studente> getStudenti() {
        return studenti;
    }

    public void setStudenti(List<Studente> studenti) {
        this.studenti = studenti;
    }
    
    public void addStudente(Studente studente){
            if(!this.esisteStudente(studente.getCognome()))
            {
                this.studenti.add(studente);
                System.out.println("Studente "
                        +studente.getNome()
                        +" "
                        +studente.getCognome()
                        +" aggiunto alla scuola "+this.getNome());
            }
            else
            {
                System.out.println("Errore! Studente già inserito!");
            }

    }
    
    public boolean esisteStudente(String cognome){
        for(Studente studente:studenti)
        {
            if(studente.getCognome().equals(cognome))
            {
                return true;
            }
        }
        return false;
    }
    
    public int sommaAnni(){
        int somma = 0;
        for(Studente studente:studenti)
        {
            somma = somma+studente.getEta();
        }
    return somma;
    }
    
    public Studente getPiuVecchio(){
        Studente piuVecchio = new Studente("","",0);
        for(Studente studente:studenti)
        {
            if (studente.getEta() >= piuVecchio.getEta())
            {
                piuVecchio = studente;
            }
        }
        
        return piuVecchio;
    }
    
    public boolean rimuoviStudente(String cognome){
        Iterator<Studente> it = studenti.iterator();
        while (it.hasNext())
        {
            if(it.next().getCognome().equals(cognome))
            {
                it.remove();
                return true;
            }
        }
        return false;
    }
    
    @Override
    public String toString(){
        String scuola="-----Scuola "+this.getNome()+"-----\n";
        String stampa = "";
        int i = 1;
        for(Studente studente:studenti)
        {
            stampa=stampa+"\n"+i+") "+studente;
            i++;
        }
        return scuola+stampa;
    }
    
    public List<Studente> getListaOrdinataStudenti(){        
        Collections.sort(studenti);
        return studenti;
    }
}

/*
Definire i metodi:
- void addStudente(...)     che aggiunge uno studente alla classe
- boolean esisteStudente(cognome)  che preso come parametro il cognome restituisca true se lo studente appartiene alla classe false altrimenti.
- int sommaAnni()  che restituisce il l'età complessiva di tutti gli studenti 
- Studente getVecchio()    che restituisce lo studente più vecchio della classe
- boolean rimuoviStudente(cognome)  che rimuova lo studente avente come cognome il parametro e restituisca false se non c'è.
- toString per poter stampare l'intera classe 

Esercizio Bonus

si definisce uno studente maggiore di un altro in base all'età (Comparable) 
definire un metodo List<Studente> getListaOrdinataStudenti() che restituisca in output la lista ordinata degli studenti (Meglio se la lista originaria rimane nell'ordine iniziale)
*/