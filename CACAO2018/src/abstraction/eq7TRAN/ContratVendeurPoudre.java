package abstraction.eq7TRAN;


public class ContratVendeurPoudre {
	private int qualite;
	private int quantite;
	private double prix;
	// private IAcheteurPoudre tran;
	private IVendeurPoudre prod;
	private boolean reponse;
	
	public ContratVendeurPoudre(int qualite, int quantite, double prix, //IAcheteurPoudre tran,
			IVendeurPoudre prod, boolean reponse) {
		this.qualite = qualite;
		this.quantite = quantite;
		this.prix = prix;
		// this.tran = tran;
		this.prod = prod;
		this.reponse = reponse;
	}
}