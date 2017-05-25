package soa.jaxrslabs.billeterie;

import java.security.SecureRandom;

public class Billet {
	private SecureRandom numeroBillet = new SecureRandom();
	private InformationEvent informationEvent;
	private Participant participant;
	private Reservation reservation;
	
	public Billet() {
		
		super();
		// TODO Auto-generated constructor stub
	}

	public Billet(InformationEvent informationEvent, Participant participant, Reservation reservation) {
		super();
	
		this.informationEvent = informationEvent;
		this.participant = participant;
		this.reservation = reservation;
	}

	public SecureRandom getNumeroBillet() {
		return numeroBillet;
	}

	public void setNumeroBillet(SecureRandom numeroBillet) {
		this.numeroBillet = numeroBillet;
	}

	public InformationEvent getInformationEvent() {
		return informationEvent;
	}

	public void setInformationEvent(InformationEvent informationEvent) {
		this.informationEvent = informationEvent;
	}

	public Participant getParticipant() {
		return participant;
	}

	public void setParticipant(Participant participant) {
		this.participant = participant;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	
	
	
}
