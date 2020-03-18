package CS544.finalProject.backEnd.dao.impl;

import CS544.finalProject.backEnd.dao.OfferingDao;
import CS544.finalProject.backEnd.models.Offering;
import CS544.finalProject.backEnd.repository.OfferingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class OfferingDaoImpl implements OfferingDao {

    @Autowired
    OfferingRepository offeringRepository;

    @Override
    public Offering save(Offering offering) {
        return null;
    }

    @Override
    public Offering update(Offering offering) {
        return null;
    }

    @Override
    public void delete(Offering offering) {

    }

    @Override
    public List<Offering> findAll(Offering offering) {
        return null;
    }

    @Override
    public Offering findById(Long id) {
        return null;
    }
}
