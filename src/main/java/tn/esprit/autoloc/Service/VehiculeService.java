package tn.esprit.autoloc.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Repositories.VehiculeRepository;
import tn.esprit.autoloc.entities.Vehicule;

import java.util.List;

@Service
@AllArgsConstructor
public class VehiculeService implements IVehicule {

    VehiculeRepository Vv;

    @Override
    public Vehicule AddVehicule(Vehicule v) {
        return Vv.save(v);
    }

    @Override
    public Vehicule UpdateVehicule(Vehicule v) {
        return Vv.save(v);
    }

    @Override
    public List<Vehicule> FindAllVehicule() {
        return Vv.findAll();
    }

    @Override
    public void deleteVehicule(Vehicule v) {
        Vv.delete(v);
    }
}