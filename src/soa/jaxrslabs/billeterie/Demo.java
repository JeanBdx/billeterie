package soa.jaxrslabs.billeterie;


import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.util.JAXBSource;
import javax.xml.namespace.QName;

public class Demo {

	public static void main(String[] args) throws Exception {
			InformationEvent info = new InformationEvent("11", "Championnat", "Ligue 1", "Foot",null, "Super evenement Ligue 1", new Date());	
			Place p1 = new Place(12,"A", 2);
			ArrayList<Place> ArrayPlace = new ArrayList<>();
			ArrayPlace.add(p1);
			
			Zone z1 = new Zone("Zone une",ArrayPlace,11);
			Zone z2 = new Zone("Zone deux",ArrayPlace,12);
			ArrayList<Zone> ArrayZone = new ArrayList<>();
			ArrayZone.add(z1);
			ArrayZone.add(z2);
			Categorie c1 = new Categorie("Cat1", ArrayZone);
		
			ArrayList<Categorie> ArrayCategorie = new ArrayList<>();
			ArrayCategorie.add(c1);
	
			Lieux lieux = new Lieux("Stade de France, Paris",ArrayCategorie);
			Evenement foot = new Evenement(info, lieux);
		
			StringWriter writer = new StringWriter();
			JAXBContext context = JAXBContext.newInstance(Evenement.class);
			Marshaller m = context.createMarshaller();
			m.marshal(foot, writer);
		
			System.out.println(writer.toString());
			Participant participant = new Participant("Monsieur","Arhancetebehere","Jean");
			Acheteur acheteur = new Acheteur("Madame","Carlier","Clemence","Rue denise","060606","carlier@gmail.com");
			Reservation reservation = new Reservation(participant,p1);
			
			
			Billet billet = new Billet("1123a",info,acheteur,reservation);
			StringWriter writerB = new StringWriter();
			JAXBContext contextB = JAXBContext.newInstance(Billet.class);
			Marshaller mB = contextB.createMarshaller();
			mB.marshal(billet, writerB);
			System.out.println(writerB.toString());
	}

}
