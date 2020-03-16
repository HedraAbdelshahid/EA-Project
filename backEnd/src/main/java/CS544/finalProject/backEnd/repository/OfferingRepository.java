package CS544.finalProject.backEnd.repository;

import CS544.finalProject.backEnd.models.Offering;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfferingRepository extends JpaRepository<Offering, Long> {
}
