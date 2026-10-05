package tn.esprit.autoloc.Service;

import tn.esprit.autoloc.entities.Reservation;

import java.util.List;

public interface IReservation {

    public Reservation AddReservation(Reservation r);
    public Reservation UpdateReservation(Reservation r);
    public List<Reservation> FindAllReservation();
    public void deleteReservation(Reservation r);

}