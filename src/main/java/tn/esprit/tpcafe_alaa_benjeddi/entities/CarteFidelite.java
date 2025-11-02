package tn.esprit.tpcafe_alaa_benjeddi.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode



public class CarteFidelite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idCarteFidelite;
    int pointsAccumules;
    LocalDate dateCreation;
    @OneToOne
    Client client;

}
