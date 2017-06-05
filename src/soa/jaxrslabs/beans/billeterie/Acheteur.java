package soa.jaxrslabs.beans.billeterie;

/**
 * Fonction qui étend personne pour définir la personne qui achète.
 * 
 * @see Personne
 * @see Reservation
 * 
 * @Author Jean Arhancetebehere
 */
public class Acheteur extends Personne{

	private String adresse;
	private String tel;
	private String mail;
	
	/**
	 * Définition d'une Personne Acheteur
	 * 
	 * @param civilite Mr, Mme, Mlle
	 * @param nom Nom de l'acheteur
	 * @param prenom Prenom de l'acheteur
	 * @param adresse Adresse de l'acheteur
	 * @param tel Téléphone de l'acheteur
	 * @param mail Mail de l'acheteur
	 */
	public Acheteur(String civilite, String nom, String prenom, String adresse, String tel, String mail) {
		super(civilite, nom, prenom);
		this.adresse = adresse;
		this.tel = tel;
		this.mail = mail;
	}
	
	/**
	 * Constructeur d'un Acheteur.
	 */
	public Acheteur() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Acheteur [adresse=" + adresse + ", tel=" + tel + ", mail=" + mail + "]";
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
	

}
