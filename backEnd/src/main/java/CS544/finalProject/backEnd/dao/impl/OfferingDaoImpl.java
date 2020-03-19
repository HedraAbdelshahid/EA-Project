package CS544.finalProject.backEnd.dao.impl;

import CS544.finalProject.backEnd.dao.OfferingDao;
import CS544.finalProject.backEnd.models.Offering;
import CS544.finalProject.backEnd.repository.OfferingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Component
@Transactional(propagation = Propagation.MANDATORY)
public class OfferingDaoImpl implements OfferingDao {

    @Autowired
    OfferingRepository offeringRepository;

    @Override
    public Offering save(Offering offering) {
        return offeringRepository.save(offering);
    }

    @Override
    public Offering update(Offering offering) {
        return offeringRepository.save(offering);
    }

    @Override
    public void delete(Long id) {
        offeringRepository.deleteById(id);
    }

    @Override
    public List<Offering> findAll() {
        return offeringRepository.findAll();
    }

    @Override
    public Optional<Offering> findById(Long id) {
        return offeringRepository.findById(id);
    }

    @Override
    public Collection<Offering> findOfferingsCourseBlock() {
        return offeringRepository.findOfferingsCourseBlock();
    }
}
