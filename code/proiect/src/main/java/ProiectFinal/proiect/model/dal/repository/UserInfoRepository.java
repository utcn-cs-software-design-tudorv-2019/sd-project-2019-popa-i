package ProiectFinal.proiect.model.dal.repository;


import ProiectFinal.proiect.model.dal.dao.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {
}
