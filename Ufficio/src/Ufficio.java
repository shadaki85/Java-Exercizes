
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ufficio
{
    private ArrayList<Impiegato>impiegati;

    public ArrayList<Impiegato> getImpiegati() {
        return impiegati;
    }

    public void setImpiegati(ArrayList<Impiegato> impiegati) {
        this.impiegati = impiegati;
    }
    
    
    public boolean licenzia(String nome)
    {
        if (ricerca(nome))
        {
            /*for(Iterator it=c.iterator(); it.hasNext(); )
                if (!cond(it.next()))
                    it.remove();*/
            
            for(Impiegato impiegato : impiegati)
            {
                if(impiegato.getName().equals(nome))
                {
                    impiegati.remove(impiegato);
                    System.out.println("Impiegato "+impiegato.getName()+" licenziato!");
                    return true;
                }
            }
        }
        else
        {
            System.out.println("Impiegato non trovato!");
        }
        return false;
    }
    public void stampaUfficio(){
            System.out.println("--------LISTA DIPENDENTI---------");
            for (Impiegato impiegato : impiegati){
                    System.out.println("-----------------");
                    System.out.println("Nome: "+impiegato.getName());
                    System.out.println("Cognome: "+impiegato.getSurname());
                    System.out.println("Stipendio: "+impiegato.getStipendio());
                    System.out.println("-----------------");
            }
    }

    public boolean ricerca(String name){
            for (Impiegato impiegato : impiegati)
            {
                    if (impiegato.getName().equals(name))
                    {
                            return true;
                    }
            }
            return false;
    }

    public String aumenta (int importo, String name)
    {
            String result = "Impiegato '"+name+"' non trovato!";
            for(Impiegato impiegato:impiegati)
            {
                if (ricerca(name))
                {
                    int vecchioStipendio = impiegato.getStipendio();
                    int nuovoStipendio = impiegato.aumentaStipendio(importo);
                    result = "Stipendio di "+impiegato.getName()+" aumentato! Era: "+vecchioStipendio+" ora è: "+nuovoStipendio;
                }            
            }
            return result;
    }

    public static void main(String[] args)
    {
            Scanner tast=new Scanner(System.in);
            Impiegato imp1 = new Impiegato("Paolino","Paperino",3000);
            Impiegato imp2 = new Impiegato("Mickey","Mouse",2000);
            Impiegato imp3 = new Impiegato("Goofy","Goofer",1500);	

            ArrayList<Impiegato> engim = new ArrayList<>();
            engim.add(imp1);
            engim.add(imp2);
            engim.add(imp3);
            
            Ufficio ufficio = new Ufficio();
            
            ufficio.setImpiegati(engim);
            ufficio.stampaUfficio();
            System.out.println("Chi vuoi licenziare?");
            String daLicenziare =tast.next();
            ufficio.licenzia(daLicenziare);
            ufficio.stampaUfficio();
            
            

            System.out.println("Dammi il nome del dipendente e di quanto vuoi aumentare il suo stipendio");
            System.out.println("Nome:");
            String nome =tast.next();
            System.out.println("Aumento: ");
            int aumento=tast.nextInt();

            System.out.println(ufficio.aumenta(aumento,nome));
            
    }

}


/*
2. Classe Ufficio che abbia: come unico attributo un array di
impiegati, un costruttore che prenda in input un array di tipo
Impiegato, un metodo getNomeImpiegato che restituisca il nome
dell'impiegato in posizione i passata come parametro, un metodo
getStipendioImpiegato analogo al precedente, un metodo
stampaUfficio che stampi a video tutti gli impiegati con i relativi
stipendi, 
* un metodo ricerca che dato il nome di un impiegato ne
restituisca la posizione nell'array,
*  un metodo aumenta che dati
posizione dell'impiegato nell'array e importo aumenti lo stipendio
correttamente.
*/
