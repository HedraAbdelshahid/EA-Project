package CS544.finalProject.backEnd.services;

import CS544.finalProject.backEnd.models.Offering;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface OfferingService {

    Offering save(Offering offering);

    Offering update(Offering offering);

    void delete(Long id);

    List<Offering> findAll();

    Optional<Offering> findById(Long id);

    Collection<Offering> findOfferingsCourseBlock();

}
