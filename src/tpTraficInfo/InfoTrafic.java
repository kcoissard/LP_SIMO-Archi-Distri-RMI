package tpTraficInfo;

public class InfoTrafic {
	
	//const
		public static final String ETAT_RETARD = "retard";
		public static final String ETAT_PERTURBATION = "perturbation";
		public static final String ETAT_NORMAL = "normal";
		
	private int numTrain=-1;
	private String etatTrain="Etat du train non defini";
	private String natureProbleme="Nature du probleme non definie";
	
	public int getNumTrain() {
		return numTrain;
	}
	public void setNumTrain(int numTrain) {
		this.numTrain = numTrain;
	}
	public String getEtatTrain() {
		return etatTrain;
	}
	public void setEtatTrain(String etatTrain) {
		this.etatTrain = etatTrain;
	}
	public String getNatureProbleme() {
		return natureProbleme;
	}
	public void setNatureProbleme(String natureProbleme) {
		this.natureProbleme = natureProbleme;
	}
	
	
	

}
