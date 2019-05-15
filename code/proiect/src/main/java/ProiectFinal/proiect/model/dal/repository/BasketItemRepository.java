package ProiectFinal.proiect.model.dal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ProiectFinal.proiect.model.dal.dao.BasketItem;

public interface BasketItemRepository extends JpaRepository<BasketItem, Long> {
}
