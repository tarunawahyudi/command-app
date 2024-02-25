package bestpracticeprogramming.component.repository;

import bestpracticeprogramming.component.model.entity.Order;
import bestpracticeprogramming.component.model.enums.Status;

public interface OrderRepository {

    void save(Order order);
    void update(Long id, Status status);
}
