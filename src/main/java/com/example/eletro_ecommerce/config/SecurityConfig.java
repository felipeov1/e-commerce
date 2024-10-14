package com.example.eletro_ecommerce.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().permitAll() // Permite acesso a todas as rotas
                )
                .logout(logout -> logout
                        .logoutUrl("/logout") // URL do logout
                        .logoutSuccessUrl("/") // URL de redirecionamento após logout
                        .permitAll() // Permite logout para todos
                )
                .csrf(AbstractHttpConfigurer::disable); // Desativa CSRF, se necessário para API

        return http.build();
    }
}