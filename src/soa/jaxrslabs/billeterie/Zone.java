package soa.jaxrslabs.billeterie;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;


public class Zone {
	private String nomZone;
	private List<Place> places;
	private int prix;
	
	/**
	 * @param nomZone
	 * @param places
	 * @param prix
	 */
	public Zone(String nomZone, List<Place> places, int prix) {
		super();
		this.nomZone = nomZone;
		this.places = places;
		this.prix = prix;
	}
	
	public Zone() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Zone [nomZone=" + nomZone + ", places=" + places + ", prix=" + prix + "]";
	}

	public String getNomZone() {
		return nomZone;
	}
	public void setNomZone(String nomZone) {
		this.nomZone = nomZone;
	}
	@XmlElementWrapper
	@XmlElement(name="place")
	public List<Place> getPlaces() {
		return places;
	}
	public void setPlaces(List<Place> places) {
		this.places = places;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}

	
}
