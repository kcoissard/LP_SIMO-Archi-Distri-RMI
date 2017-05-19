package tpTraficInfo;

import java.rmi.registry.Registry;
import java.util.Random;
import java.rmi.registry.LocateRegistry;

public class ClientTraficInfo
{
	public static void main(String args[]) throws Exception
	{
		//Temps de veille aléatoire du Thread
		Random random = new Random();
		int min=3000;
		int max=10000;
		int randomNumber = random.nextInt(max + 1 - min) + min;
		
		
		System.setProperty("java.rmi.server.hostname", "localhost");

		//Tout voyageur (i.e. client du service) doit donc implémenter cette interface
		//pour pouvoir s’abonner au service.
		Registry registryAbonne = LocateRegistry.getRegistry("localhost", 3000);
		Abonne abonne = (Abonne) registryAbonne.lookup("Abonne");
		
		
		//Thread service Info
		Registry registryServiceInfo = LocateRegistry.getRegistry("localhost", 3000);
		ServiceInfo ServiceInfo = (ServiceInfo) registryServiceInfo.lookup("ServiceInfo");
		//action s'abonner
		//action desabo
		//infos 
		
		try {Thread.sleep(randomNumber);} 
		catch(InterruptedException e){}
		
		
		

		/*
		String[] villes = service.listerVilles();  
		for(int i = 0; i < villes.length; i++)
		{
			System.out.println("Meteo a " + villes[i]);
			System.out.println("  temperature : " + service.donnerTemperature(villes[i]));
			System.out.println("  conditions  : " + service.donnerConditions(villes[i]));
		}
		*/
	}    
}
