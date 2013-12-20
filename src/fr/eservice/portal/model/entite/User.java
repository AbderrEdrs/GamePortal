package fr.eservice.portal.model.entite;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;



    private String username;
    private String password;
    private String lastname;
    private String firstname;
    private String email;
    private String avatar;
    private Date modified;

    /**
     *   @return the id of User
     */
    public int getId() {
		return id;
	}
    
    /**
     * @param idUser
     *            the idUser to set
     */
    public void setId(int idUser) {
        this.id = idUser;
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
        return firstname;
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
