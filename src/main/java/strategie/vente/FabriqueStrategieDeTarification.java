package strategie.vente;

import java.lang.reflect.InvocationTargetException;

public class FabriqueStrategieDeTarification {
	
	private static FabriqueStrategieDeTarification instance;
	
	public FabriqueStrategieDeTarification() {
		
	}
	
	public static FabriqueStrategieDeTarification getInstance() {
		if (instance == null)
			instance = new FabriqueStrategieDeTarification();
		return instance;
				
	}
	
	
	public IstrategieTarification getStrategieTarification () {
		String nomDeClasse = System.getProperty("strategietatification.class.name");
		IstrategieTarification strategie = null;
			try {
				strategie = (IstrategieTarification) Class.forName(nomDeClasse).getDeclaredConstructor().newInstance();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return strategie;
	}
	
	
	

}
