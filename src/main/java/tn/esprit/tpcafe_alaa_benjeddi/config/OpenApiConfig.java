package tn.esprit.tpcafe_alaa_benjeddi.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI coffeeShopOpenAPI() {
        final String securitySchemeName = "bearerAuth";

        return new OpenAPI()
                .addSecurityItem(new SecurityRequirement().addList(securitySchemeName))
                .components(new Components()
                        .addSecuritySchemes(securitySchemeName,
                                new SecurityScheme()
                                        .name(securitySchemeName)
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("bearer")
                                        .bearerFormat("JWT")
                                        .description("Enter JWT token (use 'Bearer abc123' for mock)")))
                .info(new Info()
                        .title("Alaa Benjeddi's CoffeeShop API")
                        .description("""
                            <div style='font-family:Arial;'>
                            <h3>My coffeeshop Management</h3>
                            <p>Built by <strong>Alaa Benjeddi</strong> — ESPRIT Student</p>
                            <p>Full CRUD API with loyalty cards, orders, promotions, and address management.</p>
                            </div>""")
                        .version("2.0.0")
                        .contact(new Contact()
                                .name("Alaa Benjeddi")
                                .email("alaa.benjeddi@esprit.tn")
                                .url("https://github.com/alaa-benjeddi/tpcafe"))
                        .license(new License().name("MIT").url("https://opensource.org/licenses/MIT")))
                .addServersItem(new Server()
                        .url("http://localhost:8088/CoffeeShop")
                        .description("Local Development"));

    }
}