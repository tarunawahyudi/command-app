package bestpracticeprogramming.component.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Credential {

    private Long id;
    private String username;
    private String email;
    private String password;
    private Role role;
}
