package CS544.finalProject.backEnd.services.impl;

import CS544.finalProject.backEnd.dao.OfferingDao;
import CS544.finalProject.backEnd.models.Offering;
import CS544.finalProject.backEnd.services.OfferingService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OfferingServiceImpl implements OfferingService {

    @Autowired
    private OfferingDao offeringDao;

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
    public List<Offering> findAll() {
        return null;
    }

    @Override
    public Offering findById(Long id) {
        return null;
    }
}
