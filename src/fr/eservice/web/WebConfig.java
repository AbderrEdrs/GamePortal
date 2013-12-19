package fr.eservice.web;

import java.io.File;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;


@Configuration
@EnableWebMvc
@ComponentScan({"factoryfun","fr.eservice.portal","fr.eservice.web"})
public class WebConfig extends WebMvcConfigurerAdapter
{

	@Bean
	public UrlBasedViewResolver urlBasedViewResolver() {
		UrlBasedViewResolver resolver = new UrlBasedViewResolver();
		//resolver.setPrefix("src/main/webapp/www/");
		resolver.setSuffix(".jsp");
		resolver.setViewClass(JstlView.class);
		
		return resolver;
	}
	
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		System.out.println("Hello world !");
		System.out.println( new File("src/main/webapp/www").exists()  );
		registry
			.addResourceHandler("/assets/**")
			.addResourceLocations("/")
			.setCachePeriod(31556926);
		
	}
	
}