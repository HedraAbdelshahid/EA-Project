package CS544.finalProject.backEnd.repository;

import CS544.finalProject.backEnd.models.Offering;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface OfferingRepository extends JpaRepository<Offering, Long> {

    @Query(value = "SELECT * FROM Offering o JOIN Course c JOIN Block b where c.id = o.course.id AND b.id = o.block.id ", nativeQuery = true)
    Collection<Offering> findOfferingsCourseBlock();
}
