package MedSys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

 
@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    protected void configure(HttpSecurity http) throws Exception {
    	http
    		.authorizeRequests()
    			.antMatchers("/index/**").permitAll()
    			.anyRequest().authenticated()
    			.and()
		    .formLogin()
				.loginPage("/")
				.defaultSuccessUrl("/loginattempt",true) 
				.loginProcessingUrl("/login")
			//	.failureUrl("/error-login")
				.permitAll();
		//		.and()
		//	.logout()
		//		.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
		//		.logoutSuccessUrl("/user-login")
		  //      .and()
		  //  .requiresChannel()
		  //  	.anyRequest()
		  //  	.requiresSecure()
    	//		.and()
   		//	.exceptionHandling().accessDeniedPage("/access-denied");
    }



    
}