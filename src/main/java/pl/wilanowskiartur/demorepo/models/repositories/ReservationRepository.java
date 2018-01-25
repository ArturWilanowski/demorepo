package pl.wilanowskiartur.demorepo.models.repositories;

import com.sun.deploy.security.ValidationState;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.wilanowskiartur.demorepo.models.ReservationModel;

@Repository                                 //Crud - create delete, update, read
public interface ReservationRepository extends CrudRepository<ReservationModel, Integer> {




}
