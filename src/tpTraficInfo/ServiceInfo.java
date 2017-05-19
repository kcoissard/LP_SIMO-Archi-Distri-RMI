package tpTraficInfo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServiceInfo extends Remote
{
	
	/*
	La premi�re m�thode permet � un voyageur de s�abonner s�il n�est pas d�j� enregistr� aupr�s
	du service. 
	La seconde m�thode permet � un voyageur de se d�sabonner s�il est enregistr�
	*/

	public default void abonner(Abonne a){
		System.out.println("Utilisation de la m�thode abonner de l'interface ServiceInfo :");
	}
	public default void desabonner(Abonne a){
		System.out.println("Utilisation de la m�thode desabonner de l'interface ServiceInfo :");
	}
	
	
	/*
	public int donnerTemperature (String ville) throws RemoteException;
	
	public String donnerConditions (String ville) throws RemoteException;
	
	public String[] listerVilles () throws RemoteException;
	*/
}
