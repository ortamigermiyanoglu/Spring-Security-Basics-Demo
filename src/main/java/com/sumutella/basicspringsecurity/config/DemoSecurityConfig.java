package com.sumutella.basicspringsecurity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;

/**
 * @author sumutella
 * @time 8:54 PM
 * @since 11/12/2019, Tue
 */

@Configuration
@EnableWebSecurity
public class DemoSecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        // add our users for in memory authentication

        User.UserBuilder users = User.withDefaultPasswordEncoder();

        auth.inMemoryAuthentication()
                .withUser(users.username("john").password("123").roles("EMPLOYEE"))
                .withUser(users.username("mary").password("123").roles("MANAGER", "EMPLOYEE"))
                .withUser(users.username("susan").password("123").roles("ADMIN", "EMPLOYEE"));
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                    .antMatchers("/").permitAll()  // allow public access to home page
                    .antMatchers("/employee").hasRole("EMPLOYEE")
                    .antMatchers("/manager/**").hasRole("MANAGER")
                    .antMatchers("/system/**").hasRole("ADMIN")
                .and()
                    .formLogin()
                    .loginPage("/my-login")
                    .loginProcessingUrl("/auth-user")
                    .defaultSuccessUrl("/employees")
                    .permitAll()
                .and()
                      .exceptionHandling().accessDeniedPage("/access-denied")
                .and()
                    .logout()
                    .logoutSuccessUrl("/my-login?logout").invalidateHttpSession(true)
                    .deleteCookies("JSESSIONID").permitAll(); // after logout then redirect to login page


    }
}
