package strategie.vente;

public class StrategieRemiseAbsolutAPartirDe  implements IstrategieTarification{

	private double remise;
	private double aPartirDe;
	
	
	public StrategieRemiseAbsolutAPartirDe() {
		super();
		
	}




	@Override
	public double getTotal(Vente vente) {
		double total = vente.getTotal();
		if (total >= aPartirDe)
				return total = total - remise ;
		return total;
	}

	public double getRemise() {
		return remise;
	}


	public void setRemise(double remise) {
		this.remise = remise;
	}




	public double getaPartirDe() {
		return aPartirDe;
	}




	public void setaPartirDe(double aPartirDe) {
		this.aPartirDe = aPartirDe;
	}

		
}
