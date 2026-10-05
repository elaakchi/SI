package tn.esprit.autoloc.Service;

import tn.esprit.autoloc.entities.Paiement;

import java.util.List;

public interface IPaiement {

    public Paiement AddPaiement(Paiement p);
    public Paiement UpdatePaiement(Paiement p);
    public List<Paiement> FindAllPaiement();
    public void deletePaiement(Paiement p);

}