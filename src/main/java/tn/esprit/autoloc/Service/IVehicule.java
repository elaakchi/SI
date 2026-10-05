package tn.esprit.autoloc.Service;

import tn.esprit.autoloc.entities.Vehicule;

import java.util.List;

public interface IVehicule {

    public Vehicule AddVehicule(Vehicule v);
    public Vehicule UpdateVehicule(Vehicule v);
    public List<Vehicule> FindAllVehicule();
    public void deleteVehicule(Vehicule v);

}