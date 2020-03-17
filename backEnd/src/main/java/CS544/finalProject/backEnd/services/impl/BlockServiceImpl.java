package CS544.finalProject.backEnd.services.impl;

import CS544.finalProject.backEnd.dao.BlockDao;
import CS544.finalProject.backEnd.models.Block;
import CS544.finalProject.backEnd.services.BlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class BlockServiceImpl implements BlockService {

    @Autowired
    private BlockDao blockDao;

    @Override
    public Block save(Block block) {
        return blockDao.save(block);
    }

    @Override
    public Block update(Block block) {
        return blockDao.update(block);
    }

    @Override
    public void delete(Long id) {
        blockDao.delete(id);
    }

    @Override
    public List<Block> findAll() {
        return blockDao.findAll();
    }

    @Override
    public Optional<Block> findById(Long id) {
        return blockDao.findById(id);
    }
}
