/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sociengim;

/**
 *
 * @author svilupposw
 */
public class SocioEngim extends Persona{
    
    private int numTessera;
    int oreLezione;
    private static int c = 1;

    public int getNumTessera() {
        return numTessera;
    }

    public int getCrediti() {
        return oreLezione*5;
    }

    public void setOreLezione(int oreLezione) {
        this.oreLezione = oreLezione;
    }

    public int getOreLezione() {
        return oreLezione;
    }
    
    @Override
    public String toString(){
        return "Nome: "
                +this.getNome()
                +"\nCognome: "
                +this.getCognome()
                +"\nAnno di nascita: "
                +this.getAnnoNascita()
                +"\nNumero Tessera: "
                +this.numTessera
                +"\nOre lezione: "
                +this.getOreLezione()
                +"\nCrediti: "
                +this.getCrediti();
    }
    
    public SocioEngim(int oreLezione, String nome, String cognome, int annoNascita) {
        super(nome, cognome, annoNascita);
        this.numTessera = c++;
        this.oreLezione = oreLezione;
    }
       
    public void addOreLezione(int numOre)
    {
        oreLezione = oreLezione + numOre;
    } 
    
    public void addLezioneStandard()
    {
        oreLezione = oreLezione + 4;
    }
}


/*
- public void addOreLezione(int numOre);
- public void addLezioneStandard() 
    [che aggiunge 4 ore di lezione standard]


- Un SocioEngim e' una persona che in piu' ha:
   - un numero di tessera engim
   - dei crediti che accumula per ogni ora di lezione (ogni
     ora di lezione equivale a 5 crediti)
*/