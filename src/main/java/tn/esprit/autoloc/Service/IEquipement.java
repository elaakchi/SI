package tn.esprit.autoloc.Service;

import tn.esprit.autoloc.entities.Equipement;

import java.util.List;

public interface IEquipement{

    public Equipement AddAgence(Equipement e);
    public Equipement UpdateAgence (Equipement e);
    public List< Equipement> FindAllAgence ();
    public void deleteAgence( Equipement e);

}
