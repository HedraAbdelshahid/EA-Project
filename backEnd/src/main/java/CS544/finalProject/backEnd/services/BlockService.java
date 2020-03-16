package CS544.finalProject.backEnd.services;

import CS544.finalProject.backEnd.models.Block;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BlockService {

    Block save(Block Block);

    Block update(Block Block);

    void delete(Block Block);

    List<Block> findAll();

    Block findById(Long id);
}
