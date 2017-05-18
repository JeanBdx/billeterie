package soa.jaxrslabs.billeterie;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="reservation")
public class Reservation {

	private Participant participant = new Participant();
	private Place place = new Place();
	
	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Reservation(Participant participant, Place place) {
		super();
		this.participant = participant;
		this.place = place;
	}


	public Participant getParticipant() {
		return participant;
	}


	public void setParticipant(Participant participant) {
		this.participant = participant;
	}


	public Place getPlace() {
		return place;
	}


	public void setPlace(Place place) {
		this.place = place;
	}
	
	
	
}
