package bestpracticeprogramming.component.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem {

    private Long id;
    private Product product;
    private Integer qty;
    private double discount;
}
