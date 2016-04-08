/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubrica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Rubrica 
{
    private String nome;
    private List<Contatto> contatti;
    private Map<String,Contatto> mappa;
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Contatto> getContatti() {
        return contatti;
    }

    public void setContatti(List<Contatto> contatti) {
        this.contatti = contatti;
    }

    public Rubrica(String nome) {
        this.nome = nome;
        this.contatti = new ArrayList<>();
        this.mappa = new HashMap<>();
    }
    
    @Override
    public String toString(){
        String stampa= "'"
                +this.getNome()
                +"' contiene "
                +this.getContatti().size()
                +" contatti:\n"
        ;
        for(Contatto c:contatti)
        {
            stampa = stampa +contatti.indexOf(c)+")"+ c +"\n";
        }
        return stampa;
    }
    
    public boolean addContatto(Contatto c)
    {
        Iterator<Contatto> it = contatti.iterator();
        boolean added = false;
        if(contatti.isEmpty())
        {
            contatti.add(c);
            mappa.put(c.getCognome(), c);
            added=true;
        }
            while(it.hasNext() && !added)
            {
                Contatto cont = it.next();
                if(!cont.confrontaCampi(c.getNome(),c.getCognome(),c.getTelefono(),c.getTelefono()))
                {
                    
                    int posizione=cont.compareTo(c);
                    if (posizione > 0)
                    {
                        System.out.println("posizione maggior di 0, "+cont.getCognome()+" viene dopo "+c.getCognome());
                        contatti.add(contatti.indexOf(cont),c);
                        added = true;
                    }                   
                    //Collections.sort(contatti);                   
                }
                
            }
            if(!added){
                System.out.println(c.getCognome()+" è da aggiungere per ultimo");
                contatti.add(c);
                added=true;
            }
            mappa.put(c.getCognome(), c);
        return added;
    }
    
    public Contatto getContatto(int pos)
    {
        return contatti.get(pos);     
    }
    
    public boolean removeContatto(int pos)
    {
        boolean rimosso = false;
        if(contatti.remove(pos) != null)
        {           
            rimosso = true;
        }
        
        return rimosso;
    }
    
    public List<Contatto> getShuffleLista()
    {
        Collections.shuffle(contatti);
        return contatti;
    }
    
    public Contatto getContactByCognome(String cognome){
        if(mappa.containsKey(cognome))
        {
            return mappa.get(cognome);
        }
        return null;
    }
}

/*
METODI
 - Un costruttore che crea una rubrica con lista vuota
 - add(Contatto contatto)
 - getContatto(int posizione)
 - removeContact(int posizione)
      (restituisce false se non ha trovato il contatto)
 - getShuffleLista()
      restituisce una nuova lista ordinata a caso della rubrica
PARTE 2
Mantenere una Map che associa il cognome di un contatto con il Contatto corrispondente e implementare
 - getContactByCognome(String cognome)
*/