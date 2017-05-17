package tpTraficInfo;

import java.rmi.RemoteException;

public interface ServiceInfo
{
	
	/*
	La premi�re m�thode permet � un voyageur de s�abonner s�il n�est pas d�j� enregistr� aupr�s
	du service. 
	La seconde m�thode permet � un voyageur de se d�sabonner s�il est enregistr�
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
