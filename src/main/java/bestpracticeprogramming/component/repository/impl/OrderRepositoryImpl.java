package bestpracticeprogramming.component.repository.impl;

import bestpracticeprogramming.component.model.entity.Order;
import bestpracticeprogramming.component.model.enums.Status;
import bestpracticeprogramming.component.repository.OrderRepository;

import java.util.ArrayList;
import java.util.List;

public class OrderRepositoryImpl implements OrderRepository {

    List<Order> orders = new ArrayList<>();
    @Override
    public void save(Order order) {
        orders.add(order);
    }

    @Override
    public void update(Long id, Status status) {
        for (Order order : orders) {
            if (order.getId().equals(id)) {
                order.setStatus(status);
            }
        }
    }
}
