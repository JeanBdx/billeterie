package soa.jaxrslabs.billeterie;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="evenement")
public class Evenement {
		private InformationEvent informationEvent;
		
		private Lieux lieux;
		
		public Evenement() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Evenement(InformationEvent informationEvent, Lieux lieux) {
			super();
			this.informationEvent = informationEvent;
			this.lieux = lieux;
		}

		public InformationEvent getInformationEvent() {
			return informationEvent;
		}

		public void setInformationEvent(InformationEvent informationEvent) {
			this.informationEvent = informationEvent;
		}

		public Lieux getLieux() {
			return lieux;
		}

		public void setLieux(Lieux lieux) {
			this.lieux = lieux;
		}
		
	 
}
