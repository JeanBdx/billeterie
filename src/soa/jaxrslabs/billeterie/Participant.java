package soa.jaxrslabs.billeterie;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="participant")
public class Participant extends Personne {

	public Participant(String civilite, String nom, String prenom) {
		super(civilite, nom, prenom);
	}

	public Participant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
