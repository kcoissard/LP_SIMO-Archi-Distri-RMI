package tpTraficInfo;

import java.rmi.registry.Registry;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class ServeurTraficInfo
{
	public static void main(String [] args) throws Exception
	{
		System.setProperty("java.rmi.server.hostname", "localhost");

		ServiceInfoImpl serviceInfoImpl = new ServiceInfoImpl();
		ServiceInfo stub = (ServiceInfo) UnicastRemoteObject.exportObject(serviceInfoImpl, 0);

		Registry registryServiceInfo = LocateRegistry.createRegistry(2000);
		ServiceInfo serviceInfo = (ServiceInfo) registryServiceInfo.lookup("InfoTrafic");
		//registry.bind("ServiceInfo", stub);

		System.out.println("Service info enregistre");
		
		Thread.sleep(Long.MAX_VALUE);
	}
}
