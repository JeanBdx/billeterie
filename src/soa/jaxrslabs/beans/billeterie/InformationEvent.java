package soa.jaxrslabs.beans.billeterie;


import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="informationEvent")
/**
 * 
 * Fonction qui va donner les informations d'un évenement
 * 
 * @see Reservation
 * @see Evenement
 * 
 * @Author Jean Arhancetebehere
 *
 */
public class InformationEvent {

		
		private String nomEvent;
		private String typeEvent;
		private String detailEvent;
		private Date dateEvent;
		
		
		public InformationEvent() {
			super();
			// TODO Auto-generated constructor stub
		}
		public InformationEvent(String nomEvent, String typeEvent,
			String detailEvent, Date dateEvent) {
		super();
		this.nomEvent = nomEvent;
		this.typeEvent = typeEvent;
		this.detailEvent = detailEvent;
		this.dateEvent = dateEvent;
	}
		@Override
		public String toString() {
			return "informationEvent [nomEvent=" + nomEvent + ", typeEvent=" + typeEvent
					+", detailEvent=" + detailEvent + ", dateEvent=" + dateEvent + "]";
		}
		
		public String getNomEvent() {
			return nomEvent;
		}
		public void setNomEvent(String nomEvent) {
			this.nomEvent = nomEvent;
		}
		public String getTypeEvent() {
			return typeEvent;
		}
		public void setTypeEvent(String typeEvent) {
			this.typeEvent = typeEvent;
		}
		public String getDetailEvent() {
			return detailEvent;
		}
		public void setDetailEvent(String detailEvent) {
			this.detailEvent = detailEvent;
		}
		public Date getDateEvent() {
			return dateEvent;
		}
		public void setDateEvent(Date dateEvent) {
			this.dateEvent = dateEvent;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((dateEvent == null) ? 0 : dateEvent.hashCode());
			result = prime * result + ((detailEvent == null) ? 0 : detailEvent.hashCode());
			result = prime * result + ((nomEvent == null) ? 0 : nomEvent.hashCode());
			result = prime * result + ((typeEvent == null) ? 0 : typeEvent.hashCode());
			return result;
		}
		@Override
		/**
		 * Fonction qui vérifie que les informations sont valide
		 */
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			InformationEvent other = (InformationEvent) obj;

			if (dateEvent == null) {
				if (other.dateEvent != null)
					return false;
			} else if (!dateEvent.equals(other.dateEvent))
				return false;
			if (detailEvent == null) {
				if (other.detailEvent != null)
					return false;
			} else if (!detailEvent.equals(other.detailEvent))
				return false;
			if (nomEvent == null) {
				if (other.nomEvent != null)
					return false;
			} else if (!nomEvent.equals(other.nomEvent))
				return false;
			if (typeEvent == null) {
				if (other.typeEvent != null)
					return false;
			} else if (!typeEvent.equals(other.typeEvent))
				return false;
			return true;
		}
		
		
		
}
