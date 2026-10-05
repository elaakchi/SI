package tn.esprit.autoloc.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.entities.Contrat;

@Repository
public interface ContratRepository extends JpaRepository<Contrat,Long> {
}
