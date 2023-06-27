package control.tower.core.query.queries;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class DoesAddressExistForUserQuery {

    private String addressId;
    private String userId;
}
