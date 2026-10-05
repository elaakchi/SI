package tn.esprit.autoloc.Service;

import tn.esprit.autoloc.entities.Agence;

import java.util.List;

public interface IAgence  {

    public Agence  AddAgence(Agence a );
    public Agence UpdateAgence (Agence a);
    public List<Agence> FindAllAgence ();
    public void deleteAgence(Agence a);

}
