package tn.esprit.tpcafe_alaa_benjeddi.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.esprit.tpcafe_alaa_benjeddi.enums.StatusCommande;

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


public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idCommande;
    LocalDate dateCommande;
    float totalCommande;
    @Enumerated(EnumType.STRING)
    StatusCommande statusCommande;
    @OneToMany(mappedBy = "commande")
    List<Detail_Commande> detailCommandes;
    @ManyToOne
    Client client;

}
