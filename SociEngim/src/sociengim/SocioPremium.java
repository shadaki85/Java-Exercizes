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
public class SocioPremium extends SocioPlus{
    
    private double contoDistributore;    

    public double getContoDistributore() {
        return contoDistributore;
    }

    public void setContoDistributore(double contoDistributore) {
        this.contoDistributore = contoDistributore;
    }
    
    public int getPuntiMensa(){
        return oreLezione;
    }

    public SocioPremium(double contoDistributore, String email, int oreLezione, String nome, String cognome, int annoNascita) {
        super(email, oreLezione, nome, cognome, annoNascita);
        this.contoDistributore = contoDistributore;
    }
    
    @Override
    public String toString()
    {
        return super.toString()
                +"\nConto: "
                +this.getContoDistributore()
                +"\nPunti Mensa: "
                +this.getPuntiMensa();
    }
}


/*
- Un SocioPremium e' un SocioPlus che ha in piu':
   - un conto distributore  (da utilizzare ai distributori caffe' - cibo)
   - e che per ogni ora di lezione guadagna un puntoMensa del
     valore di 1 euro
*/