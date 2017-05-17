package exempleProf;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServiceMeteo extends Remote
{
	public int donnerTemperature (String ville) throws RemoteException;
	
	public String donnerConditions (String ville) throws RemoteException;
	
	public String[] listerVilles () throws RemoteException;
}
