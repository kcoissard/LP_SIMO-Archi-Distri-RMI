package tpTraficInfo;

import java.util.HashMap;
import java.rmi.Remote;
import java.rmi.RemoteException;

public class ServiceInfoImpl extends Thread implements ServiceInfo
{
	private static final HashMap<Abonne, Boolean> listeAbonnes;
	
	private static final String[] nomsAbonnes = {"Abonne1", "Abonne2", "Abonne3", "Abonne4", "Abonne5"};
	
	private static int compteur = 0;

	static
	{
		listeAbonnes = new HashMap<Abonne,Boolean>();
	}

	public void abonner(Abonne a){
		System.out.println("DEBUT --- requete " + (compteur++) + " : abonner()");
		
		boolean estAbonne=false;
		
		//si l'abonné n'éxiste pas on l'ajout à la liste et on l'abonne
		if (!listeAbonnes.containsKey(a))
		{
			listeAbonnes.put(a,true);
			System.out.println("Création de l'abonné et abonnement");
		//sinon on remplace son abonnement par true
		}else{
			estAbonne = listeAbonnes.get(a);
			if(estAbonne==false){
				listeAbonnes.replace(a, true);
				System.out.println("Abonnement reussi");
			}else{
				listeAbonnes.replace(a, false);
				System.out.println("Desabonnement (deja abonne)");
			}
		}
		System.out.println("FIN --- requete " + (compteur) + " : abonner()");
	}
	
	public void desabonner(Abonne a){
		System.out.println("DEBUT --- requete " + (compteur++) + " : desabonner()");
		boolean estAbonne=false;
		
		if (!listeAbonnes.containsKey(a))
		{
			listeAbonnes.put(a,false);
			System.out.println("Ajout a la liste en mode desabonne");
		}else{
			estAbonne = listeAbonnes.get(a);
			if(estAbonne==true){
				listeAbonnes.replace(a, false);
				System.out.println("Desabonnement reussi");
			}else{
				System.out.println("Personne deja desabonne");
			}
		}
		System.out.println("FIN --- requete " + (compteur) + " : desabonner()");
	}
}
