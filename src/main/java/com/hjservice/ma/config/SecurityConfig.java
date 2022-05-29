package com.hjservice.ma.config;

import com.hjservice.ma.service.Oauth2UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@RequiredArgsConstructor
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    private final Oauth2UserService oauth2UserService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .headers().frameOptions().disable()

                .and()
                .authorizeHttpRequests()
                .antMatchers("/", "/images/**", "/js/**").permitAll()
                .anyRequest().authenticated()

                .and()
                .logout().logoutSuccessUrl("/")

                .and()
                .oauth2Login()
                .userInfoEndpoint()
                .userService(oauth2UserService);

    }
}
