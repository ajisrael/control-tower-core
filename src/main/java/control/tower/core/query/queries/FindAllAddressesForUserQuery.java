package control.tower.core.query.queries;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class FindAllAddressesForUserQuery {

    private String userId;
}
