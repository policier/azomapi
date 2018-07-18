package om.az.api;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration(exclude = {
    org.springframework.boot.actuate.autoconfigure.ManagementWebSecurityAutoConfiguration.class,
    org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration.class
})
public class AzApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(AzApiApplication.class, args);
    }
}
