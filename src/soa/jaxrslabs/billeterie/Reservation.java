package soa.jaxrslabs.billeterie;


public class Reservation {

	private Acheteur acheteur = new Acheteur();
	private String nomLieux;
	private Place place = new Place();
	private String nomCategorie;
	private String nomZone;
	
	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reservation(Acheteur acheteur, String nomLieux, Place place, String nomCategorie, String nomZone) {
		super();
		this.acheteur = acheteur;
		this.nomLieux = nomLieux;
		this.place = place;
		this.nomCategorie = nomCategorie;
		this.nomZone = nomZone;
	}

	public Acheteur getAcheteur() {
		return acheteur;
	}

	public void setAcheteur(Acheteur acheteur) {
		this.acheteur = acheteur;
	}

	public String getNomLieux() {
		return nomLieux;
	}

	public void setNomLieux(String nomLieux) {
		this.nomLieux = nomLieux;
	}

	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}

	public String getNomCategorie() {
		return nomCategorie;
	}

	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}

	public String getNomZone() {
		return nomZone;
	}

	public void setNomZone(String nomZone) {
		this.nomZone = nomZone;
	}

	
	
	
	
}
