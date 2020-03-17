package CS544.finalProject.backEnd.services.impl;

import CS544.finalProject.backEnd.dao.OfferingDao;
import CS544.finalProject.backEnd.models.Offering;
import CS544.finalProject.backEnd.services.OfferingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class OfferingServiceImpl implements OfferingService {

    @Autowired
    private OfferingDao offeringDao;

    @Override
    public Offering save(Offering offering) {
        return offeringDao.save(offering);
    }

    @Override
    public Offering update(Offering offering) {
        return offeringDao.update(offering);
    }

    @Override
    public void delete(Long id) {
        offeringDao.delete(id);
    }

    @Override
    public List<Offering> findAll() {
        return offeringDao.findAll();
    }

    @Override
    public Optional<Offering> findById(Long id) {
        return offeringDao.findById(id);
    }

    @Override
    public Collection<Offering> findOfferingsCourseBlock() {
        return offeringDao.findOfferingsCourseBlock();
    }
}
