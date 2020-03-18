package CS544.finalProject.backEnd.dao;

import CS544.finalProject.backEnd.models.Offering;
import CS544.finalProject.backEnd.models.Offering;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface OfferingDao {

    Offering save(Offering offering);

    Offering update(Offering offering);

    void delete(Long id);

    List<Offering> findAll();

    Optional<Offering> findById(Long id);

    Collection<Offering> findOfferingsCourseBlock();
}
