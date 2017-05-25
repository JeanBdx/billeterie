package soa.jaxrslabs.billeterie;


import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="informationEvent")
public class InformationEvent {

		
		private String nomEvent;
		private String typeEvent;
		private String sport;
		private String artiste;
		private String detailEvent;
		private Date dateEvent;
		
		
		public InformationEvent() {
			super();
			// TODO Auto-generated constructor stub
		}
		public InformationEvent(String nomEvent, String typeEvent, String sport, String artiste,
			String detailEvent, Date dateEvent) {
		super();
		this.nomEvent = nomEvent;
		this.typeEvent = typeEvent;
		this.sport = sport;
		this.artiste = artiste;
		this.detailEvent = detailEvent;
		this.dateEvent = dateEvent;
	}
		@Override
		public String toString() {
			return "informationEvent [nomEvent=" + nomEvent + ", typeEvent=" + typeEvent
					+ ", sport=" + sport + ", artiste=" + artiste + ", detailEvent=" + detailEvent + ", dateEvent=" + dateEvent + "]";
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
		public String getSport() {
			return sport;
		}
		public void setSport(String sport) {
			this.sport = sport;
		}
		public String getArtiste() {
			return artiste;
		}
		public void setArtiste(String artiste) {
			this.artiste = artiste;
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
			result = prime * result + ((artiste == null) ? 0 : artiste.hashCode());
			result = prime * result + ((dateEvent == null) ? 0 : dateEvent.hashCode());
			result = prime * result + ((detailEvent == null) ? 0 : detailEvent.hashCode());
			result = prime * result + ((nomEvent == null) ? 0 : nomEvent.hashCode());
			result = prime * result + ((sport == null) ? 0 : sport.hashCode());
			result = prime * result + ((typeEvent == null) ? 0 : typeEvent.hashCode());
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
			InformationEvent other = (InformationEvent) obj;
			if (artiste == null) {
				if (other.artiste != null)
					return false;
			} else if (!artiste.equals(other.artiste))
				return false;
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
			if (sport == null) {
				if (other.sport != null)
					return false;
			} else if (!sport.equals(other.sport))
				return false;
			if (typeEvent == null) {
				if (other.typeEvent != null)
					return false;
			} else if (!typeEvent.equals(other.typeEvent))
				return false;
			return true;
		}
		
		
		
}
