package portal;

import java.io.File;

import javax.servlet.MultipartConfigElement;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import fr.eservice.portal.AppConfig;
import fr.eservice.portal.servlets.*;
import fr.eservice.web.WebConfig;



public class TestServer {
	
	public static void main(String[] args) throws Exception {
		/*
    	final AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
		applicationContext.register(WebConfig.class);
		*/
    	
        ServletHolder mvcServletHolder = new ServletHolder("mvcDispatcher", new DispatcherServlet());
        mvcServletHolder.setInitParameter("contextClass", AnnotationConfigWebApplicationContext.class.getName());
        mvcServletHolder.setInitParameter("contextConfigLocation", WebConfig.class.getName());

        ServletHolder jspServletHolder = new ServletHolder("jspServlet", new org.apache.jasper.servlet.JspServlet());
        // these two lines are not strictly required - they will keep classes generated from JSP in "${javax.servlet.context.tempdir}/views/generated"
        jspServletHolder.setInitParameter("keepgenerated", "true");
        jspServletHolder.setInitParameter("scratchDir", "views/generated");

        // session has to be set, otherwise Jasper won't work
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setAttribute("javax.servlet.context.tempdir", new File("tmp"));
        // that classloader is requres to set JSP classpath. Without it you will just get NPE
        context.setClassLoader(Thread.currentThread().getContextClassLoader());
        context.addServlet(jspServletHolder, "*.jsp");
        context.addServlet(mvcServletHolder, "/");
        
        ServletHolder SignInUser = new ServletHolder(SignInUser.class);
        SignInUser.getRegistration().setMultipartConfig(new MultipartConfigElement("/Users/Abderr/Documents/workspace/GamePortal/src/main/webapp/www/images/", 1048576, 1048576, 262144));
        context.addServlet(SignInUser, "/SignInUser");
        
        ServletHolder UpdateProfilServelt = new ServletHolder(UpdateProfilServelt.class);
        UpdateProfilServelt.getRegistration().setMultipartConfig(new MultipartConfigElement("/Users/Abderr/Documents/workspace/GamePortal/src/main/webapp/www/images/", 1048576, 1048576, 262144));
        context.addServlet(UpdateProfilServelt, "/UpdateProfilServelt");
        
        context.addServlet(ServletUsers.class.getName(), "/ServletUsers");
        
        context.setResourceBase( "src/main/webapp/www/" );
        context.setInitParameter("contextClass", AnnotationConfigWebApplicationContext.class.getName());
        context.setInitParameter("contextConfigLocation", AppConfig.class.getName());
		
        final Server server = new Server(8080);
		server.setHandler(context);		
		server.start();
		server.join();
	}

}
