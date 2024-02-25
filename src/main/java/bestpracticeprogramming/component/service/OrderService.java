package bestpracticeprogramming.component.service;

import bestpracticeprogramming.component.model.entity.Order;
import bestpracticeprogramming.component.model.enums.Status;

public interface OrderService {

    void create(Order order);
    void update(Long id, Status status);
}
