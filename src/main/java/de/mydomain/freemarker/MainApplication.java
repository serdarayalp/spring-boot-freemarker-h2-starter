package de.mydomain.freemarker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Die Annotation @SpringBootApplication ermöglicht die automatische
// Konfiguration und das Scannen von Komponenten.
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
