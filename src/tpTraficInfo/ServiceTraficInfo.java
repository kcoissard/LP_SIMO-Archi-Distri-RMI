package tpTraficInfo;

import java.util.HashMap;
import java.rmi.RemoteException;

public class TraficInfoImpl implements TraficInfo
{
	
	
	
	/*
	private static final HashMap<String,String> conditions;
	
	private static final HashMap<String,Integer> temperatures;
	
	private static final String[] villes = {"Grenoble", "Lyon", "Lille", "Paris", "Brest"};
	
	private static int compteur = 0;

	static
	{
		conditions = new HashMap<String,String>();
		conditions.put("Grenoble","soleil");
		conditions.put("Lille","pluie");
		conditions.put("Paris","nuages");
		conditions.put("Brest","vent");
		conditions.put("Lyon","eclaircies");

		temperatures = new HashMap<String,Integer>();
		temperatures.put("Grenoble", 25);
		temperatures.put("Lille", 12);
		temperatures.put("Paris", 20);
		temperatures.put("Brest", 18);
		temperatures.put("Lyon", 22);  
	}

	public int donnerTemperature(String ville) throws RemoteException
	{
		int temperature = 0;
		if (temperatures.containsKey(ville))
		{
			temperature = temperatures.get(ville);
		}
		System.out.println("requete " + (compteur++) + " : donnerTemperature()");
		return temperature;
	}

	public String donnerConditions(String ville) throws RemoteException
	{
		String condition = null;
		if (conditions.containsKey(ville))
		{
			condition = conditions.get(ville);
		}
		System.out.println("requete " + (compteur++) + " : donnerConditions()");
		return condition; 
	}

	public String[] listerVilles() throws RemoteException
	{
		System.out.println("requete " + (compteur++) + " : listerVilles()");
		return villes;
	}
	*/
}
