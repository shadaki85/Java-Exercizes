/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio_conn_db;

public class TestingClass {
    
    public static void main(String[] args)
    {
        Regione piemonte = new Regione("Piemonte");
            
        
            System.out.println("La regione "+piemonte.getNome()+" (id "+piemonte.getId()+") contiene "+piemonte.getProvince().length+" province:");
            int i=1;
            for(Provincia provincia : piemonte.getProvince())
            {
                System.out.println("Provincia "
                        +i
                        +": "
                        +provincia.getNome()
                        +" con "
                        +provincia.getComuni()
                        +" comuni, superficie di "
                        +provincia.getSuperficie()
                        +" m2, "
                        +provincia.getAbitanti()
                        +" abitanti e con sigla "
                        + provincia.getSigla()
                );
                i++;
            }
    }
    
}
