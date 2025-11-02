package tn.esprit.tpcafe_alaa_benjeddi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpcafe_alaa_benjeddi.entities.Commande;


//@Repository
public interface CommandeRepository extends JpaRepository<Commande,Long> {
}
