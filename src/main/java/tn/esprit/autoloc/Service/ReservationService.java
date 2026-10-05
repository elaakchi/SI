package tn.esprit.autoloc.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Repositories.ReservationRepository;
import tn.esprit.autoloc.entities.Reservation;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationService implements IReservation {

    ReservationRepository Rr;

    @Override
    public Reservation AddReservation(Reservation r) {
        return Rr.save(r);
    }

    @Override
    public Reservation UpdateReservation(Reservation r) {
        return Rr.save(r);
    }

    @Override
    public List<Reservation> FindAllReservation() {
        return Rr.findAll();
    }

    @Override
    public void deleteReservation(Reservation r) {
        Rr.delete(r);
    }
}