package CS544.finalProject.backEnd.services.impl;

import CS544.finalProject.backEnd.dao.OfferingDao;
import CS544.finalProject.backEnd.models.Offering;
import CS544.finalProject.backEnd.services.OfferingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class OfferingServiceImpl implements OfferingService {

    @Autowired
    private OfferingDao offeringDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Offering save(Offering offering) {
        return offeringDao.save(offering);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Offering update(Offering offering) {
        return offeringDao.update(offering);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void delete(Long id) {
        offeringDao.delete(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = true)
    public List<Offering> findAll() {
        return offeringDao.findAll();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = true)
    public Optional<Offering> findById(Long id) {
        return offeringDao.findById(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = true)
    public Collection<Offering> findOfferingsCourseBlock() {
        return offeringDao.findOfferingsCourseBlock();
    }
}
