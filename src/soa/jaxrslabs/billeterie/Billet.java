package soa.jaxrslabs.billeterie;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="billet")
public class Billet {
	private String numeroBillet;
	private InformationEvent informationEvent;
	private Acheteur acheteur;
	private Reservation reservation;
	
	public Billet() {
		
		super();
		// TODO Auto-generated constructor stub
	}

	public Billet(String numeroBillet, InformationEvent informationEvent, Acheteur acheteur, Reservation reservation) {
		super();
		this.numeroBillet = numeroBillet;
		this.informationEvent = informationEvent;
		this.acheteur = acheteur;
		this.reservation = reservation;
	}

	public String getNumeroBillet() {
		return numeroBillet;
	}

	public void setNumeroBillet(String numeroBillet) {
		this.numeroBillet = numeroBillet;
	}

	public InformationEvent getInformationEvent() {
		return informationEvent;
	}

	public void setInformationEvent(InformationEvent informationEvent) {
		this.informationEvent = informationEvent;
	}

	public Acheteur getAcheteur() {
		return acheteur;
	}

	public void setAcheteur(Acheteur acheteur) {
		this.acheteur = acheteur;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	
	
	
}
