package tpTraficInfo;

import java.rmi.Remote;

import tpTraficInfo.InfoTrafic;


public interface Abonne  extends Remote
{
	public static final String ETAT_RETARD = "retard";
	public static final String ETAT_PERTURBATION = "perturbation";
	public static final String ETAT_NORMAL = "normal";
	
	/*
	La première méthode permet à un voyageur de s’abonner s’il n’est pas déjà enregistré auprès
	du service. 
	La seconde méthode permet à un voyageur de se désabonner s’il est enregistré
	*/
	
	public default void informer(InfoTrafic info){
		System.out.println("Utilisation de la méthode informer de l'interface Abonne :");
		
		InfoTrafic infoTrafic = new InfoTrafic();
		System.out.println("-- Infos train : N°"+infoTrafic.getNumTrain()+
				" --- Etat :"+infoTrafic.getEtatTrain());
		
		if(infoTrafic.getEtatTrain()!=ETAT_NORMAL){
			System.out.println("-- Cause du pb : "+infoTrafic.getNatureProbleme());
		}
	}

}
