package tn.esprit.autoloc.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Repositories.ContratRepository;
import tn.esprit.autoloc.entities.Contrat;

import java.util.List;

@Service
@AllArgsConstructor
public class ContratService implements IContrat{
    ContratRepository Contrat;
    @Override
    public Contrat AddAgence(Contrat c) {
        return Contrat.save(c);
    }

    @Override
    public Contrat UpdateAgence(Contrat c) {
        return Contrat.save(c);
    }

    @Override
    public List<Contrat> FindAllAgence() {
        return Contrat.findAll();
    }

    @Override
    public void deleteAgence(Contrat c) {
        Contrat.delete(c);
    }
}

