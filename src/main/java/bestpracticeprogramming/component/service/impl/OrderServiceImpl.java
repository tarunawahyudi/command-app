package bestpracticeprogramming.component.service.impl;

import bestpracticeprogramming.component.model.entity.Order;
import bestpracticeprogramming.component.model.enums.Status;
import bestpracticeprogramming.component.repository.OrderRepository;
import bestpracticeprogramming.component.repository.impl.OrderRepositoryImpl;
import bestpracticeprogramming.component.service.OrderService;

public class OrderServiceImpl implements OrderService {

    OrderRepository orderRepository = new OrderRepositoryImpl();
    @Override
    public void create(Order order) {
        orderRepository.save(order);
    }

    @Override
    public void update(Long id, Status status) {
        orderRepository.update(id, status);
    }
}
