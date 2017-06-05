package soa.jaxrslabs.billeterie;

import java.util.List;
import java.util.UUID;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="evenement")
/**
 * Fonction permettant de construire un evenement.
 * 
 * @see Reservation
 * @see InformationEvent
 */
public class Evenement {
		
		private String uniqueID = UUID.randomUUID().toString();
		
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
		@XmlAttribute(name="id")
		public String getUniqueID() {
			return uniqueID;
		}

		public void setUniqueID(String uniqueID) {
			this.uniqueID = uniqueID;
		}
		
		@Override
		public String toString() {
			return "Evenement [uniqueID=" + uniqueID + ", informationEvent=" + informationEvent + ", lieux=" + lieux
					+ "]";
		}

		@Override
		/**
		 * 
		 */
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((informationEvent == null) ? 0 : informationEvent.hashCode());
			result = prime * result + ((lieux == null) ? 0 : lieux.hashCode());
			result = prime * result + ((uniqueID == null) ? 0 : uniqueID.hashCode());
			return result;
		}

		@Override
		/**
		 * La fonction permet valider la création d'un évenement.
		 */
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Evenement other = (Evenement) obj;
			if (informationEvent == null) {
				if (other.informationEvent != null)
					return false;
			} else if (!informationEvent.equals(other.informationEvent))
				return false;
			if (lieux == null) {
				if (other.lieux != null)
					return false;
			} else if (!lieux.equals(other.lieux))
				return false;
			if (uniqueID == null) {
				if (other.uniqueID != null)
					return false;
			} else if (!uniqueID.equals(other.uniqueID))
				return false;
			return true;
		}
		
	 
}
