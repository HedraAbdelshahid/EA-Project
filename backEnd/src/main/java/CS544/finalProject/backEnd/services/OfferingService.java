package CS544.finalProject.backEnd.services;

import CS544.finalProject.backEnd.models.Offering;
import org.springframework.stereotype.Service;

import java.util.List;
public interface OfferingService {

    Offering save(Offering offering);

    Offering update(Offering offering);

    void delete(Offering offering);

    List<Offering> findAll();

    Offering findById(Long id);
}
