/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubrica;

/**
 *
 * @author svilupposw
 */
public class TestClass 
{
    public static void main(String[] args) 
    {
        Contatto c6 = new Contatto("Stefano","Tamburo","stefano@tosetti.it","1234567");
        Contatto c1 = new Contatto("Stefano","Tosetti","stefano@tosetti.it","1234567");
        Contatto c2 = new Contatto("Matteo","Candeliere","matteo@candeliere.it","7654321");
        Contatto c3 = new Contatto("Dario","Genoese","dario@genoese.it","45632112");
        Contatto c4 = new Contatto("Silvio","Berlusconi","silvio@bungabunga.it","98463214");
        Contatto c5 = new Contatto("Marco","Trota","","");
        Contatto c7 = new Contatto("Stefano","Affanculo","stefano@tosetti.it","1234567");
        
        Rubrica r = new Rubrica("La mia Rubrica Segretissima");
        r.addContatto(c1);
        r.addContatto(c2);
        r.addContatto(c3);
        r.addContatto(c4);
        r.addContatto(c5);
        r.addContatto(c6);
        r.addContatto(c7);
        System.out.println("-------------STAMPO LA NUOVA RUBRICA------------");
        System.out.println(r);
        
        System.out.println("-------------RIMUOVO DALLA RUBRICA------------");
        if(r.removeContatto(3))
        {
            System.out.println("Rimosso il contatto in INDICE 3 dalla rubrica");
        }
        System.out.println(r);
        
        System.out.println("-------------MESCOLO LA RUBRICA------------");
        r.getShuffleLista();
        System.out.println(r);
        System.out.println("-------------RICERCA NELLA RUBRICA------------");
        Contatto ricerca = r.getContactByCognome("Candeliere");
        if(ricerca != null)
        {
            System.out.println("Ho trovato il contatto con cognome 'Candeliere':\n"+ricerca);
        }
        
        System.out.println("-------------TEST------------");
        System.out.println(c1.compareTo(c3));
        

    }
}
