package tn.esprit.tpcafe_alaa_benjeddi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpcafe_alaa_benjeddi.entities.Adresse;
import tn.esprit.tpcafe_alaa_benjeddi.entities.Article;

public interface ArticleRepository extends JpaRepository<Article,Long> {
}
