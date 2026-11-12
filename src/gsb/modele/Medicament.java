package gsb.modele;

public class Medicament {
	
	protected String depotLegal;
	protected String nomCommercial;
	protected String composition;
	protected String effets;
	protected String contreIndication;
	protected float prixEchantillon;
	protected String codeFamille;
	protected String libelleFamille;
	
	public Medicament(String unDepotLegal, String unNomCommercial, String uneComposition, String unEffet, String uneContreIndication, float unPrixEchantillon, String unCodeFamille, String unLibelleFamille) {
		this.depotLegal = unDepotLegal;
		this.nomCommercial = unNomCommercial;
		this.composition = uneComposition;
		this.effets = unEffet;
		this.contreIndication = uneContreIndication;
		this.prixEchantillon = unPrixEchantillon;
		this.codeFamille = unCodeFamille;
		this.libelleFamille = unLibelleFamille;
	}

	public String getDepotLegal() {
		return depotLegal;
	}

	public void setDepotLegal(String depotLegal) {
		this.depotLegal = depotLegal.toUpperCase();
	}

	public String getNomCommercial() {
		return nomCommercial;
	}

	public void setNomCommercial(String nomCommercial) {
		this.nomCommercial = nomCommercial;
	}

	public String getComposition() {
		return composition;
	}

	public void setComposition(String composition) {
		this.composition = composition;
	}

	public String getEffets() {
		return effets;
	}

	public void setEffets(String effets) {
		this.effets = effets;
	}

	public String getContreIndication() {
		return contreIndication;
	}

	public void setContreIndication(String contreIndication) {
		this.contreIndication = contreIndication;
	}

	public float getPrixEchantillon() {
		return prixEchantillon;
	}

	public void setPrixEchantillon(float prixEchantillon) {
		this.prixEchantillon = prixEchantillon;
	}

	public String getCodeFamille() {
		return codeFamille;
	}

	public void setCodeFamille(String codeFamille) {
		this.codeFamille = codeFamille.toUpperCase();
	}

	public String getLibelleFamille() {
		return libelleFamille;
	}

	public void setLibelleFamille(String libelleFamille) {
		this.libelleFamille = libelleFamille;
	}
	
}
