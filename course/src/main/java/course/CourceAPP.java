package course;

import java.util.Arrays;

import java.util.Collections;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import entities.Courses;
import entities.Topic;

@SpringBootApplication 
@ComponentScan({"hello.greet","topics","courses"})
@EnableJpaRepositories("repositories")
@EntityScan(basePackages = "entities")
public class CourceAPP {
	public static void main(String args[]){
		SpringApplication.run(CourceAPP.class, args);
	}
	@Bean
	public FilterRegistrationBean corsFilter() {
	    final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
	    final CorsConfiguration config = new CorsConfiguration();
	    config.setAllowCredentials(true);
	    config.setAllowedOrigins(Collections.singletonList("http://localhost:4200"));
	    config.setAllowedHeaders(Arrays.asList("Origin", "Content-Type", "Accept"));
	    config.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "OPTIONS", "DELETE", "PATCH"));
	    source.registerCorsConfiguration("/**", config);
	    FilterRegistrationBean registration = new FilterRegistrationBean(new CorsFilter(source));
	    return registration;
	}

}
