package soa.jaxrslabs.beans.billeterie;
import java.util.UUID;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Fonction définissant une place dans un lieu.
 * 
 * @see Reservation
 * 
 *
 *@Author Jean Arhancetebehere
 */
public class Place {
	
	private String idPlace = UUID.randomUUID().toString();
	private int numero ;
	private String escalier;
	private int rang;
	
	public Place() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * Constructeur d'un objet Place
	 * 
	 * @param numero Numéro de la place.
	 * @param escalier Escalier de la zone.
	 * @param rang Rang de la place.
	 */
	public Place(int numero, String escalier, int rang) {
		super();
		this.numero = numero;
		this.escalier = escalier;
		this.rang = rang;
	}
	@Override
	public String toString() {
		return "Place [numero=" + numero + ", escalier=" + escalier + ", rang=" + rang + "]";
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getEscalier() {
		return escalier;
	}
	public void setEscalier(String escalier) {
		this.escalier = escalier;
	}
	public int getRang() {
		return rang;
	}
	public void setRang(int rang) {
		this.rang = rang;
	}
	
	public String getIdPlace() {
		return idPlace;
	}
	public void setIdPlace(String idPlace) {
		this.idPlace = idPlace;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((escalier == null) ? 0 : escalier.hashCode());
		result = prime * result + numero;
		result = prime * result + rang;
		return result;
	}
	@Override
	/**
	 * Vérification de la validité de l'objet Place
	 */
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Place other = (Place) obj;
		if (escalier == null) {
			if (other.escalier != null)
				return false;
		} else if (!escalier.equals(other.escalier))
			return false;
		if (numero != other.numero)
			return false;
		if (rang != other.rang)
			return false;
		return true;
	}
	
	
}
