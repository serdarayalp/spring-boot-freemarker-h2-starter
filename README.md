# Spring-Boot mit H2 und Freemarker

## pom.xml
Das H2-Paket fügt die H2-Datenbank hinzu. Das Paket spring-boot-starter-web wird für die Erstellung von Webanwendungen, einschließlich RESTful-Anwendungen, mit Spring MVC verwendet. Es verwendet Tomcat als standardmäßig eingebetteten Container. Das Paket spring-boot-starter-freemarker ist ein Starterpaket für die Erstellung von Spring MVC-Anwendungen mit FreeMarker. Der spring-boot-starter-jdbc ist ein Starter für die Verwendung von JDBC in Spring Boot.

## application.properties
Die application.properties ist die wichtigste Konfigurationsdatei von Spring Boot. Mit der Eigenschaft banner-mode schalten wir das Spring-Banner aus. Der Plattformwert wird in SQL-Initialisierungsskripten verwendet: schema-${platform}.sql und data-${platform}.sql.

Beachten Sie, dass wir die Datenquelle nicht konfigurieren; Spring konfiguriert H2 automatisch im In-Memory-Modus, wenn keine Konfigurationsdaten vorhanden sind. Wir wollten eine In-Memory-Datenbank haben, also überlassen wir Spring die automatische Konfiguration.

# Skripte
resources/schema-h2.sql erstellt die City-Tabelle und resources/data-h2.sql füllt die Tabelle mit Daten. Beide Skripte befinden sich in der Wurzel des Klassenpfads.

![UI](/images/ui.jpg)
