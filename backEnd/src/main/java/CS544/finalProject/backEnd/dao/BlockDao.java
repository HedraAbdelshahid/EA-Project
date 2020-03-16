package CS544.finalProject.backEnd.dao;

import CS544.finalProject.backEnd.models.Block;

import java.util.List;

public interface BlockDao {

    Block save(Block Block);

    Block update(Block Block);

    void delete(Block Block);

    List<Block> findAll(Block Block);

    Block findById(Long id);
}
