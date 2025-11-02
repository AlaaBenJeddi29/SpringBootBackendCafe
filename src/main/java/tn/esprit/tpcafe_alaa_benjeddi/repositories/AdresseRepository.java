package tn.esprit.tpcafe_alaa_benjeddi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpcafe_alaa_benjeddi.entities.Adresse;
@Repository
public interface AdresseRepository extends JpaRepository<Adresse, Long> {

}
