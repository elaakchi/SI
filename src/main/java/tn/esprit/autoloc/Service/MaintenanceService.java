package tn.esprit.autoloc.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Repositories.MaintenanceRepository;
import tn.esprit.autoloc.entities.Maintenance;

import java.util.List;

@Service
@AllArgsConstructor
public class MaintenanceService implements IMaintenance {

    MaintenanceRepository Mm;

    @Override
    public Maintenance AddMaintenance(Maintenance m) {
        return Mm.save(m);
    }

    @Override
    public Maintenance UpdateMaintenance(Maintenance m) {
        return Mm.save(m);
    }

    @Override
    public List<Maintenance> FindAllMaintenance() {
        return Mm.findAll();
    }

    @Override
    public void deleteMaintenance(Maintenance m) {
        Mm.delete(m);
    }
}