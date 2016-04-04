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
public class SocioProf extends SocioEngim{
    private String indirizzo;

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public SocioProf(String indirizzo, int oreLezione, String nome, String cognome, int annoNascita) {
        super(oreLezione, nome, cognome, annoNascita);
        this.indirizzo = indirizzo;
    }
    
    public String toString(){
        return super.toString()
                +"\nIndirizzo: "
                +this.getIndirizzo();
    }
    
}


/*
- Un SocioProf e' un SocioEngim che in piu' ha:
   - un inidirizzo postale (non mail) a cui i SociEngim possono
      mandare i propri regali.
*/
