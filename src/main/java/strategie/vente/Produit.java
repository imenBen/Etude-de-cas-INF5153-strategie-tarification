package strategie.vente;

public class Produit {
	
	private String libelle;
	private double prix;
	
	public Produit(String libelle, double prix) {
		super();
		this.setLibelle(libelle);
		this.setPrix(prix);
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	

}
