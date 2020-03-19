package CS544.finalProject.backEnd.services.impl;

import CS544.finalProject.backEnd.dao.BlockDao;
import CS544.finalProject.backEnd.models.Block;
import CS544.finalProject.backEnd.services.BlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class BlockServiceImpl implements BlockService {

    @Autowired
    private BlockDao blockDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Block save(Block block) {
        return blockDao.save(block);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Block update(Block block) {
        return blockDao.update(block);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void delete(Long id) {
        blockDao.delete(id);
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY, readOnly = true)
    public List<Block> findAll() {
        return blockDao.findAll();
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY, readOnly = true)
    public Optional<Block> findById(Long id) {
        return blockDao.findById(id);
    }
}
