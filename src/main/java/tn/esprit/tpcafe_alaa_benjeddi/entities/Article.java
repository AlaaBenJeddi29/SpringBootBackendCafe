package tn.esprit.tpcafe_alaa_benjeddi.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.esprit.tpcafe_alaa_benjeddi.enums.TypeArticle;

import java.util.List;

@Entity
@Table(name="article")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode
public class Article {
    @Id
    long idArticle;
    String nomArticle;
    float prixArticle;
    @Enumerated(EnumType.STRING)
    TypeArticle typeArticle;
    @OneToMany(mappedBy = "article")
    List<Detail_Commande> detailCommandes;
    @ManyToMany
    List<Promotion> promotions;
}
