package uk.co.bookingAndCollection.security;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

class AuthenticationFilter extends UsernamePasswordAuthenticationFilter {

	private AuthenticationManager authenticationManager;
	
	private static Logger debugLogger = LoggerFactory.getLogger(AuthenticationFilter.class);
	
	public AuthenticationFilter(AuthenticationManager authenticationManager) {
		this.authenticationManager = authenticationManager;
	}
	
	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
		
		try {
			
			debugLogger.debug("Attempt to authenticate a web service user ...");
			
			Authentication authentication = authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken("","", new ArrayList<>())); 
			
			return authentication;
		
		} catch (Exception e) {
			
			//return new Exception(e.getMessage());
			//throw new (e);
		}
		
		return null;
		
	}
	
	
}
