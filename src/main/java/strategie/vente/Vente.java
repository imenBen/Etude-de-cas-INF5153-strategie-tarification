package strategie.vente;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Vente {
	
	private Date date;
	private List<LigneCommande> commande = new ArrayList<LigneCommande>();
	
	private IstrategieTarification strategieTarification = FabriqueStrategieDeTarification.getInstance()
			.getStrategieTarification();
	
	public Vente() {
		super();
		date = new Date();
	}
	
	public double getTotal() {
		
		return commande.stream()
				.mapToDouble( x -> x.getprix())
				.sum();
		
	}

	public Date getDate() {
		return date;
	}

	public IstrategieTarification getStrategieTarification() {
		return strategieTarification;
	}
	
	public void ajouterLigneCommande( LigneCommande ligne) {
		commande.add(ligne);
	}
	
	
	
}
