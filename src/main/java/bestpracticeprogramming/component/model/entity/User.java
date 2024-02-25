package bestpracticeprogramming.component.model.entity;

import bestpracticeprogramming.component.model.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Long id;
    private String name;
    private String phoneNumber;
    private Gender gender;
    private Credential credential;
    private Address address;
    private boolean isActive;
}
