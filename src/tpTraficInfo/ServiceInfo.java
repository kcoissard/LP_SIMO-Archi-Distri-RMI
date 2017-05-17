package tpTraficInfo;

import java.rmi.RemoteException;

public interface ServiceInfo
{
	
	/*
	La première méthode permet à un voyageur de s’abonner s’il n’est pas déjà enregistré auprès
	du service. 
	La seconde méthode permet à un voyageur de se désabonner s’il est enregistré
	*/

	public default void abonner(Abonne a){
		
	}
	public default void desabonner(Abonne a){
		
	}
	
	
	/*
	public int donnerTemperature (String ville) throws RemoteException;
	
	public String donnerConditions (String ville) throws RemoteException;
	
	public String[] listerVilles () throws RemoteException;
	*/
}
