package soa.jaxrslabs.beans.utilisateur;

public class Utilisateur {

    private String id;
    private String motDePasse;

    public void setEmail(String id) {
	this.id = id;
    }
    public String getEmail() {
	return id;
    }

    public void setMotDePasse(String motDePasse) {
	this.motDePasse = motDePasse;
    }
    public String getMotDePasse() {
	return motDePasse;
    }

}