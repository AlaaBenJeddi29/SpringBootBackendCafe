package tn.esprit.tpcafe_alaa_benjeddi.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name="adresse")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode

public class Adresse {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idAdresse;
    private String rue ;
    private String ville;
    private int codePostal;
}
