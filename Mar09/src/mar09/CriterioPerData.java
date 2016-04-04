package mar09;


public class CriterioPerData implements Confrontabile {
	@Override
	public int confronta(Object o1, Object o2)
	{
		Documento d1 = (Documento)o1;
		Documento d2 = (Documento)o2;
		return d1.getDataEmissione().compareTo(d2.getDataEmissione());
	}
}
