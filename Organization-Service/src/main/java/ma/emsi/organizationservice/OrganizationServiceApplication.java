package ma.emsi.organizationservice;

import ma.emsi.organizationservice.entities.Organization;
import ma.emsi.organizationservice.repositories.OrganisationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class OrganizationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrganizationServiceApplication.class, args);
    }


    @Bean

    CommandLineRunner init(OrganisationRepository organisationRepository) {
        return args -> {
            organisationRepository.save(Organization.builder()
                    //le id n'est pas auto increment je vais l'affaite uuid c'est un id aleatoire unique
                    .id(UUID.randomUUID().toString())
                    .name("Caritas Maroc")
                    .description("        .description(\"Organisation caritative dédiée à l'aide des plus démunis au Maroc.\")\n")
                    .contactEmail("info@caritasmaroc.org")
                    .build());
            organisationRepository.save(Organization.builder()
                    //le id n'est pas auto increment je vais l'affaite uuid c'est un id aleatoire unique
                    .id(UUID.randomUUID().toString())
                    .name("Association Al Ihsan")
                    .description("Association caritative dédiée à l'aide aux pauvres et aux nécessiteux dans tout le Maroc")
                    .contactEmail("contact@alihsan.org")
                    .build());

            organisationRepository.save(Organization.builder()
                    //le id n'est pas auto increment je vais l'affaite uuid c'est un id aleatoire unique
                    .id(UUID.randomUUID().toString())
                    .name("Fondation Maroc Entraide")
                    .description(" Fondation engagée à fournir un soutien social et éducatif aux enfants et aux familles défavorisées au Maroc.\")\n")
                    .contactEmail("info@marocentraide.org")
                    .build());

            // au demarage je veux afficher les informations je vais utiliser
            organisationRepository.findAll().forEach(o ->    // pour chaque organisation o je vais afficher p.tostring
                    System.out.println(o.toString())

            );
        };
    }
}




