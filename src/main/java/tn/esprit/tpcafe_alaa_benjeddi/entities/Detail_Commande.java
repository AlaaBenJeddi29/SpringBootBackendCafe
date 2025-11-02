package tn.esprit.tpcafe_alaa_benjeddi.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name="detail_commande")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode
public class Detail_Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idDetailCommande;
    int quantiteArticle;
    float sousTotalDetailArticle;
    float getSousTotalDetailArticleApresPromo;
    @ManyToOne
    Commande commande;
    @ManyToOne
    Article article;
}
