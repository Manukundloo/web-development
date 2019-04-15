package com.org.main.application.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter{
	
	/*@Autowired
	private AuthenticateUserService userDetailsService;
	
	@Bean
	public AuthenticationProvider authProvide(){
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setUserDetailsService(userDetailsService);
		provider.setPasswordEncoder(new BCryptPasswordEncoder());
		return provider;
		
	}*/

	@Bean
	@Override
	protected UserDetailsService userDetailsService() {
		
		List<UserDetails> users= new ArrayList<>();
		users.add(User.withUsername("Manu").password("manu").roles("USER").build());
		
		return new InMemoryUserDetailsManager(users);
		
	}
	
}
