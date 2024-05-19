package com.eazybites.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "customAuditImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts Service In Microservice tutorial",
				description = "API information about account service",
				license=@License(
						name = "Apache 2.0"
				),
				version = "v1"

		),
		externalDocs = @ExternalDocumentation(
				description = "Eazy bites tutorial and I am a student"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
