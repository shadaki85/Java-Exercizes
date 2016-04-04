
package engimmarket;
import java.util.Arrays;

public class EngimMarket {

    private int incasso;
    private int pos = 1;
    private int biciCounter = 0;
    private Vendibile[] sold = new Vendibile[1];
    
    public Vendibile[] getSold() {
        return sold;
    }
   
    
    public void addVenduto(Vendibile item){
        if (item instanceof Scontabile) {
            System.out.println("Hai guadagnato "
                    +item.getPrezzo()+"€ dalla vendita di '"
                    +item.getClassName()+"'! ("
                    +(item.getPrezzo()+( ((Scontabile) item).getSconto() ))
                    +"€ scontati di "+( (Scontabile) item ).getSconto()+"€)");
        } else {
            System.out.println("Hai guadagnato "+item.getPrezzo()+"€ dalla vendita di '"+item.getClassName()+"'!");
        }
        if (item instanceof Bicicletta)
        {
            this.biciCounter++;
        }
        incasso = incasso + item.getPrezzo();       
        sold = Arrays.copyOf(sold, pos);
        sold[pos-1] = item;
        pos++;
    }
    
    public int getIncasso(){
        return incasso;
    }
    
    public Vendibile piuCaro(Vendibile[] lista){
        Arrays.sort(lista);
        return lista[0];
    }
            
    public Vendibile[] ordinaArray(Vendibile[] lista){
        Arrays.sort(lista);
        return lista;
    } 
    
    public static void main(String[] args) {
        Bicicletta bici = new Bicicletta("Qualcuno");
        BiciElettrica biciEl = new BiciElettrica(10,25,"Stefano");
        CD cd = new CD("il mio album","Stefano",1985,10);
        Libro libro = new Libro("Il mio libro","Stefano","SuperEditore",1);
        
        bici.setPrezzo(10);
        bici.setSconto(2);
        biciEl.setPrezzo(30);
        biciEl.setSconto(8);
        cd.setPrezzo(2);
        libro.setPrezzo(5);
        
        EngimMarket market = new EngimMarket();
        
        market.addVenduto(bici);
        market.addVenduto(biciEl);
        market.addVenduto(cd);
        market.addVenduto(libro);
        
        System.out.println("Hai venduto "+ market.getSold().length +" articoli di cui "+market.biciCounter+" biciclette");        
        System.out.println("L'incasso totale fino ad ora è: "+market.getIncasso()+"€");
        
        int count = 1;
        System.out.println("PRIMA");
        for(Vendibile item: market.sold)
        {
            System.out.println("Oggetto "+count+": "+item.getPrezzo()+"€");
            count++;
        }
        count = 1;
        market.ordinaArray(market.getSold());
        System.out.println("DOPO");
        for(Vendibile item: market.getSold())
        {
            System.out.println("Oggetto "+count+": "+item.getPrezzo()+"€");
            count++;
        }
        
        System.out.println("L'oggetto più caro nel market è: "
                +market.piuCaro(market.getSold()).getClassName()
                +" con prezzo pari a "+market.piuCaro(market.getSold()).getPrezzo()+"€"
        );
        boolean a = true;
        int z=0;
        for(boolean i = false;i!=a;)
        {
            if(z==3)
            {
                a=false;
            }
            System.out.println(z);
            z++;
        }
    }
    
}
