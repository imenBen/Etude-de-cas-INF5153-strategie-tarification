import strategie.vente.LigneCommande;
import strategie.vente.Produit;
import strategie.vente.StrategiePourcentageRemise;
import strategie.vente.Vente;

public class Main {

    public static void main(String[] args) throws Exception{
    	
    	System.setProperty("strategietatification.class.name", "strategie.vente.StrategiePourcentageRemise");
    	
    	
    	
    	
    	Produit p1 = new Produit("produit1", 10);
    	Produit p2 = new Produit("produit2", 20);
    	
    	LigneCommande ligne1 = new LigneCommande(p1, 4);
    	LigneCommande ligne2 = new LigneCommande(p2, 5);
    	
    	Vente vente = new Vente();
    	
    	vente.ajouterLigneCommande(ligne1);
    	vente.ajouterLigneCommande(ligne2);
    	
    	
    	System.out.println("prix total est :" + vente.getTotal());
    	
    	((StrategiePourcentageRemise)(vente.getStrategieTarification())).setPourcentage(10);
    	
    	System.out.println("prix après application de la remise :" + vente.getStrategieTarification().getTotal(vente));
    	
       
    }


}
