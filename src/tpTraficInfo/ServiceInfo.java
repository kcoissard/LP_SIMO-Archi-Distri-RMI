package tpTraficInfo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServiceInfo extends Remote
{
	
	/*
	La première méthode permet à un voyageur de s’abonner s’il n’est pas déjà enregistré auprès
	du service. 
	La seconde méthode permet à un voyageur de se désabonner s’il est enregistré
	*/

	public default void abonner(Abonne a){
		System.out.println("Utilisation de la méthode abonner de l'interface ServiceInfo :");
	}
	public default void desabonner(Abonne a){
		System.out.println("Utilisation de la méthode desabonner de l'interface ServiceInfo :");
	}
	
	
	/*
	public int donnerTemperature (String ville) throws RemoteException;
	
	public String donnerConditions (String ville) throws RemoteException;
	
	public String[] listerVilles () throws RemoteException;
	*/
}
