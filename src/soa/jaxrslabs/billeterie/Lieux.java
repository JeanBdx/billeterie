package soa.jaxrslabs.billeterie;

import java.util.List;
import java.util.UUID;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="lieux")

/**
 * 
 * Fonction qui va servir à la création d'un lieu.
 * 
 * @see Reservation
 * @see Categorie
 *
 */
public class Lieux {
	
	private String uniqueID = UUID.randomUUID().toString();
	
	private String localisation; 
	
	private List<Categorie> categories;

	public Lieux() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lieux(String localisation, List<Categorie> categories) {
		super();
		this.localisation = localisation;
		this.categories = categories;
	}

	public String getLocalisation() {
		return localisation;
	}

	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}
	@XmlElementWrapper
	@XmlElement(name="categorie")
	public List<Categorie> getCategories() {
		return categories;
	}

	public void setCategories(List<Categorie> categories) {
		this.categories = categories;
	}
	@XmlAttribute(name="id")
	public String getUniqueID() {
		return uniqueID;
	}

	public void setUniqueID(String iD) {
		uniqueID = iD;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categories == null) ? 0 : categories.hashCode());
		result = prime * result + ((localisation == null) ? 0 : localisation.hashCode());
		result = prime * result + ((uniqueID == null) ? 0 : uniqueID.hashCode());
		return result;
	}

	@Override
	
	/**
	 * Validation de la bonne saisie du lieu.
	 */
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lieux other = (Lieux) obj;
		if (categories == null) {
			if (other.categories != null)
				return false;
		} else if (!categories.equals(other.categories))
			return false;
		if (localisation == null) {
			if (other.localisation != null)
				return false;
		} else if (!localisation.equals(other.localisation))
			return false;
		if (uniqueID == null) {
			if (other.uniqueID != null)
				return false;
		} else if (!uniqueID.equals(other.uniqueID))
			return false;
		return true;
	}
	
	
}
