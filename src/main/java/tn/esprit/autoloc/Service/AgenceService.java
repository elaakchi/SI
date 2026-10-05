package tn.esprit.autoloc.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Repositories.AgenceRepository;
import tn.esprit.autoloc.entities.Agence;

import java.util.List;
@Service
@AllArgsConstructor
public class AgenceService  implements IAgence {
    AgenceRepository agencerepo;
    @Override
    public Agence AddAgence(Agence a) {
        return agencerepo.save(a);
    }

    @Override
    public Agence UpdateAgence(Agence a) {
        return agencerepo.save(a);
    }


    @Override
    public List<Agence> FindAllAgence() {
        return  agencerepo.findAll();
    }

    @Override
    public void deleteAgence(Agence a) {
        agencerepo.delete(a);

    }
}
