package tn.esprit.autoloc.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.entities.Agence;

import static org.hibernate.boot.model.NamedEntityGraphDefinition.Source.JPA;

@Repository
public interface AgenceRepository  extends JpaRepository<Agence, Long> {


}
