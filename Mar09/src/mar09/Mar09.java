/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mar09;

import java.util.ArrayList;

/**
 *
 * @author svilupposw
 */
public class Mar09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> rubrica = new ArrayList();
        rubrica.add("Stefano Tosetti 3645184877");
        //rubrica.add(123);
        String voce = rubrica.get(0);
        ArrayList<ArrayList> souble = new ArrayList<>();
        souble.add(rubrica);
        ArrayList<String> rubric = souble.get(0);
        for (String val:rubric)
        System.out.println(val);
        
        ArrayList<Documento> docs = new ArrayList<>();
        docs.add(new Fattura());
        docs.add(new Preventivo());
        docs.add(new Fattura());
        docs.add(new Ddt());
        
        ContenitoreGenerico<Fattura> cg = new ContenitoreGenerico<>();
        cg.setContenuto(new Fattura());
        Fattura vocez = cg.getContenuto();
        
        Class descriviDdt = Ddt.class;
        
    }
    
}
