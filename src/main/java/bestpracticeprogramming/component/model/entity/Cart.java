package bestpracticeprogramming.component.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Cart {

    private Long id;
    private List<CartItem> cartItems;
    private double total;
}
