package soa.jaxrslabs.beans.utilisateur;

/** 
 * <b>Fonction utilisateur.</b>
 * <p>
 * L'utilisateur se caractérise par les informations suivantes :
 * <ul>
 * <li>Un identifiant unique</li>
 * <li>Un mot de passe</li>
 * </p>
 *
 *@see ConnexionForm
 *
 */
public class Utilisateur {
	
	/**
	 * Identifiant utilisateur
	 */
    private String id;
    
    /**
     * Mot de passe utilisateur
     */
    private String motDePasse;
    
    /**
     * Définit l'identifiant utilisateur
     * @param id
     */
    public void setEmail(String id) {
	this.id = id;
    }
    
    /**
     * Récupération de l'adresse mail
     * @return l'identifiant de l'utilisateur
     */
    public String getEmail() {
	return id;
    }
    
    /**
     * Définit le mot de passe utilisateur
     * @param motDePasse
     */
    public void setMotDePasse(String motDePasse) {
	this.motDePasse = motDePasse;
    }
    
    /**
     * Récupération du mot de passe
     * @return
     */
    public String getMotDePasse() {
	return motDePasse;
    }

}