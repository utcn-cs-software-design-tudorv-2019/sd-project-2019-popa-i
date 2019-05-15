package ProiectFinal.proiect.model.dal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ProiectFinal.proiect.model.dal.dao.Basket;

public interface BasketRepository extends JpaRepository<Basket, Long> {
}
