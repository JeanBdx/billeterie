package soa.jaxrslabs.billeterie;

import java.util.ArrayList;
import java.util.Date;

public class EvenementBD {
	
	private static Place place = new Place();
	private static Categorie categorie = new Categorie();
	private static InformationEvent info = new InformationEvent();
	private static Lieux lieux = new Lieux();
	private static Zone zone = new Zone();
	private static ArrayList<Categorie> ArrayCategorie = new ArrayList<>();
	private static ArrayList<Zone> zones = new ArrayList<>();
	private static ArrayList<Place> places = new ArrayList<>();
	
	public static Place getPlace() {
		return place;
	}
	public static Categorie getCategorie() {
		return categorie;
	}
	public static InformationEvent getInfo() {
		return info;
	}
	public static Lieux getLieux() {
		return lieux;
	}
	public static Zone getZone() {
		return zone;
	}
	public static ArrayList<Categorie> getArrayCategorie() {
		return ArrayCategorie;
	}
	public static ArrayList<Zone> getZones() {
		return zones;
	}
	public static ArrayList<Place> getPlaces() {
		return places;
	}
	

	
	
	
}
