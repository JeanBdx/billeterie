package soa.jaxrslabs.billeterie;

/**
 * Fonction qui étend Personne pour définir la personne qui participera à l'évenement.
 * 
 * @see Personne
 * @see Reservation
 *
 */
public class Participant extends Personne {
	
	/**
	 * Composition d'une Personne Participant
	 * @param civilite Mr, Mme, Mlle
	 * @param nom Nom du participant
	 * @param prenom Prénom du participant
	 */
	public Participant(String civilite, String nom, String prenom) {
		super(civilite, nom, prenom);
	}

	public Participant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
