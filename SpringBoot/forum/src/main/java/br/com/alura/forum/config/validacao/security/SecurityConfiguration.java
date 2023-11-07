package br.com.alura.forum.config.validacao.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableSpringDataWebSupport
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
}
