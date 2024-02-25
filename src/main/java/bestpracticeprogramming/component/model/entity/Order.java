package bestpracticeprogramming.component.model.entity;

import bestpracticeprogramming.component.model.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private Long id;
    private List<OrderItem> orderItems;
    private Payment payment;
    private User user;
    private double subtotal;
    private LocalDateTime createdAt;
    private Status status;
}