package soa.jaxrslabs.billeterie;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="lieux")
public class Lieux {

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
	
}
