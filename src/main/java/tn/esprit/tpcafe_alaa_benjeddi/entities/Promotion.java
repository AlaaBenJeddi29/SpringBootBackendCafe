package tn.esprit.tpcafe_alaa_benjeddi.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode


public class Promotion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idPromotion;
    String pourcentagePromo;
    LocalDate dateDebutPromo;
    LocalDate dateFinPromo;
    @ManyToMany(mappedBy = "promotions")
    List<Article> articles;
}
