package soa.jaxrslabs.billeterie;

/**
 * 
 * Fonction définissant un objet Personne
 * 
 * @see Acheteur
 * @see Participant
 *
 */
public class Personne {
	private String civilite;
	private String nom;
	private String prenom;
	
	/**
	 * Une personne se définit par 3 paramètres
	 * 
	 * @param civilite Mr, Mme, Mlle
	 * @param nom Nom de la personne
	 * @param prenom Prénom de la personne
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


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((civilite == null) ? 0 : civilite.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		return result;
	}


	@Override
	/**
	 * Fonction vérifaiant la validité de l'objet Personne
	 */
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personne other = (Personne) obj;
		if (civilite == null) {
			if (other.civilite != null)
				return false;
		} else if (!civilite.equals(other.civilite))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		return true;
	}

	
	
	
}
