package fr.eservice.portal.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;

import fr.eservice.portal.model.entite.User;

public class UserDao {
	
	EntityManager em;
	EntityTransaction tx;
	
	public UserDao() {
		init();
	}
    
    public void init() {
    	
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("myapp");
            em = emf.createEntityManager();
    		
            // Intialisation de l'utilisateur admin
            
            tx = em.getTransaction();
    		tx.begin();
    		
    		User user = new User();
    		user.setFirstname("admin");
    		user.setLastname("admin");
    		user.setUsername("admin");
    		user.setPassword("admin");
    		user.setEmail("admin@localhost.com");
    		
    		
    		em.persist(user);
    		
    		tx.commit();
    }
    
    public User selectCompareId(String comp, int id) {
            try {
            	User user = (User) em.createQuery( 
                                    "select u from user u where u.id "+comp+" :ID order by u.id" + ("<".equals(comp) ? " DESC" : "")
                            )
                            .setParameter("ID", id)
                            .setMaxResults(1)
                            .getSingleResult();
                    return user;
            } catch (NoResultException e) {
                    return null;
            }
    }
    
    public User after(int id) {
            return selectCompareId(">", id);
    }
    
    public User before(int id) {
            return selectCompareId("<", id);
    }
    
    public User load(int id) {
            return em.find(User.class, id);
    }
    
    public boolean save(User user) {
    		User toSave = new User();
            toSave.setUsername( user.getUsername() );
            toSave.setLastname( user.getLastname() );
            toSave.setFirstname( user.getFirstname() );
            toSave.setPassword( user.getPassword() );
            toSave.setEmail( user.getEmail() );
            //toSave.setModified( user.getModified() );
            tx.begin();
            em.persist(toSave);
            tx.commit();
            int id = toSave.getId();
            user.setId( id );
            return id != 0;
    }
    
    public void clear() {
            em.getTransaction().begin();
            em.createQuery("delete from user").executeUpdate();
            em.getTransaction().commit();
    }
    
    public User checkUser(String username) {  
        try {
        	User u = (User) em.createQuery( 
                                "select u from user u where u.username = :username")
                        .setParameter("username", username)
                        .setMaxResults(1)
                        .getSingleResult();
        	return u;
        } catch (NoResultException e) {
                return null;
        }
    } 
    
    public User checkUserByEmail(String email) {  
        try {
        	User u = (User) em.createQuery( 
                                "select u from user u where u.email = :email")
                        .setParameter("email", email)
                        .setMaxResults(1)
                        .getSingleResult();
        	return u;
        } catch (NoResultException e) {
                return null;
        }
    }
     
    public User checkeUserToConnect(String email, String password) {  
        try {
        	User u = (User) em.createQuery( 
                                "select u from user u "
                                + "where u.email = :email "
                                		+"and u.password LIKE :password "
                                )
                        .setParameter("email", email)
                        .setParameter("password", password)
                        .setMaxResults(1)
                        .getSingleResult();
        	return u;
        } catch (NoResultException e) {
                return null;
        }
    }
}
