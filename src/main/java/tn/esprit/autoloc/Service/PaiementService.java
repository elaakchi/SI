package tn.esprit.autoloc.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Repositories.PaiementRepository;
import tn.esprit.autoloc.entities.Paiement;

import java.util.List;

@Service
@AllArgsConstructor
public class PaiementService implements IPaiement {

    PaiementRepository Pp;

    @Override
    public Paiement AddPaiement(Paiement p) {
        return Pp.save(p);
    }

    @Override
    public Paiement UpdatePaiement(Paiement p) {
        return Pp.save(p);
    }

    @Override
    public List<Paiement> FindAllPaiement() {
        return Pp.findAll();
    }

    @Override
    public void deletePaiement(Paiement p) {
        Pp.delete(p);
    }
}