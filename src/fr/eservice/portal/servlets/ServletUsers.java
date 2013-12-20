package fr.eservice.portal.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eservice.portal.model.dao.UserDao;
import fr.eservice.portal.model.entite.User;


public class ServletUsers extends HttpServlet{
	
	UserDao userdao;
	User user;
	
	@Override
	public void init() throws ServletException {
		userdao = new UserDao();
    	user = new User();
	}

	public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
		
    	String email = request.getParameter("email");
        String password = request.getParameter("password");
        String forwardTo =""; 
        String style ="";
        String message ="" ;
        
        if ( email.trim().isEmpty() || password.trim().isEmpty()){
        	
            message = "Erreur - Vous n'avez pas rempli tous les champs";
            forwardTo = "/index.jsp";
            style = "alert alert-error";
        	
        }else{
        	// si l'utilisateur est dans la bd j'affiche son profil erreur sinns
        	if(userdao.checkeUserToConnect(email,password) != null){
    	        User user = userdao.checkUserByEmail(email);
    	        request.setAttribute( "user", user );
        		forwardTo = "/profil.jsp";
        	}else {
                message = "Erreur - Vous email ou mot de passe n'est pas correct !";
                forwardTo = "/index.jsp";
                style = "alert alert-error";
        	}
        }
       
        request.setAttribute( "message", message );
        request.setAttribute( "style", style);
        /* Transmission à la page JSP en charge de l'affichage des données */
        this.getServletContext().getRequestDispatcher(forwardTo).forward( request, response );
    
	}
	
}
