package ProiectFinal.proiect.model.dal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ProiectFinal.proiect.model.dal.dao.ApplicationUser;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser,Long> {
}
