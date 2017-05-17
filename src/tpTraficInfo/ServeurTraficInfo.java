package tpTraficInfo;

import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class ServeurTraficInfo
{
	public static void main(String [] args) throws Exception
	{
		System.setProperty("java.rmi.server.hostname", "localhost");

		ServiceInfoImpl service = new ServiceInfoImpl();
		ServiceInfo stub = (ServiceInfo) UnicastRemoteObject.exportObject(service, 0);

		Registry registry = LocateRegistry.createRegistry(3000);  
		registry.bind("ServiceMeteo", stub);

		System.out.println("Service enregistre");
		
		Thread.sleep(Long.MAX_VALUE);
	}
}
