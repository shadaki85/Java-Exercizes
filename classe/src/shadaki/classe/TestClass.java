/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shadaki.classe;

import java.util.ArrayList;

/**
 *
 * @author shadaki
 */
public class TestClass {
    public static void main(String[] args) {
    
        Classe engim = new Classe("Engim");
        
        Studente s1 = new Studente("Stefano","Tosetti",35);
        Studente s2 = new Studente("Simona","D'Errico",30);
        Studente s3 = new Studente("Matteo","Candeliere",24);
        Studente s4 = new Studente("Giuseppe","Tarzia",21);
        Studente s5 = new Studente("Michele","Mioli",36);
        Studente s6 = new Studente("Giacomo","Barra",31);
        
        engim.addStudente(s1);
        engim.addStudente(s2);
        engim.addStudente(s3);
        engim.addStudente(s4);
        engim.addStudente(s5);
        engim.addStudente(s6);
        
        System.out.println("Lo studente più vecchio è: "+engim.getPiuVecchio());
        
        if (engim.rimuoviStudente("Barra"))
        {
            System.out.println("Rimosso studente Barra dalla scuola "+engim.getNome());
        }
        
        System.out.println(engim);
        
        for(Studente ordinato:engim.getListaOrdinataStudenti())
        {
            System.out.println(ordinato);
        }
    }
}
