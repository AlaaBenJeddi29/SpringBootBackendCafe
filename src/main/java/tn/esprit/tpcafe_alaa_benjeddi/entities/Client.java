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


public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idClient;
    String nom;
    String prenom;
    LocalDate dateNaissance;
    @OneToOne
    Adresse adresse;
    @OneToOne(mappedBy = "client")
    CarteFidelite carteFidelite;
    @OneToMany(mappedBy = "client")
    List<Commande> commandes;
}
