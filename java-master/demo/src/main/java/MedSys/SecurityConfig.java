package MedSys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;


 
@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired 
	private UserDetailsService userDetailsService; 
    public void configureGlobal(AuthenticationManagerBuilder amb) throws Exception {
    	PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
		amb.userDetailsService(userDetailsService).passwordEncoder(encoder);
    	amb.inMemoryAuthentication().withUser("Admin").password("password").authorities("Admin");
		
    	
    	
    }
    @Override
    public void configure(HttpSecurity http) throws Exception {
    	
    	http.authorizeRequests().antMatchers("/index").permitAll();
    	
    	http.authorizeRequests().antMatchers("/WEB-INF/views/admin.jsp").access("hasRole ('Admin')").and()
		.formLogin().loginPage("/")
		.defaultSuccessUrl("/loginattempt")
		.loginProcessingUrl("/login")
		.failureUrl("/WEB-INF/views/recordspage.jsp")
		.usernameParameter("userName").passwordParameter("password")				
	.and()
		.logout().logoutSuccessUrl("/login?logout").permitAll(); 

}

    	
    @Bean
    WebMvcConfigurer myWebMvcConfigurer() {
        return new WebMvcConfigurerAdapter() {

            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                ViewControllerRegistration r = registry.addViewController("/login");
                r.setViewName("/WEB-INF/views/index.jsp");
            }
        };
    }

    	
    	
    }

    
