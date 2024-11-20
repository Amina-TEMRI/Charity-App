package ma.emsi.userservice.entities;


import org.springframework.data.rest.core.config.Projection;

@Projection(name = "email", types = Users.class)
public interface UserProjectionEmail {
    // ici il faut creer des getters
     String getEmail();

}
