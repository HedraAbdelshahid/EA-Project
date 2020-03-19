package CS544.finalProject.backEnd.dao.impl;

import CS544.finalProject.backEnd.dao.BlockDao;
import CS544.finalProject.backEnd.models.Block;
import CS544.finalProject.backEnd.repository.BlockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Component
@Transactional(propagation= Propagation.MANDATORY)
public class BlockDaoImpl implements BlockDao {

    @Autowired
    BlockRepository blockRepository;

    @Override
    public Block save(Block block) {
        return blockRepository.save(block);
    }

    @Override
    public Block update(Block block) {
        return blockRepository.save(block);
    }

    @Override
    public void delete(Long id) {
        blockRepository.deleteById(id);
    }

    @Override
    public List<Block> findAll() {
        return blockRepository.findAll();
    }

    @Override
    public Optional<Block> findById(Long id) {
        return blockRepository.findById(id);
    }
}
