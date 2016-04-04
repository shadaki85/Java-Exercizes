package sociengim;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AssociatiEngim {

    private static SocioPremium getSocioPuntiMensaMax(SocioEngim[] listaSoci)
    {
        List<SocioPremium> listaSoloSociPremium = new ArrayList<>();
        for (SocioEngim socio: listaSoci)
        {
            if (socio.getClass() == SocioPremium.class)
            {
                listaSoloSociPremium.add((SocioPremium) socio);             
            }            
        }
        
        SocioPremium[] soloPremium = new SocioPremium[listaSoloSociPremium.size()];
        soloPremium = listaSoloSociPremium.toArray(soloPremium);
        SocioPremium conPiuPuntiMensa = soloPremium[0];
        for (int i = 0; i<soloPremium.length;i++)
        {
            if(conPiuPuntiMensa.getPuntiMensa() < soloPremium[i].getPuntiMensa())
            {
                conPiuPuntiMensa = soloPremium[i];
            }
        }
        
        return conPiuPuntiMensa;
    }
    
    private static SocioEngim getSocioCreditoMax(SocioEngim[] listaSoci)
    {
        SocioEngim conPiuCrediti = listaSoci[0];
        for(int i=0; i<listaSoci.length;i++)
        {
            if(conPiuCrediti.getCrediti() <= listaSoci[i].getCrediti())
            {
                conPiuCrediti = listaSoci[i];
            }
        }
        return conPiuCrediti;
    }
    
    public static void main(String[] args) {
       
        Scanner t=new Scanner(System.in);
        
        SocioEngim a = new SocioEngim(102,"Michele","Mioli",1980);
        SocioPremium b = new SocioPremium(300,"ciao@atutti.it",25,"Stefano","Tosetti",1985);
        SocioPremium c = new SocioPremium(154,"giacomo@barra.com",45,"Giacomo","Barra",1983);
        SocioPlus d = new SocioPlus("simona@tosetti.it",34,"Simona","Tosetti",1985);
        SocioEngim e = new SocioEngim(230,"Pluto","Goofy",1970);
        SocioPlus f = new SocioPlus("paolino@paperino.com",83,"Paperino","Paolino",1975);
        SocioProf g = new SocioProf("Via della SIAE, 14",28,"Gino","Paoli",1965);
        SocioEngim h = new SocioEngim(230,"Tizio","Caio",1990);
        SocioProf i = new SocioProf("Via dalle palle, 111",60,"Sempronio","Bho",1900);
        
        SocioEngim[] soci = {a,b,c,d,e,f,g,h,i};
        
        for (SocioEngim socio : soci) {       
            System.out.println("--------");
            System.out.println(socio);
            System.out.println("--------");
            System.out.println(socio.getNome()+" ha "+socio.getOreLezione()+" ore di lezione svolte");
            socio.addLezioneStandard();
            System.out.println(socio.getNome()+" ha svolto una lezione standard. Ora ha "+socio.getOreLezione()+" ore di lezione svolte");
            System.out.println("Quante ore di lezione vuoi aggiungere a "+socio.getNome()+"?");
            int numInput = t.nextInt();
            socio.addOreLezione(numInput);
            System.out.println(socio.getNome()+" ha svolto una lezione di "+numInput+" ore. Ora ha "+socio.getOreLezione()+" ore di lezione svolte");
        }
        System.out.println("--------");
        System.out.println("--------");
        SocioPremium piuPuntiMensa = getSocioPuntiMensaMax(soci);
        getSocioPuntiMensaMax(soci);
        System.out.println("Il socio Premium con più punti mensa è "+piuPuntiMensa.getNome()+" con "+piuPuntiMensa.getPuntiMensa()+" punti mensa");
        System.out.println("--------");
        System.out.println("--------");
        SocioEngim piuCrediti = getSocioCreditoMax(soci);
        System.out.println("Il socio con più crediti è "+piuCrediti.getNome()+" con "+piuCrediti.getCrediti()+" crediti");
        
    }
    
}

/*
OPZIONALI
 - calcola chi ha accumulato pi� credito, usando il metodo
    private static SocioEngim getSocioCreditoMax(SocioEngim[] listaSoci) 
    [in caso di parimerito prendere il primo]

 - verifica chi fra i soci ha pi� puntiMensa e ne stampa lo stato.
    definire ed usare il seguente metodo:
    private static SocioPremium getSocioPuntiMensaMax(SocioEngim[] listaSoci) 
        [in caso di parimerito prendere l'utimo] 


*/