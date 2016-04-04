package mar09;

import java.util.Date;


public class Mar03 {

	public static void ordina(int [] arrToOrder){
		
		System.out.println("Prima:");
		for (int i=0;i<arrToOrder.length;i++){
			System.out.println("Elem "+i+": "+arrToOrder[i]);
		}
		
		boolean ordered = false;
		while(!ordered){
			ordered = true;
			for (int i=0;i<(arrToOrder.length-1);i++){
				if(arrToOrder[i] > (arrToOrder[i+1])){
					int tmp = arrToOrder[i];
					arrToOrder[i] = arrToOrder[i+1];
					arrToOrder[i+1] = tmp;
					ordered = false;
				}
			}
		}
		
		System.out.println("Dopo:");
		for (int i=0;i<arrToOrder.length;i++){
			System.out.println("Elem "+i+": "+arrToOrder[i]);
			
		}
	}
	
	public static void ordina(Object[] arrToOrder, Confrontabile c)
	{			
		boolean ordered = false;
		while(!ordered){
			ordered = true;
			for (int i=0;i<(arrToOrder.length-1);i++){
				if(c.confronta(arrToOrder[i],arrToOrder[i+1]) > 0){
				//if(arrToOrder[i].getDataEmissione().compareTo(arrToOrder[i+1].getDataEmissione()) > 0){
					Object tmp = arrToOrder[i];
					arrToOrder[i] = arrToOrder[i+1];
					arrToOrder[i+1] = tmp;
					ordered = false;
				}
			}
		}
	}
	public static void main(String[] args) {
		int [] temp = {7,14,18,29,22,21,19,15};
		
		//ordina(temp);
		
		Documento[] docs = {
				new Fattura(),
				new Fattura(),
				new Preventivo(),
				new Ddt()
		};
		
		int i=1;		
		for(Documento doc: docs)
		{
			doc.setIndirizzo("indirizzo "+i);
			doc.setDataEmissione(new Date(73567357*(-i)));
			doc.setNome("nome "+i);
			doc.stampa();
			i++;
		}
		//CriterioPerNumero cpn = new CriterioPerNumero();
		//CriterioPerData cpd = new CriterioPerData();
		//ordina(docs,cpd);
		ordina(docs,new Confrontabile() {
			
			@Override
			public int confronta(Object o1, Object o2) {
				Documento d1 = (Documento)o1;
				Documento d2 = (Documento)o2;
				return d1.getDataEmissione().compareTo(d2.getDataEmissione());
			}
		});
		for(Documento doc: docs)
		{
			doc.stampa();
		}
	}	
}
