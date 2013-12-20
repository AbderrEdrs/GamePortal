package portal.user;


import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.eservice.portal.model.dao.*;
import fr.eservice.portal.model.entite.*;

public class TestUser{
        
        private static UserDao dao;
        
        @BeforeClass
        public static void initDB() {
                dao = new UserDao();
                //dao.init();
        }
        
        @Before
        public void clearUser() throws SQLException {
               // dao.clear();
        }
        
        private int saveUser(String firstName, String lastName, String username, String password, String email ) {
                User user = new User();
                user.setFirstname(firstName);
                user.setLastname(lastName);
                user.setUsername(username);
                user.setEmail(email);
                user.setPassword(password);
                dao.save(user);
                return user.getId();
        }
        
        @Test
        public void testCanSave() {
                User user = new User();
                user.setFirstname("Guillaume");
                user.setLastname("Dufrène");
                user.setUsername("gdufrene");
                user.setEmail("gdufrene@gmail.com");
                user.setPassword("password");
                
                boolean saved = dao.save(user);
                
                assertTrue( "User n'a pas été sauvegardé ?", saved );
                assertTrue( "Un identifiant doit être placé", user.getId() > 0 );
                assertTrue( "Un pseudo doit être placé", user.getUsername().length() > 0 );
        }
        
        @Test
        public void testCanLoad() {
                int id = saveUser("Guillaume", "Dufrène", "gdufrene",  "password", "gdufrene@gmail.com");
                User user = dao.load(id);
                
                assertEquals("Guillaume", user.getFirstname());
                assertEquals("Dufrène", user.getLastname());
                assertEquals("gdufrene", user.getUsername());
                assertEquals("gdufrene@gmail.com", user.getEmail());
                assertEquals("password", user.getPassword());
                assertEquals(id, user.getId());
        }
        
        @Test
        public void loadNotFound() {
                User user = dao.load( 0xCAFE);
                assertNull("Doit retourner null lorsqu'il n'existe pas d'utilisateur de cet ID", user);
        }
        
        private int[] init_BeforeAfter() {
                int[] ids = new int[] {
                		saveUser("Guillaume", "Dufrène", "gdufrene", "password", "gdufrene@gmail.com"),
                        saveUser("Jean", "Dupond", "Jdupond", "password","jdupond@gmail.com"),
                        saveUser("Christophe", "Martin", "cmartin", "password", "cmartin@gmail.com"),
                        saveUser("Julien", "Durand", "jdurand", "password", "jdurand@gmail.com")
                };
                return ids;
        }
        
        @Test
        public void testAfter() {
                int[] ids = init_BeforeAfter();
                User user;
                
                user = dao.after( ids[0] );
                assertEquals( "Dupond", user.getLastname());
                
                user = dao.after( ids[1] );
                assertEquals( "Martin", user.getLastname());
        }
        
        @Test
        public void testAfterLast() {
                int[] ids = init_BeforeAfter();
                User user;
                user = dao.after( ids[3] );
                assertNull( user );
        }
        
        @Test
        public void testBefore() {
                int[] ids = init_BeforeAfter();
                User user;
                
                user = dao.before( ids[3] );
                assertEquals( "Christophe", user.getFirstname());
                
                user = dao.before( ids[1] );
                assertEquals( "Guillaume", user.getFirstname());
        }

        @Test
        public void testBeforeFirst() {
                int[] ids = init_BeforeAfter();
                User user;
                user = dao.before( ids[0] );
                assertNull(user);
        }

}