package com.sup.pix.infra.swagger;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info =@Info(
                title = "Sup Pix API",
                version = "0.1",
                contact = @Contact(
                        name = "Sup", email = "supapis@suppayments.com", url = "https://www.suppayments.com"
                ),
                license = @License(
                        name = "MIT", url = "https://www.apache.org/licenses/LICENSE-2.0"
                ),
                termsOfService = "${tos.uri}",
                description = "Simple instant payment API"
        )
)
public class OpenAPISecurityConfiguration {

}

