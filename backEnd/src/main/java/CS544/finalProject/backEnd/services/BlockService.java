package CS544.finalProject.backEnd.services;

import CS544.finalProject.backEnd.models.Block;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface BlockService {

    Block save(Block Block);

    Block update(Block Block);

    void delete(Long id);

    List<Block> findAll();

    Optional<Block> findById(Long id);
}
