package com.example.controllerparameterdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.jaas.memory.InMemoryConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public UserDetailsService userDetailsService(){
        var uds = new InMemoryUserDetailsManager();

        var user1  = User.withUsername("john")
                .password("12345")
                .authorities("read")
                .build();
        uds.createUser(user1);
        return uds;
    }
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http)throws Exception{
        http.httpBasic();

        http.authorizeRequests()
                .mvcMatchers("/example06")
                .authenticated()
                .anyRequest()
                .permitAll();

        http.csrf().disable();

         return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }


}
