package ProiectFinal.proiect.model.dal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ProiectFinal.proiect.model.dal.dao.Television;

public interface TelevisionRepository extends JpaRepository<Television, Long> {

    Television getByTelevisionId(Long televisionId);
}
