package CS544.finalProject.backEnd.dao;

import CS544.finalProject.backEnd.models.Block;

import java.util.List;
import java.util.Optional;

public interface BlockDao {

    Block save(Block Block);

    Block update(Block Block);

    void delete(Long id);

    List<Block> findAll();

    Optional<Block> findById(Long id);
}
