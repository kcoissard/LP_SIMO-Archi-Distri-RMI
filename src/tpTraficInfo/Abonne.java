package tpTraficInfo;

import java.rmi.Remote;

import tpTraficInfo.InfoTrafic;


public interface Abonne  extends Remote
{
	public static final String ETAT_RETARD = "retard";
	public static final String ETAT_PERTURBATION = "perturbation";
	public static final String ETAT_NORMAL = "normal";
	
	/*
	La premi�re m�thode permet � un voyageur de s�abonner s�il n�est pas d�j� enregistr� aupr�s
	du service. 
	La seconde m�thode permet � un voyageur de se d�sabonner s�il est enregistr�
	*/
	
	public default void informer(InfoTrafic info){
		System.out.println("Utilisation de la m�thode informer de l'interface Abonne :");
		
		InfoTrafic infoTrafic = new InfoTrafic();
		System.out.println("-- Infos train : N�"+infoTrafic.getNumTrain()+
				" --- Etat :"+infoTrafic.getEtatTrain());
		
		if(infoTrafic.getEtatTrain()!=ETAT_NORMAL){
			System.out.println("-- Cause du pb : "+infoTrafic.getNatureProbleme());
		}
	}

}
