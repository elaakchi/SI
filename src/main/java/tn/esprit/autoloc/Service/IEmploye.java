package tn.esprit.autoloc.Service;

import tn.esprit.autoloc.entities.Employe;

import java.util.List;

public interface IEmploye{

    public Employe AddAgence(Employe e);
    public Employe UpdateAgence (Employe e);
    public List< Employe> FindAllAgence ();
    public void deleteAgence( Employe e);

}
