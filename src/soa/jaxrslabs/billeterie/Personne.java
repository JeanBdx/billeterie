package soa.jaxrslabs.billeterie;


public class Personne {
	private String civilite;
	private String nom;
	private String prenom;
	
	/**
	 * @param civilite
	 * @param nom
	 * @param prenom
	 */
	public Personne(String civilite, String nom, String prenom) {
		super();
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
	}

	
	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Personne [civilite=" + civilite + ", nom=" + nom + ", prenom=" + prenom + "]";
	}


	public String getCivilite() {
		return civilite;
	}


	public void setCivilite(String civilite) {
		this.civilite = civilite;
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

	
	
}
