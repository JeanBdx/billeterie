package soa.jaxrslabs.beans.utilisateur;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

//import mettre le beans utilisateur

/** 
 * <b>Fonction de connexion.</b>
 * <p>
 * La connexion se caractérise par les informations suivantes :
 * <ul>
 * <li>Un identifiant unique</li>
 * <li>Un mot de passe</li>
 * </p>
 *
 *@see Utilisateur
 *
 */
public final class ConnexionForm {
	
	/**
	 * Identifiant du champs identifiant.
	 */
    private static final String CHAMP_ID  = "identifiant";
    
    /**
     * Mot de passe du champs mot de passe.
     */
    private static final String CHAMP_PASS   = "motdepasse";

    /**
     * 
     */
    private static final String ID_REF = "ID_REF";
    
    /**
     * 
     */
    private static final String PWD_REF = "PWD_REF";
    
    /**
     * 
     */
    private String              resultat;
    
    /**
     * 
     */
    private Map<String, String> erreurs      = new HashMap<String, String>();

    /**
     * @see connecterUtilisateur
     * 
     * @return Le résultat de la connexion (Succès ou Échec)
     */
    public String getResultat() {
        return resultat;
    }
    
    /**
     * @see setErreur
     * 
     * @return Retourne le message d'erreur
     */
    public Map<String, String> getErreurs() {
        return erreurs;
    }
    
    /**
     * Récupération tes données de connexion
     * 
     * @see Utilisateur
     * 
     * @param request
     * @param id_ref
     * @param mdp_ref
     * @return l'utilisateur
     */
    public Utilisateur connecterUtilisateur( HttpServletRequest request, String id_ref,String mdp_ref ) {
        /* Récupération des champs du formulaire */
        String email = getValeurChamp( request, CHAMP_ID );
        String motDePasse = getValeurChamp( request, CHAMP_PASS );
        
        Utilisateur utilisateur = new Utilisateur();
        
        /* Validation du champ email. */
        try {
            validationEmail( email,id_ref );
        } catch ( Exception e ) {
            setErreur( CHAMP_ID, e.getMessage() );
        }
        utilisateur.setEmail( email );

        /* Validation du champ mot de passe. */
        try {
            validationMotDePasse( motDePasse,mdp_ref );
        } catch ( Exception e ) {
            setErreur( CHAMP_PASS, e.getMessage() );
        }
        utilisateur.setMotDePasse( motDePasse );

        /* Initialisation du résultat global de la validation. */
        if ( erreurs.isEmpty() ) {
            resultat = "Succès de la connexion.";
        } else {
            resultat = "Échec de la connexion.";
        }

        return utilisateur;
    }

    /**
     * Valide l'adresse email saisie.
     *
     * @param email
     * @param id_ref
     * @throws Exception Si jamais le mail n'est pas valide
     */
    private void validationEmail( String email, String id_ref ) throws Exception {
        if ( email != null && !email.equals(id_ref) ) {
            throw new Exception( "Merci de saisir une adresse mail valide." );
        }
    }

    /**
     * Valide le mot de passe saisi.
     *
     * @param motDePasse
     * @param mdp
     * @throws Exception Si jamais le mot de passe est mal saisie
     */
    private void validationMotDePasse( String motDePasse, String mdp) throws Exception {
        if ( motDePasse != null && motDePasse.equals(mdp) ) {
            if ( motDePasse.length() < 3 ) {
                throw new Exception( "Le mot de passe doit contenir au moins 3 caractères." );
            }
        } else {
            throw new Exception( "Merci de saisir votre mot de passe." );
        }
    }

    /**
     * Ajoute un message correspondant au champ spécifié à la map des erreurs.
     *
     * @param champ
     * @param message
     */
    private void setErreur( String champ, String message ) {
        erreurs.put( champ, message );
    }

    /**
     * Méthode utilitaire qui retourne null si un champ est vide, et son contenu
     * sinon.
     * 
     * @param request
     * @param nomChamp
     * @return
     */
    private static String getValeurChamp( HttpServletRequest request, String nomChamp ) {
        String valeur = request.getParameter( nomChamp );
        if ( valeur == null || valeur.trim().length() == 0 ) {
            return null;
        } else {
            return valeur;
        }
    }
}