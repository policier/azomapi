package om.az.api.config;

//import org.keycloak.adapters.KeycloakConfigResolver;
//import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
//import org.keycloak.adapters.springsecurity.authentication.KeycloakAuthenticationProvider;
//import org.keycloak.adapters.springsecurity.client.KeycloakClientRequestFactory;
//import org.keycloak.adapters.springsecurity.client.KeycloakRestTemplate;
//import org.keycloak.adapters.springsecurity.config.KeycloakWebSecurityConfigurerAdapter;
//import org.keycloak.adapters.springsecurity.filter.KeycloakAuthenticationProcessingFilter;
//import org.keycloak.adapters.springsecurity.filter.KeycloakPreAuthActionsFilter;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.config.ConfigurableBeanFactory;
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Scope;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.core.authority.mapping.SimpleAuthorityMapper;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.web.authentication.session.NullAuthenticatedSessionStrategy;
//import org.springframework.security.web.authentication.session.SessionAuthenticationStrategy;

public abstract class AbstractSecurityConfiguration {
//    extends KeycloakWebSecurityConfigurerAdapter {

//    private final KeycloakClientRequestFactory requestFactory;
    ////
    ////    public AbstractSecurityConfiguration(KeycloakClientRequestFactory requestFactory) {
    ////        this.requestFactory = requestFactory;
    ////
    ////        // pass on SecurityContext to client threads so that the async threads can access (keycloak) security information
    ////        SecurityContextHolder.setStrategyName(SecurityContextHolder.MODE_INHERITABLETHREADLOCAL);
    ////    }
    ////
    ////    @Autowired
    ////    public void configureGlobal(AuthenticationManagerBuilder authBuilder) {
    ////        final KeycloakAuthenticationProvider authProvider = keycloakAuthenticationProvider();
    ////        authProvider.setGrantedAuthoritiesMapper(new SimpleAuthorityMapper());
    ////        authBuilder.authenticationProvider(authProvider);
    ////    }
    ////
    ////    @Bean
    ////    public KeycloakConfigResolver keycloakConfigResolver() {
    ////        return new KeycloakSpringBootConfigResolver();
    ////    }
    ////
    ////    @Bean
    ////    public FilterRegistrationBean keycloakAuthenticationProcessingFilterRegistrationBean(
    ////        KeycloakAuthenticationProcessingFilter filter) {
    ////        final FilterRegistrationBean registrationBean = new FilterRegistrationBean(filter);
    ////        registrationBean.setEnabled(false);
    ////        return registrationBean;
    ////    }
    ////
    ////    @Bean
    ////    public FilterRegistrationBean keycloakPreAuthActionsFilterRegistrationBean(KeycloakPreAuthActionsFilter filter) {
    ////        FilterRegistrationBean registrationBean = new FilterRegistrationBean(filter);
    ////        registrationBean.setEnabled(false);
    ////
    ////        return registrationBean;
    ////    }
    ////
    ////
    ////    @Bean
    ////    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    ////    public KeycloakRestTemplate template() {
    ////        return new KeycloakRestTemplate(requestFactory);
    ////    }
    ////
    ////    @Bean
    ////    @Override
    ////    protected SessionAuthenticationStrategy sessionAuthenticationStrategy() {
    ////        return new NullAuthenticatedSessionStrategy();
    ////    }
}

