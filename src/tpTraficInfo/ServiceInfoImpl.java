package tpTraficInfo;

import java.util.HashMap;
import java.rmi.Remote;
import java.rmi.RemoteException;

public class ServiceInfoImpl implements ServiceInfo, Remote
{
	private static final HashMap<Abonne, Boolean> listeAbonnes;
	
	private static final String[] nomsAbonnes = {"Abonne1", "Abonne2", "Abonne3", "Abonne4", "Abonne5"};
	
	private static int compteur = 0;

	static
	{
		listeAbonnes = new HashMap<Abonne,Boolean>();
	}

	public void abonner(Abonne a){
		boolean estAbonne=false;
		
		if (!listeAbonnes.containsKey(a))
		{
			listeAbonnes.put(a,true);
		}else{
			estAbonne = listeAbonnes.get(a);
			if(estAbonne==false){
				listeAbonnes.replace(a, true);
			}else{
				listeAbonnes.replace(a, false);
			}
		}
		System.out.println("requete " + (compteur++) + " : abonner()");
	}
	
	public void desabonner(Abonne a){
		boolean estAbonne=false;
		
		if (!listeAbonnes.containsKey(a))
		{
			listeAbonnes.put(a,false);
		}else{
			estAbonne = listeAbonnes.get(a);
			if(estAbonne==true){
				listeAbonnes.replace(a, false);
			}
		}
		System.out.println("requete " + (compteur++) + " : desabonner()");
	}
}
