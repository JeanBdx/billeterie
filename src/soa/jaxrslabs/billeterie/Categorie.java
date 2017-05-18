package soa.jaxrslabs.billeterie;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import java.util.List;



public class Categorie {
	private String nomCategorie;

	private List<Zone> zones;
	/**
	 * @param nomCategorie
	 * @param zones
	 */
	
	public Categorie(String nomCategorie, List<Zone> zones) {
		super();
		this.nomCategorie = nomCategorie;
		this.zones = zones;
	}
	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Categorie [nomCategorie=" + nomCategorie + ", zones=" + zones + "]";
	}

	public String getNomCategorie() {
		return nomCategorie;
	}
	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}
	@XmlElementWrapper
	@XmlElement(name="zone")
	public List<Zone> getZones() {
		return zones;
	}
	public void setZones(List<Zone> zones) {
		this.zones = zones;
	}
	
}
