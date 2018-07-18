package om.az.api.config;
//import org.keycloak.adapters.springsecurity.KeycloakSecurityComponents;
//import org.keycloak.adapters.springsecurity.client.KeycloakClientRequestFactory;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Profile;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//    @EnableWebSecurity
//    @ComponentScan(basePackageClasses = {KeycloakSecurityComponents.class})
    public class LocalSecurityConfiguration extends AbstractSecurityConfiguration {
//
//        public LocalSecurityConfiguration(KeycloakClientRequestFactory requestFactory) {
//            super(requestFactory);
//        }
//
//        @Override
//        protected void configure(HttpSecurity http) throws Exception {
//            super.configure(http);
//            http.headers().frameOptions().disable();
//
//            http.csrf().disable();
//
//            http.authorizeRequests().anyRequest().anonymous();
//            http.authorizeRequests().anyRequest().permitAll();
//
//            http.antMatcher("**").authorizeRequests()
//                .anyRequest().permitAll();
//        }
}
