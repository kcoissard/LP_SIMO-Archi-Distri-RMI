package exempleProf;

import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

public class ClientMeteo
{
	public static void main(String args[]) throws Exception
	{
		System.setProperty("java.rmi.server.hostname", "localhost");

		Registry registry = LocateRegistry.getRegistry("localhost", 3000);
		ServiceMeteo service = (ServiceMeteo) registry.lookup("ServiceMeteo");

		String[] villes = service.listerVilles();  
		for(int i = 0; i < villes.length; i++)
		{
			System.out.println("Meteo a " + villes[i]);
			System.out.println("  temperature : " + service.donnerTemperature(villes[i]));
			System.out.println("  conditions  : " + service.donnerConditions(villes[i]));
		}  
	}    
}
