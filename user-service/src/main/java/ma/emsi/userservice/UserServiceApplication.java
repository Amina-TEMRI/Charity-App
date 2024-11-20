package ma.emsi.userservice;

import ma.emsi.userservice.entities.Users;
import ma.emsi.userservice.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }



    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository){

        return args -> {

             userRepository.save(Users.builder().name("AMINA").email("amina@gmail.com").build());
             userRepository.save(Users.builder().name("Imane").email("imane@gmail.com").build());
             userRepository.save(Users.builder().name("sanaa").email("sanaa@gmail.com").build());


       userRepository.findAll().forEach(c->{

           System.out.println("-------------------------");
           System.out.println(c.getId());
           System.out.println(c.getName());
           System.out.println(c.getEmail());

       });
        };
    }
}
