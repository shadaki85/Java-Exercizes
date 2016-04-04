package banca;

import java.util.ArrayList;

public class TestingClass {
    
    public static void main(String[] args) {
        Persona p1 = new Persona("Stefano","Tosetti","STEFANOTOSETTI");
        Persona p2 = new Persona("Simona","D'Errico","SIMONADERRICO");
        Persona p3 = new Persona("Michele","Mioli","MICHELEMIOLI");
        Persona p4 = new Persona("Matteo","Candeliere","MATTEOCANDELIERE");
        Persona p5 = new Persona("Mattia","Bosso","MATTIABOSSO");
        
        ContoCorrente cc1 = new ContoCorrente(001,p1,500.0);
        ContoCorrente cc2 = new ContoCorrente(002,p2,200.0);
        ContoCorrente cc3 = new ContoCorrente(003,p3,345.0);
        ContoCorrente cc4 = new ContoCorrente(004,p4,650.0);
        ContoCorrente cc5 = new ContoCorrente(005,p5,0.0);
        ContoCorrente cc6 = new ContoCorrente(006,p1,-400.0);
        
        ArrayList<ContoCorrente> conti = new ArrayList<>();
        conti.add(cc1);
        conti.add(cc2);
        conti.add(cc3);
        conti.add(cc4);
        conti.add(cc5);
        
        Banca banca = new Banca("Ing Direct",30,conti);
        
        banca.situazioneBanca();
        
        System.out.println("-----TEST AGGIUNTA/RIMOZIONE CONTI-----");
        
        
        banca.addContoCorrente(cc6);
        
        if(banca.removeContoCorrente(005))
        {
            System.out.println("Conto N°5 rimosso dalla banca");
        }
        else
        {
            System.out.println("Errore!");
        }
        
        banca.addContoCorrente(cc5);
        
        ContoCorrente test = banca.getContoCorrente("MICHELEMIOLI");
        if(test != null)
        {
            System.out.println("il conto corrente è intestato a: "+test.getIntestatario().getNome()+" "+test.getIntestatario().getCognome());
        }
        
        banca.situazioneBanca();
        
        System.out.println("----- TEST SPOSTAMENTO $$ -----");
        
        if(banca.faiDeposito(006,450.02)){
            System.out.println("Aggiunti 450€ al conto N°6");
        }
        else
        {
            System.out.println("Errore con il deposito!");
        }
        
        if(banca.faiPrelievo(004,150.0)){
            System.out.println("Prelevati 150€ dal conto N°4");
        }
        else
        {
            System.out.println("Errore con il prelievo!");
        }
                
        if(banca.faiBonifico(1,3,150.0)){
            System.out.println("Spostati 150€ dal conto N°1 al conto N°3");
        }
        else
        {
            System.out.println("Errore con il Bonifico!");
        }
        
        banca.situazioneBanca();
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