package tn.esprit.autoloc.Service;

import tn.esprit.autoloc.entities.Maintenance;

import java.util.List;

public interface IMaintenance {

    public Maintenance AddMaintenance(Maintenance m);
    public Maintenance UpdateMaintenance(Maintenance m);
    public List<Maintenance> FindAllMaintenance();
    public void deleteMaintenance(Maintenance m);

}