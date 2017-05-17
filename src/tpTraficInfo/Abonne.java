package tpTraficInfo;

import tpTraficInfo.InfoTrafic;


public interface Abonne {
	
	/*
	La première méthode permet à un voyageur de s’abonner s’il n’est pas déjà enregistré auprès
	du service. 
	La seconde méthode permet à un voyageur de se désabonner s’il est enregistré
	*/
	
	public default void informer(InfoTrafic info){
		
	}

}
