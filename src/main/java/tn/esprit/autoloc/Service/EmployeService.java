package tn.esprit.autoloc.Service;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Repositories.EmployeRepository;
import tn.esprit.autoloc.entities.Employe;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeService implements IEmploye {
    EmployeRepository Em;
    @Override
    public Employe AddAgence(Employe e) {
        return Em.save(e);
    }

    @Override
    public Employe UpdateAgence(Employe e) {
        return Em.save(e);
    }

    @Override
    public List<Employe> FindAllAgence() {
        return Em.findAll();
    }

    @Override
    public void deleteAgence(Employe e) {
               Em.delete(e);
    }
}
