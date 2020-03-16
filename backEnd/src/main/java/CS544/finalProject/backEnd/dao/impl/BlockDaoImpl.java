package CS544.finalProject.backEnd.dao.impl;

import CS544.finalProject.backEnd.dao.BlockDao;
import CS544.finalProject.backEnd.models.Block;
import CS544.finalProject.backEnd.repository.BlockRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BlockDaoImpl implements BlockDao {

    @Autowired
    BlockRepository blockRepository;

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
    public List<Block> findAll(Block Block) {
        return null;
    }

    @Override
    public Block findById(Long id) {
        return null;
    }
}
