package fr.eservice.portal.servlets;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import fr.eservice.portal.model.entite.User;
import fr.eservice.portal.model.dao.UserDao;;

@MultipartConfig
public class SignInUser extends HttpServlet {


	UserDao userdao;
	public static final String CHAMP_FICHIER     = "avatar";
	public static final String URI        = "/Users/Abderr/Documents/workspace/GamePortal/src/main/webapp/www/images/";
	public static final int TAILLE_TAMPON = 10240; // 10 ko
	
	@Override
	public void init() throws ServletException {
		userdao = new UserDao();
	}

	public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
		
		String forwardTo ="",style ="",message ="" ; 
		String uri = URI;
		/*
         * Récupération des données saisies, envoyées en tant que paramètres de
         * la requête POST générée à la validation du formulaire
         */
    	String username = request.getParameter("username");
        String lastname = request.getParameter("lastname");
        String firstname = request.getParameter("firstname");
        String password = request.getParameter("password");
        String passwordConfirm = request.getParameter("passwordConfirm");
        String email = request.getParameter( "email" );
        
        Part part = request.getPart(CHAMP_FICHIER);
        String avatarName = getFileName(part);
        
        System.out.println(avatarName);

        
        /*
         * Initialisation du message à afficher : si un des champs obligatoires
         * du formulaire n'est pas renseigné, alors on affiche un message
         * d'erreur, sinon on affiche un message de succès
         */
        if ( username.trim().isEmpty() || 
        		lastname.trim().isEmpty() || 
       				password.trim().isEmpty() ||
        				firstname.trim().isEmpty() ||
        					passwordConfirm.trim().isEmpty() ||
        						email.trim().isEmpty()){
        	
        	
            message = "Erreur - Vous n'avez pas rempli tous les champs obligatoires. <br> <a href=\"/signinUser.jsp\">Cliquez ici</a> pour accéder au formulaire d'inscription.";
            forwardTo = "/signinUser.jsp";
            style = "alert alert-error";
        } else if (!passwordConfirm.equals(password)){
        	 message = "Votre confirmation de mot de passe n'est pas valide. <br> <a href=\"/signinUser.jsp\">Cliquez ici</a> pour accéder au formulaire d'inscription.";
        	 forwardTo = "/signinUser.jsp";
        	 style = "alert alert-error";
        } else if(userdao.checkUser(username) != null) {
        	message = "Le pseudo que vous avez choisi existe déjà";
	       	forwardTo = "/signinUser.jsp";
	       	style = "alert alert-error";
        }else {
            message = "Bienvenue - votre compte a été bien créé !";
       
	        /*
	         * Création du bean User et initialisation avec les données récupérées
	         */
	        User user = new User();
	        user.setUsername(username);
	        user.setLastname(lastname);
	        user.setFirstname(firstname);
	        user.setPassword(password);
	        user.setEmail(email);
	        
	        if(avatarName.trim().isEmpty()) {
	        	
	        	user.setAvatar(avatarName);
	        	/*
	        	 * Si la méthode a renvoyé quelque chose, il s'agit donc d'un champ
	        	 * de type fichier (input type="file").
	        	 */
	        	
	        	if ( avatarName != null && !avatarName.isEmpty() ) {
	        		/*
	        		 * Antibug pour Internet Explorer, qui transmet pour une raison
	        		 * mystique le chemin de l'image local à la machine du client...
	        		 * 
	        		 * Ex : C:/dossier/sous-dossier/image.png
	        		 * 
	        		 * On doit donc faire en sorte de ne sélectionner que le nom et
	        		 * l'extension de l'image, et de se débarrasser du superflu.
	        		 */
	        		avatarName = avatarName.substring( avatarName.lastIndexOf( '/' ) + 1 )
	        				.substring( avatarName.lastIndexOf( '\\' ) + 1 );
	        		writeFile(part, avatarName, uri);
	        	}
	        	
	        }
	       
	        if(!userdao.save(user)){
	        		message = "Erreur lors de la création de vote compte ";
	        		style = "alert alert-error";
	        }else
	        	style = "alert alert-success";
	      
	        /* Ajout du bean et du message à l'objet requête */
	        request.setAttribute( "user", user );
	        forwardTo = "/profil.jsp";
	        
	
        }
        request.setAttribute( "message", message );
        request.setAttribute( "style", style);
        /* Transmission à la page JSP en charge de l'affichage des données */
        this.getServletContext().getRequestDispatcher(forwardTo).forward( request, response );
    }

	/**
	 * Méthode utilitaire qui a pour unique but d'analyser l'en-tête "content-disposition",
	 * et de vérifier si le paramètre "filename"  y est présent. Si oui, alors le champ traité
	 * est de type File et la méthode retourne son nom, sinon il s'agit d'un champ de formulaire 
	 * classique et la méthode retourne null. 
	 */
	private static String getFileName( Part part ) {
	    /* Boucle sur chacun des paramètres de l'en-tête "content-disposition". */
	    for ( String contentDisposition : part.getHeader( "content-disposition" ).split( ";" ) ) {
	        /* Recherche de l'éventuelle présence du paramètre "filename". */
	        if ( contentDisposition.trim().startsWith("filename") ) {
	            /* Si "filename" est présent, alors renvoi de sa valeur, c'est-à-dire du nom de fichier. */
	        	return contentDisposition.substring( contentDisposition.indexOf( '=' ) + 1 ).trim().replace( "\"", "" );
	        }
	    }
	    /* Et pour terminer, si rien n'a été trouvé... */
	    return null;
	}
	
	/**
	 * Méthode utilitaire qui a pour but d'écrire le fichier passé en paramètre
	 * sur le disque, dans le répertoire donné et avec le nom donné.
	 */
	private void writeFile( Part part, String fileName, String uri ) throws IOException {
	    /* Prépare les flux. */
	    BufferedInputStream in = null;
	    BufferedOutputStream out = null;
	    try {
	        /* Ouvre les flux. */
	        in = new BufferedInputStream( part.getInputStream(), TAILLE_TAMPON );
	        out = new BufferedOutputStream( new FileOutputStream( new File( uri + fileName ) ),
	                TAILLE_TAMPON );
	 
	        /*
	         * Lit le fichier reçu et écrit son contenu dans un fichier sur le
	         * disque.
	         */
	        byte[] tampon = new byte[TAILLE_TAMPON];
	        int longueur;
	        while ( ( longueur = in.read( tampon ) ) > 0 ) {
	            out.write( tampon, 0, longueur );
	        }
	    } finally {
	        try {
	            out.close();
	        } catch ( IOException ignore ) {
	        }
	        try {
	            in.close();
	        } catch ( IOException ignore ) {
	        }
	    }
	}
}