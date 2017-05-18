package soa.jaxrslabs.billeterie;


import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="informationEvent")
public class InformationEvent {

		private String reference;
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
		public InformationEvent(String reference, String nomEvent, String typeEvent, String sport, String artiste,
			String detailEvent, Date dateEvent) {
		super();
		this.reference = reference;
		this.nomEvent = nomEvent;
		this.typeEvent = typeEvent;
		this.sport = sport;
		this.artiste = artiste;
		this.detailEvent = detailEvent;
		this.dateEvent = dateEvent;
	}
		@Override
		public String toString() {
			return "informationEvent [reference=" + reference + ", nomEvent=" + nomEvent + ", typeEvent=" + typeEvent
					+ ", sport=" + sport + ", artiste=" + artiste + ", detailEvent=" + detailEvent + ", dateEvent=" + dateEvent + "]";
		}
		public String getReference() {
			return reference;
		}
		public void setReference(String reference) {
			this.reference = reference;
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
		
		
}
