package soa.jaxrslabs.billeterie;


public class Reservation {

	private Participant participant = new Participant();
	private String nomLieux;
	private Place place = new Place();
	
	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reservation(Participant participant, String nomLieux, Place place) {
		super();
		this.participant = participant;
		this.nomLieux = nomLieux;
		this.place = place;
	}

	public Participant getParticipant() {
		return participant;
	}

	public void setParticipant(Participant participant) {
		this.participant = participant;
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
	

	
}
