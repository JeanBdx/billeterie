package soa.jaxrslabs.billeterie;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="acheteur")
public class Acheteur extends Personne{

	private String adresse;
	private String tel;
	private String mail;
	
	/**
	 * dc
	 * @param civilite
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param tel
	 * @param mail
	 */
	public Acheteur(String civilite, String nom, String prenom, String adresse, String tel, String mail) {
		super(civilite, nom, prenom);
		this.adresse = adresse;
		this.tel = tel;
		this.mail = mail;
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
