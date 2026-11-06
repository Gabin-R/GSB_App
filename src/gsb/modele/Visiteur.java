package gsb.modele;

public class Visiteur {

	protected String matricule;
	protected String nom;
	protected String prenom;
	protected String login;
	protected String mdp;
	protected String adresse;
	protected Localite uneLocatlite;
	protected String telephone;
	protected String dateEntre;
	protected int prime;
	protected String codeUnite;
	protected String nomUnite;
	
	public Visiteur(String unMatricule, String unNom, String unPrenom, String unLogin, String unMdp, String uneAdresse, Localite uneLocalite, String unTelephone, String uneDateEntre, int unePrime, String unCodeUnite, String unNomUnite) {
		
		this.matricule = unMatricule;
		this.nom = unNom;
		this.prenom = unPrenom;
		this.login = unLogin;
		this.mdp = unMdp;
		this.adresse = uneAdresse;
		this.uneLocatlite = uneLocalite;
		this.telephone = unTelephone;
		this.dateEntre = uneDateEntre;
		this.prime = unePrime;
		this.codeUnite = unCodeUnite;
		this.nomUnite = unNomUnite;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Localite getUneLocatlite() {
		return uneLocatlite;
	}

	public void setUneLocatlite(Localite uneLocatlite) {
		this.uneLocatlite = uneLocatlite;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getDateEntre() {
		return dateEntre;
	}

	public void setDateEntre(String dateEntre) {
		this.dateEntre = dateEntre;
	}

	public int getPrime() {
		return prime;
	}

	public void setPrime(int prime) {
		this.prime = prime;
	}

	public String getCodeUnite() {
		return codeUnite;
	}

	public void setCodeUnite(String codeUnite) {
		this.codeUnite = codeUnite;
	}

	public String getNomUnite() {
		return nomUnite;
	}

	public void setNomUnite(String nomUnite) {
		this.nomUnite = nomUnite;
	}
	
}
