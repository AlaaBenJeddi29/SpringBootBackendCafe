package tn.esprit.tpcafe_alaa_benjeddi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpcafe_alaa_benjeddi.entities.Client;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
