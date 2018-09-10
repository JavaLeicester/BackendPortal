package uk.co.bookingAndCollection.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

public class AuthorizationFilter extends BasicAuthenticationFilter {

	private static Logger debugLogger = LoggerFactory.getLogger(AuthorizationFilter.class);
	
	public AuthorizationFilter(AuthenticationManager authenticationManager) {
		super(authenticationManager);
		// TODO Auto-generated constructor stub
	}
	
	@Override 
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
	
	      System.out.println("doFilterInternal");			
		  debugLogger.debug("..\n Handling a new request .. \n");
		
	}
	
	
}
