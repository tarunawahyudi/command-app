package bestpracticeprogramming.component.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    private Long id;
    private String street;
    private String city;
    private String country;
    private String state;
}
