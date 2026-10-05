package tn.esprit.autoloc.Repositories;

import org.springframework.boot.jackson.autoconfigure.JacksonProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.entities.Equipement;

@Repository
public interface EquipementRepository extends JpaRepository<Equipement,Long> {
}
