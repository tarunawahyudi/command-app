package bestpracticeprogramming.component.model.entity;

import bestpracticeprogramming.component.model.enums.Permission;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RoleItem {
    private Long id;
    private List<Permission> permissions;
    private Menu menu;
}
