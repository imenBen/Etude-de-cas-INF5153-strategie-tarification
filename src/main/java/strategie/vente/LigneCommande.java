package strategie.vente;

public class LigneCommande {
	
	private Produit produit;
	private int quantite;
	
	
	public LigneCommande(Produit produit, int quantite) {
		super();
		this.produit = produit;
		this.quantite = quantite;
	}
	
	public double getprix() {
		return produit.getPrix() * quantite;
 	}
	
	

}
