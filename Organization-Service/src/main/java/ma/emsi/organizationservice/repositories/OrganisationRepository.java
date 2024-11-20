package ma.emsi.organizationservice.repositories;

import ma.emsi.organizationservice.entities.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource
@RepositoryRestResource(collectionResourceRel = "Organization", path = "Organization")


public interface OrganisationRepository extends JpaRepository<Organization,String> {
}
