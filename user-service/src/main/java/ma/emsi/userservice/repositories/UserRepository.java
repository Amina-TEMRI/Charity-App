package ma.emsi.userservice.repositories;

import ma.emsi.userservice.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// pour demarer un web service le moyen le plus simple c'est  d'utiliser repository rest ressource

//@RepositoryRestResource  // annotation fournit par spring data rest  et il permet de demander a spring  de demarer automatiquement un web service  qu permet d'acceder  a toute es methodes  qui se trouves dans cette interface  ; donc on a travailler le micro service
@RepositoryRestResource(collectionResourceRel = "Users", path = "Users")

//il suffit d'inserer qlq données dans la base de données
// le moyen le plus simple si vous voulez executer un traitement au demarage  c'est de creer un bean au demarage de type commande line runner
public interface UserRepository extends JpaRepository<Users, Long> {
}
//spring datarest utilise les conventions
//c'est a dire que vous avez utiliser  @RepositoryRestResource pour une entité qui s'appelle user donc automatiquement
//si vous vulez la liste des users ça c'est les conventions il faut taper
//on fait http://localhost:8090/1ou bien delete ça des convention