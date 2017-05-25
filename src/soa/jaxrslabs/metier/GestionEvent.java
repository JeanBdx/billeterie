package soa.jaxrslabs.metier;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import javax.jws.WebService;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import soa.jaxrslabs.billeterie.*;

@WebService
public class GestionEvent {
	
	public static Place getPlace(String idEvent, String nomCategorie, String nomZone, String idPlace){
		File source = new File("./WebContent/XML/event/");
		// de quoi descendre dans les sous r�pertoires et ainsi tester le nom
		File[] content = source.listFiles();
		for (int i = 0; i < content.length; i++) {
			JAXBContext jc = null;
			try {
				jc = JAXBContext.newInstance(Evenement.class);
			} catch (JAXBException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			Unmarshaller u = null;
			try {
				u = jc.createUnmarshaller();
			} catch (JAXBException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				Evenement e = (Evenement) u.unmarshal(content[i]);
				if (idEvent.equals(e.getUniqueID())) {
					for(int j=0;j<e.getLieux().getCategories().size();j++){
						Categorie current = e.getLieux().getCategories().get(j);
						if(nomCategorie.equals(current.getNomCategorie())){
							for(int k=0;k<current.getZones().size();k++){
								Zone currentZone = current.getZones().get(k);
								if(nomZone.equals(currentZone.getNomZone())){
									for(int l=0;l<currentZone.getPlaces().size();l++){
										Place currentPlace = currentZone.getPlaces().get(l);
										if(idPlace.equals(currentPlace.getIdPlace())){
											return currentPlace;
										}
									}
								}
							}
						}
						
					}
				}
				else {
					return null;
				}
			} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

	public static Lieux getLieu(String idLieux) {
		// cr�er un fichier qui pointe sur tes images
		File source = new File("./WebContent/XML/lieux/");
		// de quoi descendre dans les sous r�pertoires et ainsi tester le nom
		File[] content = source.listFiles();
		for (int i = 0; i < content.length; i++) {
			JAXBContext jc = null;
			try {
				jc = JAXBContext.newInstance(Lieux.class);
			} catch (JAXBException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			Unmarshaller u = null;
			try {
				u = jc.createUnmarshaller();
			} catch (JAXBException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				Lieux l = (Lieux) u.unmarshal(content[i]);
				if (idLieux.equals(l.getUniqueID())) {
					return l;
				} else {
					return null;
				}
			} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
	
	public static ArrayList<Lieux> getLieux() {
		File source = new File("./WebContent/XML/lieux/");
		// de quoi descendre dans les sous r�pertoires et ainsi tester le nom
		File[] content = source.listFiles();
		ArrayList<Lieux> listeLieux = new ArrayList<>();
		for (int i = 0; i < content.length; i++) {
			JAXBContext jc = null;
			try {
				jc = JAXBContext.newInstance(Lieux.class);
			} catch (JAXBException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			Unmarshaller u = null;
			try {
				u = jc.createUnmarshaller();
			} catch (JAXBException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				Lieux l = (Lieux) u.unmarshal(content[i]);
				listeLieux.add(l);
				return listeLieux;
			} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

	public static Evenement getEvenement(String idEvent) {
		// cr�er un fichier qui pointe sur tes images
		File source = new File("./WebContent/XML/event/");
		// de quoi descendre dans les sous r�pertoires et ainsi tester le nom
		File[] content = source.listFiles();
		for (int i = 0; i < content.length; i++) {
			JAXBContext jc = null;
			try {
				jc = JAXBContext.newInstance(Evenement.class);
			} catch (JAXBException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			Unmarshaller u = null;
			try {
				u = jc.createUnmarshaller();
			} catch (JAXBException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				Evenement e = (Evenement) u.unmarshal(content[i]);
				if (idEvent.equals(e.getUniqueID())) {
					return e;
				} else {
					return null;
				}
			} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
	
	public ArrayList<Evenement> getEvenements() {
		File source = new File("./WebContent/XML/event/");
		// de quoi descendre dans les sous r�pertoires et ainsi tester le nom
		File[] content = source.listFiles();
		ArrayList<Evenement> listeEvent = new ArrayList<>();
		for (int i = 0; i < content.length; i++) {
			JAXBContext jc = null;
			try {
				jc = JAXBContext.newInstance(Evenement.class);
			} catch (JAXBException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			Unmarshaller u = null;
			try {
				u = jc.createUnmarshaller();
			} catch (JAXBException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				Evenement e = (Evenement) u.unmarshal(content[i]);
				listeEvent.add(e);
				return listeEvent;
			} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

	public void reserverPlace(String idEvent, String nomCategorie, String nomZone, String escalier, int numero,
			int rang) {
		Evenement current = getEvenement(idEvent);
		if (current != null) {
			Iterator<Categorie> cat = current.getLieux().getCategories().iterator();
			while (cat.hasNext()) {
				Categorie s = cat.next(); // must be called before you can call
											// i.remove()
				if (s.getNomCategorie().equals(nomCategorie)) {
					Iterator<Zone> zones = s.getZones().iterator();
					while (zones.hasNext()) {
						Zone zone = zones.next();
						if (zone.getNomZone().equals(nomZone)) {
							Iterator<Place> places = zone.getPlaces().iterator();
							while (places.hasNext()) {
								Place place = places.next();
								if (place.getEscalier().equals(escalier) && place.getNumero() == numero
										&& place.getRang() == rang) {
									places.remove();
								}
								if (zone.getPlaces().size() == 0)
									zones.remove();
								if (s.getZones().size() == 0)
									cat.remove();
							}

						}
					}

				}
			}
			try {
				sauvegardeXML("./WebContent/XML/event/event-"+current.getUniqueID()+".xml", current);
			} catch (FileNotFoundException | JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
	}

	public static Categorie createCategorie(String nomCategorie, int nombreZone, int nombreRang, int nbPlace,int...prix){
		if(!nomCategorie.isEmpty() && nombreZone != 0 & nbPlace != 0 ){
			
			//ArrayList<Place> places = new ArrayList<>();
			ArrayList<Zone> zones = new ArrayList<>();
			
			char alphabet = 'A';
			for(int zone=1;zone<=nombreZone;zone++){
				ArrayList<Place> places = new ArrayList<>();
				for(int i=1;i<=nombreRang;i++){
					for(int j=1;j<=nbPlace;j++){
						places.add(new Place(j,String.valueOf(alphabet),i));
					}
				}
				zones.add(new Zone("Zone"+zone,places,prix[zone-1]));
				alphabet++;
			}
			return (new Categorie(nomCategorie,zones));
			
			
		}else{
			return null;
		}
		
		
	}
	
	public static void createLieu(String localisation, ArrayList<Categorie> categories){
		Lieux l = new Lieux(localisation,categories);
		try {
			sauvegardeXML("./WebContent/XML/lieux/lieux-"+l.getUniqueID()+".xml", l);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void createEvent(String idLieux,String nomEvent, String typeEvent, String sport,String artiste,String detailEvent, Date dateEvent) {
		InformationEvent info = new InformationEvent(nomEvent,typeEvent,sport,artiste,detailEvent,dateEvent);
		Lieux l = getLieu(idLieux);
		if(l != null && info != null){
			Evenement e = new Evenement(info,l);
			try {
				sauvegardeXML("./WebContent/XML/event/event-"+e.getUniqueID()+".xml", e);
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (JAXBException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	
	private static void sauvegardeXML(String chemin,Object o) throws FileNotFoundException, JAXBException{
		StringWriter writer = new StringWriter();
		
		PrintWriter file = new PrintWriter(chemin);

		JAXBContext context = JAXBContext.newInstance(o.getClass());
		Marshaller m = context.createMarshaller();
		m.marshal(o, writer);	
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE );
		  
		file.write(writer.toString());
		file.close();
		
	}
}