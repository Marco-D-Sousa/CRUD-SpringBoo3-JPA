package my.crud.repositories;

import my.crud.entities.OrderItem;
import my.crud.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
