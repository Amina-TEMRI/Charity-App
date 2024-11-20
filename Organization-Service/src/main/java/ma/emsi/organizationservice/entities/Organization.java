package ma.emsi.organizationservice.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Organization {
    @Id
    private String id;
    private String name;
    private String description;
    private String contactEmail;
}
