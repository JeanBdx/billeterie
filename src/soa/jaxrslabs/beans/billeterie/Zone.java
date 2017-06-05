package soa.jaxrslabs.beans.billeterie;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * Fonction qui va définir les caractéristiques d'une zone :
 * <ul>
 * <li>Le nom de la zone</li>
 * <li>Le nombre de place de la zone</li>
 * <li>Le prix de cette zone</li>
 * </ul>
 *
 *
 *@Author Jean Arhancetebehere
 */
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomZone == null) ? 0 : nomZone.hashCode());
		result = prime * result + ((places == null) ? 0 : places.hashCode());
		result = prime * result + prix;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Zone other = (Zone) obj;
		if (nomZone == null) {
			if (other.nomZone != null)
				return false;
		} else if (!nomZone.equals(other.nomZone))
			return false;
		if (places == null) {
			if (other.places != null)
				return false;
		} else if (!places.equals(other.places))
			return false;
		if (prix != other.prix)
			return false;
		return true;
	}

	
}
