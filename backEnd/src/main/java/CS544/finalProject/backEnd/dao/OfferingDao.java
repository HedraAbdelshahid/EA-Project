package CS544.finalProject.backEnd.dao;

import CS544.finalProject.backEnd.models.Offering;
import CS544.finalProject.backEnd.models.Offering;

import java.util.List;

public interface OfferingDao {

    Offering save(Offering offering);

    Offering update(Offering offering);

    void delete(Offering offering);

    List<Offering> findAll(Offering offering);

    Offering findById(Long id);
}
