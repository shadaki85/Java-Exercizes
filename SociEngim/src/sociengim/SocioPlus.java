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
public class SocioPlus extends SocioEngim {
    
    private String email;

    public String getEmail() {
        return email;
    }
    
    @Override
    public int getCrediti() {
        return oreLezione*10;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }    

    public SocioPlus(String email,int oreLezione, String nome, String cognome, int annoNascita) {
        super(oreLezione, nome, cognome, annoNascita);
        this.email = email;
        
    }
    
    @Override
    public String toString(){
        return super.toString()
                +"\nEmail:"
                +this.getEmail();
    }
    
}


/*
- Un SocioPlus e' un SocioEngim che ha in piu'
   - un indirizzo mail a sua disposizione
   - e che per ogni ora di lezione accumula 10 punti anziche' 5 

*/