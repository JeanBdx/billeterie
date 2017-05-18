package soa.jaxrslabs.billeterie;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="billet")
public class Billet {
	private String numeroBillet;
	private InformationEvent informationEvent;
	private Acheteur acheteur;
	
	public Billet() {
		
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
