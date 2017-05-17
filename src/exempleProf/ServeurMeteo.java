package exempleProf;

import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class ServeurMeteo
{
	public static void main(String [] args) throws Exception
	{
		System.setProperty("java.rmi.server.hostname", "localhost");

		ServiceMeteoImpl service = new ServiceMeteoImpl();
		ServiceMeteo stub = (ServiceMeteo) UnicastRemoteObject.exportObject(service, 0);

		Registry registry = LocateRegistry.createRegistry(3000);  
		registry.bind("ServiceMeteo", stub);

		System.out.println("Service enregistre");
		
		Thread.sleep(Long.MAX_VALUE);
	}
}
