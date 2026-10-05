package tn.esprit.autoloc.Service;

import tn.esprit.autoloc.entities.Contrat;

import java.util.List;

public interface IContrat{

    public Contrat AddAgence(Contrat c);
    public Contrat UpdateAgence (Contrat c);
    public List<Contrat> FindAllAgence ();
    public void deleteAgence(Contrat c);

}
