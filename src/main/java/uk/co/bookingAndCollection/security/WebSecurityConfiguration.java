package uk.co.bookingAndCollection.security;

import static uk.co.bookingAndCollection.security.SecurityConstants.LOG_IN_URL;
import static uk.co.bookingAndCollection.security.SecurityConstants.SIGN_UP_URL;
import static uk.co.bookingAndCollection.security.SecurityConstants.BOOKING_URL;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

import uk.co.bookingAndCollection.security.AuthenticationFilter;
import uk.co.bookingAndCollection.security.AuthorizationFilter;


@Configuration
@EnableWebSecurity
@ComponentScan("org.baeldung.security")
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	
	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		
		 httpSecurity.cors().and().csrf().disable().authorizeRequests()
	      .antMatchers(HttpMethod.POST, SIGN_UP_URL, LOG_IN_URL, BOOKING_URL).permitAll()
	      .anyRequest().authenticated()
	      .and()
	      .addFilter(new AuthenticationFilter(authenticationManager()))
	      .addFilter(new AuthorizationFilter(authenticationManager()))
	      .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
			
	}

}
