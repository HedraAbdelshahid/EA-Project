package CS544.finalProject.backEnd.services.impl;

import CS544.finalProject.backEnd.dao.BlockDao;
import CS544.finalProject.backEnd.models.Block;
import CS544.finalProject.backEnd.services.BlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class BlockServiceImpl implements BlockService {

    @Autowired
    private BlockDao blockDao;

    @Override
    public Block save(Block Block) {
        return null;
    }

    @Override
    public Block update(Block Block) {
        return null;
    }

    @Override
    public void delete(Block Block) {

    }

    @Override
    public List<Block> findAll() {
        return null;
    }

    @Override
    public Block findById(Long id) {
        return null;
    }
}
