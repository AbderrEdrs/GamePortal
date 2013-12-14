package fr.eservice.portal.model.entite;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer idUser;

	    @Column(name = "username")
	    private String username;

	    @Column(name = "password")
	    private String password;
	    
	    @Column(name = "lastname")
	    private String lastname;

	    @Column(name = "firstname")
	    private String firstname;

	    @Column(name = "email")
	    private String email;
	    
	    @Column(name = "avatar")
	    private String avatar;
	    
	    @Column(name = "modified")
	    private Date modified;

	    /**
	     * @return the idUser
	     */
	    public int getId() {
	        return idUser;
	    }
	    
	    /**
	     * @param idUser
	     *            the idUser to set
	     */
	    public void setId(int idUser) {
	        this.idUser = idUser;
	    }

	    /**
	     * @return the lastname
	     */
	    public String getLastname() {
	        return lastname;
	    }
	    
	    /**
	     * @param lastname
	     *            the lastname to set
	     */
	    public void setLastname(String lastname) {
	        this.lastname = lastname;
	    }

	    /**
	     * @return the firstname
	     */
	    public String getFirstname() {
	        return username;
	    }
	    
	    /**
	     * @param firstname
	     *            the firstname to set
	     */
	    public void setFirstname(String firstname) {
	        this.firstname = firstname;
	    }

	    /**
	     * @return the username
	     */
	    public String getUsername() {
	        return username;
	    }

	    /**
	     * @param username
	     *            the username to set
	     */
	    public void setUsername(String username) {
	        this.username = username;
	    }

	    /**
	     * @return the password
	     */
	    public String getPassword() {
	        return password;
	    }
	    
	    /**
	     * @param password
	     *            the password to set
	     */
	    public void setPassword(String password) {
	        this.password = password;
	    }
	    
	    /**
	     * @return the email
	     */
	    public String getEmail() {
	        return email;
	    }
	    
	    /**
	     * @param dateCreation
	     *            the dateCreation to set
	     */
	    public void setEmail(String email) {
	        this.email = email;
	    }

	    /**
	     * @return the avatar
	     */
	    public String getAvatar() {
	        return avatar;
	    }
	    
	    /**
	     * @param avatar
	     *            the avatar to set
	     */
	    public void setAvatar(String avatar) {
	        this.avatar = avatar;
	    }

	    /**
	     * @return the type
	     */
	    public Date getModified() {
	        return modified;
	    }

	    /**
	     * @param type
	     *            the type to set
	     */
	    public void setModified(Date modified) {
	        this.modified = modified;
	    }
	
}
