package portal.user;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import fr.eservice.portal.model.entite.User;

public class DemoJPA {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myapp");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		User user = new User();
		user.setFirstname("Guillaume");
		user.setLastname("Dufrene");
		user.setUsername("gdufrene");
		user.setPassword("password");
		user.setEmail("gdeufrene@gmail.com");
		
		
		em.persist(user);
		
		tx.commit();
		
		em.close();
		emf.close();
	}

}
