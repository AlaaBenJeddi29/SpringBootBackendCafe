package tn.esprit.tpcafe_alaa_benjeddi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpcafe_alaa_benjeddi.entities.Commande;
import tn.esprit.tpcafe_alaa_benjeddi.entities.Detail_Commande;

public interface Detail_CommandeRepository extends JpaRepository<Detail_Commande,Long> {
}
