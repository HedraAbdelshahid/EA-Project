package CS544.finalProject.backEnd.repository;

import CS544.finalProject.backEnd.models.Block;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockRepository extends JpaRepository<Block, Long> {
}
