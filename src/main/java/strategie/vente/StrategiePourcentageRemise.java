package strategie.vente;

public class StrategiePourcentageRemise implements IstrategieTarification {
	
	private double pourcentage;

	

	public StrategiePourcentageRemise() {
		super();
		
	}
	
	
	
	
	public double getPourcentage() {
		return pourcentage;
	}

	public void setPourcentage(float pourcentage) {
		this.pourcentage = pourcentage;
	}




	@Override
	public double getTotal(Vente vente) {
		// TODO Auto-generated method stub
		double total = vente.getTotal();
		return total - (total * pourcentage/100);
	}
	
	
	
	
}
