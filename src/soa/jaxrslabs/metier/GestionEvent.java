package soa.jaxrslabs.metier;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Properties;

import javax.jws.WebService;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import soa.jaxrslabs.beans.billeterie.*;

@WebService
/**
 * 
 * Fonction servant Ã  la gestion et la crÃ©ation des Ã©venements.
 *
 */
public class GestionEvent {
	// categorie, zone, rang, place
	/**
	 * Fonction qui recupère un objet Place correspondant à un evenement particulier pour une Categorie, une zone, un rang, et un numéro de Place
	 * 
	 * @param chemin
	 * @param idEvent
	 * @param nomCategorie
	 * @param nomZone
	 * @param nomRang
	 * @param nomPlace
	 * @return Retourne la place rÃ©servÃ©e
	 * @throws IOException
	 */
	public static Place getPlace(String chemin, String idEvent, String nomCategorie,String nomZone,String nomRang, String nomPlace) throws IOException{
		Evenement currentEvent = GestionEvent.getEvenement(chemin, idEvent);
		Place myPlace = new Place();
		for (int i = 0; i < currentEvent.getLieux().getCategories().size(); i++) {
			if(currentEvent.getLieux().getCategories().get(i).getNomCategorie().equals(nomCategorie.trim())){
				for(int j=0;j<currentEvent.getLieux().getCategories().get(i).getZones().size();j++){
					if(currentEvent.getLieux().getCategories().get(i).getZones().get(j).getNomZone().equals(nomZone.trim())){
						for(int k=0;k<currentEvent.getLieux().getCategories().get(i).getZones().get(j).getPlaces().size();k++){
							if(currentEvent.getLieux().getCategories().get(i).getZones().get(j).getPlaces().get(k).getRang() == Integer.valueOf(nomRang) &&
									currentEvent.getLieux().getCategories().get(i).getZones().get(j).getPlaces().get(k).getNumero() == Integer.valueOf(nomPlace)){
								myPlace = currentEvent.getLieux().getCategories().get(i).getZones().get(j).getPlaces().get(k); 
							}
						}
				
					}
					
				}
			}
		}
		return myPlace;
	}
	
	
	/**
	 * Fonction de rÃ©cupÃ©ration du lieu.
	 * 
	 * @param chemin
	 * @param idLieux
	 * @return
	 * @throws IOException
	 */
	public static Lieux getLieu(String chemin,String idLieux) throws IOException {
	
		File source = new File(chemin+"/lieux/");
		// de quoi descendre dans les sous rï¿½pertoires et ainsi tester le nom
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
				}
			} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
	
	/**
	 * Fonction listant les diffÃ©rents Lieux.
	 * @param chemin
	 * @return
	 * @throws IOException
	 */
	public static ArrayList<Lieux> getLieux(String chemin) throws IOException {
		
		File source = new File(chemin+"/lieux/");
		// de quoi descendre dans les sous rï¿½pertoires et ainsi tester le nom
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
				
			} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return listeLieux;

	}
	
	/**
	 * Fonction qui permet de retourner tous les noms de Zone d'une categorie(d'un evenement) passé en paramètre 
	 * Elle est appelée dans le formulaire de réservation de place 
	 * @param chemin
	 * @param idEvent
	 * @param nomCategorie
	 * @return
	 * @throws IOException
	 */
	public static ArrayList<String> NomZones(String chemin, String idEvent, String nomCategorie) throws IOException{
		Evenement currentEvent = GestionEvent.getEvenement(chemin, idEvent);
		ArrayList<String> nomZones = new ArrayList<>();
		for (int i = 0; i < currentEvent.getLieux().getCategories().size(); i++) {
			if(currentEvent.getLieux().getCategories().get(i).getNomCategorie().equals(nomCategorie.trim())){
				for(int j=0;j<currentEvent.getLieux().getCategories().get(i).getZones().size();j++){
					nomZones.add(currentEvent.getLieux().getCategories().get(i).getZones().get(j).getNomZone());
				}
			}
		}
		return nomZones;
	}
	
	/**
	 * Fonction qui permet de retourner tous les noms des Rang d'une categorie & d'une zone passé en paramètre 
	 * Elle est appelée dans le formulaire de réservation de place 
	 * @param chemin
	 * @param idEvent
	 * @param nomCategorie
	 * @param nomZone
	 * @return
	 * @throws IOException
	 */
	public static ArrayList<String> NomRang(String chemin, String idEvent, String nomCategorie,String nomZone) throws IOException{
		Evenement currentEvent = GestionEvent.getEvenement(chemin, idEvent);
		ArrayList<String> nomRang = new ArrayList<>();
		for (int i = 0; i < currentEvent.getLieux().getCategories().size(); i++) {
			if(currentEvent.getLieux().getCategories().get(i).getNomCategorie().equals(nomCategorie.trim())){
				for(int j=0;j<currentEvent.getLieux().getCategories().get(i).getZones().size();j++){
					if(currentEvent.getLieux().getCategories().get(i).getZones().get(j).getNomZone().equals(nomZone.trim())){
						for(int k=0;k<currentEvent.getLieux().getCategories().get(i).getZones().get(j).getPlaces().size();k++){
							if(!nomRang.contains(String.valueOf(currentEvent.getLieux().getCategories().get(i).getZones().get(j).getPlaces().get(k).getRang()))){
								nomRang.add(String.valueOf(currentEvent.getLieux().getCategories().get(i).getZones().get(j).getPlaces().get(k).getRang()));
							}
						}
				
					}
					
				}
			}
		}
		return nomRang;
	}
	
	/**
	 * Fonction qui permet de retourner tous les noms des Places d'une categorie & d'une zone & d'un rang passé en paramètre 
	 * Elle est appelée dans le formulaire de réservation de place 
	 * @param chemin
	 * @param idEvent
	 * @param nomCategorie
	 * @param nomZone
	 * @param nomRang
	 * @return
	 * @throws IOException
	 */
	public static ArrayList<String> NomPlace(String chemin, String idEvent, String nomCategorie,String nomZone,String nomRang) throws IOException{
		Evenement currentEvent = GestionEvent.getEvenement(chemin, idEvent);
		ArrayList<String> nomPlace = new ArrayList<>();
		for (int i = 0; i < currentEvent.getLieux().getCategories().size(); i++) {
			if(currentEvent.getLieux().getCategories().get(i).getNomCategorie().equals(nomCategorie.trim())){
				for(int j=0;j<currentEvent.getLieux().getCategories().get(i).getZones().size();j++){
					if(currentEvent.getLieux().getCategories().get(i).getZones().get(j).getNomZone().equals(nomZone.trim())){
						for(int k=0;k<currentEvent.getLieux().getCategories().get(i).getZones().get(j).getPlaces().size();k++){
							if(currentEvent.getLieux().getCategories().get(i).getZones().get(j).getPlaces().get(k).getRang() == Integer.valueOf(nomRang)){
								nomPlace.add(String.valueOf(currentEvent.getLieux().getCategories().get(i).getZones().get(j).getPlaces().get(k).getNumero())); 
							}
						}
				
					}
					
				}
			}
		}
		return nomPlace;
	}
	
	/**
	 * Fonction rÃ©cupÃ©rant les donnÃ©es d'Ã©venement.
	 * 
	 * @param chemin
	 * @param idEvent
	 * @return
	 * @throws IOException
	 */
	public static Evenement getEvenement(String chemin,String idEvent) throws IOException {

		File source = new File(chemin+"/event/");
		// de quoi descendre dans les sous rï¿½pertoires et ainsi tester le nom
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
				}
			} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
	
	/**
	 * Fonction qui recupere tous les evenements stocké dans le fichier /XML/event
	 * @param chemin
	 * @return
	 * @throws IOException
	 */
	public static ArrayList<Evenement> getEvenements(String chemin) throws IOException {
	
		File source = new File(chemin+"/event/");
		// de quoi descendre dans les sous rï¿½pertoires et ainsi tester le nom
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
			
			} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return listeEvent;
	}

	/**
	 * Fonction qui permet la rÃ©servation d'une place
	 * 
	 * @see Reservation
	 * 
	 * @param chemin
	 * @param idEvent
	 * @param nomCategorie
	 * @param nomZone
	 * @param escalier
	 * @param numero
	 * @param rang
	 * @throws IOException
	 */
	public static void reserverPlace(String chemin,String idEvent, String nomCategorie, String nomZone, String escalier, int numero,
			int rang) throws IOException {
			Evenement current = getEvenement(chemin,idEvent);
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
				sauvegardeXML(chemin+"event/event-"+current.getUniqueID()+".xml", current);
			} catch (FileNotFoundException | JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
	}

	/**
	 * Fonction permettant Ã  l'administrateur de crÃ©er une catÃ©gorie.
	 * 
	 * @param nomCategorie
	 * @param nombreZone
	 * @param nombreRang
	 * @param nbPlace
	 * @param prix
	 * @return
	 */
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
	
	/**
	 * Fonction permettant Ã  l'administrateur de crÃ©er un Lieu.
	 * 
	 * @param chemin
	 * @param localisation
	 * @param categories
	 * @throws IOException
	 */
	public static void createLieu(String chemin,String localisation, ArrayList<Categorie> categories) throws IOException{
		Lieux l = new Lieux(localisation,categories);
	
		try {
			sauvegardeXML(chemin+"/lieux/lieux-"+l.getUniqueID()+".xml", l);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Fonction permettant Ã  l'administrateur de crÃ©er un Ã©venement.
	 * 
	 * @param chemin
	 * @param idLieux
	 * @param nomEvent
	 * @param typeEvent
	 * @param detailEvent
	 * @param dateEvent
	 * @throws IOException
	 */
	public static void createEvent(String chemin,String idLieux,String nomEvent, String typeEvent, String detailEvent, Date dateEvent) throws IOException {
		InformationEvent info = new InformationEvent(nomEvent,typeEvent,detailEvent,dateEvent);
		Lieux l = getLieu(chemin,idLieux);
		
		if(l != null && info != null){
			Evenement e = new Evenement(info,l);
			try {
				sauvegardeXML(chemin+"/event/event-"+e.getUniqueID()+".xml", e);
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (JAXBException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	
	
	/**
	 * Fonction permettant la sauvegarde, en transformant un Objet o en XML
	 * 
	 * @param chemin
	 * @param o
	 * @throws FileNotFoundException
	 * @throws JAXBException
	 */
	private static void sauvegardeXML(String chemin,Object o) throws FileNotFoundException, JAXBException{
		StringWriter writer = new StringWriter();
		File newFile = new File(chemin);
		newFile.getParentFile().mkdirs();

		PrintWriter file = new PrintWriter(newFile);
		
		JAXBContext context = JAXBContext.newInstance(o.getClass());
		Marshaller m = context.createMarshaller();
		m.marshal(o, writer);	
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE );
		  
		file.write(writer.toString());
		file.close();
		
	}
	
}