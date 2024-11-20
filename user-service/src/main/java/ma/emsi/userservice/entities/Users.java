package ma.emsi.userservice.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity

 @NoArgsConstructor @AllArgsConstructor @Getter @Setter @Builder
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
}