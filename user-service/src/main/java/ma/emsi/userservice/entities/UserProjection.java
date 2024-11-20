package ma.emsi.userservice.entities;


import org.springframework.data.rest.core.config.Projection;

@Projection(name = "all", types = Users.class)
public interface UserProjection {
    // ici il faut creer des getters
     String getName();
     String getEmail();

}
